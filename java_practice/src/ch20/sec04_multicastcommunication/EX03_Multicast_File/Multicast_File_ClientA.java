package ch20.sec04_multicastcommunication.EX03_Multicast_File;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class Multicast_File_ClientA {

	public static void main(String[] args) {

		System.out.println("<< Client A >>");
		
//		멀티캐스팅 주소지생성 
		InetAddress multicastAddress = null;
		try { multicastAddress = InetAddress.getByName("234.234.234.234");}
		catch (UnknownHostException e) {e.printStackTrace();} 
		
//		멀티캐스트 소켓 생성
		int multicastPort = 10000;
		MulticastSocket mcs = null;
		try { mcs = new MulticastSocket(multicastPort);}
		catch (IOException e) {e.printStackTrace();}
		
		
//		파일 로딩
		File file = new File("chap20/ImgFileUsingMulticast.jpg");
		BufferedInputStream bis = null;
		try {bis = new BufferedInputStream(new FileInputStream(file));}
		catch (IOException e) {e.printStackTrace();}
		
//		파일 이름 전송 
		DatagramPacket sendPacket =null;
		String fileName = file.getName();
		sendPacket = new DatagramPacket(fileName.getBytes(), fileName.length(), multicastAddress, multicastPort);
		try { mcs.send(sendPacket);}
		catch(IOException e) {e.printStackTrace();}
		System.out.println(fileName+" 파일 전송 시작 ");
		
//		시작사인 전송
		String startSign = "/strat";
		sendPacket = new DatagramPacket(startSign.getBytes(), startSign.length(), multicastAddress , multicastPort);
		try {mcs.send(sendPacket);}
		catch (IOException e) {e.printStackTrace();}
		
//		실제 파일 전송 
		int len;
		byte[] filedata=new byte[2048];
		try {
		while ( (len=bis.read(filedata))!= -1) {
			sendPacket = new DatagramPacket(filedata, filedata.length,multicastAddress, multicastPort);
			mcs.send(sendPacket);
		}
		}catch (IOException e) {e.printStackTrace();}
		
//		끝 사인 전송 
		String endSign="/end";
		sendPacket = new DatagramPacket(endSign.getBytes(),endSign.length(), multicastAddress, multicastPort);
		try {mcs.send(sendPacket);}
		catch(IOException e) {e.printStackTrace();}
		
//		멀티그룹 가입 
		try {mcs.joinGroup(multicastAddress);}
		catch(IOException e) {e.printStackTrace();}
		
//		전송파일 받기
		byte[] receivedData = new byte[65508];
		DatagramPacket receivedPacket =null;
		try { receivedPacket = new DatagramPacket(receivedData, receivedData.length);
		mcs.receive(receivedPacket);}
		catch(IOException e) {e.printStackTrace();}
		System.out.println("보내온 주소 : "+receivedPacket.getSocketAddress());
		System.out.println("보낸 내용 : "+new String( receivedPacket.getData()).trim());
		
//		멀티캐스트 그룹 해제
		try { mcs.leaveGroup(multicastAddress);}
		catch (IOException e) {e.printStackTrace();}
		
		mcs.close();
		
		
	
	}

}
