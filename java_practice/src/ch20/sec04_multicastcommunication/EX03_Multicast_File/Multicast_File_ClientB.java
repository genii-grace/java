package ch20.sec04_multicastcommunication.EX03_Multicast_File;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class Multicast_File_ClientB {

	public static void main(String[] args) {

		System.out.println("<<Client B>>");
		
//		멀티캐스팅 주소지생성 
		InetAddress multicastAddress = null;
		try { multicastAddress = InetAddress.getByName("234.234.234.234");}
		catch (UnknownHostException e) {e.printStackTrace();} 
		
//		멀티캐스트 소켓 생성
		int multicastPort = 10000;
		MulticastSocket mcs = null;
		try { mcs = new MulticastSocket(multicastPort);}
		catch (IOException e) {e.printStackTrace();}
		
//		멀티캐스트 가입
		try { mcs.joinGroup(multicastAddress);}
		catch (IOException e) {e.printStackTrace();}

//		파일명 수신
		byte[] receivedData = new byte[65508];
		DatagramPacket receivedPacket =null;
		try { receivedPacket = new DatagramPacket(receivedData, receivedData.length);
		mcs.receive(receivedPacket);}
		catch(IOException e) {e.printStackTrace();}
		String fileName = new String(receivedPacket.getData()).trim();
		System.out.println("파일 수신 시작...");
		
//		파일 수신
		File file = new File("chap20/test/"+fileName);
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream(file));
		}catch(FileNotFoundException e) {e.printStackTrace();}
		
//		시작태그부터 끝태그까지 파일 쓰기
		String startSign = "/start";
		String endSign = "/end";
		receivedData = new byte[65508];
		receivedPacket = new DatagramPacket(receivedPacket.getData(), receivedPacket.getLength());
		
		try {mcs.receive(receivedPacket);
		
			if(new String(receivedPacket.getData(),0,receivedPacket.getLength()).equals(startSign)) 
			{ while (true) 
			{mcs.receive(receivedPacket);
				if(new String(receivedPacket.getData(),0,receivedPacket.getLength()).equals(endSign)) 
					break; 
				bos.write(receivedPacket.getData(),0,receivedPacket.getLength());
				bos.flush();
			}
			}
			}catch (IOException e) {e.printStackTrace();}
		
		try {bos.close();}
		catch (IOException e) {e.printStackTrace();}
		System.out.println("파일 수신 완료 ");
		
//		그룹해제
		try { mcs.leaveGroup(multicastAddress);}
		catch (IOException e) {e.printStackTrace();}
		
//		전송할 데이터 및 패킷 생성 후 전송
		byte[] sendData = "Client B 파일 수신 완료".getBytes();
		DatagramPacket sendPacket = new DatagramPacket(sendData,sendData.length, multicastAddress, multicastPort);
		try { mcs.send(sendPacket); }
		catch(IOException e) {e.printStackTrace();}
		
		mcs.close();
		
		
		
		
		
		
	}

}
