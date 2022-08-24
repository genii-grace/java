package ch20.sec03_udpcommunication.EX03_ConnectionUDP_File_A;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class ConnectionUDP_File_A {

	public static void main(String[] args) {
		
		System.out.println("<<Client A>>");
		
//		소켓 생성 및 바인딩
		DatagramSocket ds=null;
		try {ds=new DatagramSocket(10000); 
//		원격지와 커넥트 
			ds.connect(new InetSocketAddress("localhost",20000));}
		catch (SocketException e) {e.printStackTrace();}
		
//		파일 로딩
		File file=new File("chap20/ImgFileUsingUDP.jpg");
		BufferedInputStream bis = null;
		try { bis = new BufferedInputStream(new FileInputStream(file));}
		catch (FileNotFoundException e) {e.printStackTrace();}
		
//		파일이름, 사인, 파일 전송, 사인
		DatagramPacket sendPacket = null;
		
//		1. 파일 이름 보내기 
		String fileName= file.getName();
		sendPacket = new DatagramPacket(fileName.getBytes(),fileName.getBytes().length);
		try {ds.send(sendPacket);}
		catch (IOException e) {e.printStackTrace();}
		
//		2. 파일 전송 시작을 알리는 사인 전송
		String startSign="/start";
		sendPacket = new DatagramPacket(startSign.getBytes(),startSign.getBytes().length);
		try {ds.send(sendPacket);}
		catch (IOException e) {e.printStackTrace();}
		
//		3. 파일 쪼개서 전송
		int len;
		byte[] filedata=new byte[2048];
		try { 
			while( (len=bis.read(filedata))!=-1) { //2048단위로 쪼개서 읽은 파일이 끝날때까지 
				sendPacket = new DatagramPacket(filedata,len); // 2048만큼 쪼갠데이터를 패킷에 저장 
				ds.send(sendPacket); // 패킷 보내기 
			}
		}catch (IOException e) {e.printStackTrace();}
		
//		4. 전송끝 싸인
		String endSign="/end";
		sendPacket = new DatagramPacket(endSign.getBytes(),endSign.getBytes().length);
		try { ds.send(sendPacket); }
		catch (IOException e) {e.printStackTrace();}
		
//		데이터그램 텍스트 패킷 수신
		byte[] receivedData = new byte[655508];
		DatagramPacket receivedPacket = new DatagramPacket(receivedData, receivedData.length);
		try { ds.receive(receivedPacket);} 
		catch (IOException e) {e.printStackTrace();}
		
		System.out.println("수신 데이터 : "+new String (receivedPacket.getData()).trim());
		
	}

	}


