package ch20.sec04_multicastcommunication.EX03_Multicast_TextTest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class Multicast_text_clientA_notjoinfirst {

	public static void main(String[] args) {
		System.out.println("<<Client A>>");
		
//		주소지 설정
		InetAddress multicastInetAddress= null;
		try {multicastInetAddress = InetAddress.getByName("234.234.234.234");}
		catch (UnknownHostException e) {e.printStackTrace();}
		int multicastPort = 10000;
		
//		소켓생성
		MulticastSocket mcs =null;
		try {mcs= new MulticastSocket(multicastPort);}
		catch (IOException e) {e.printStackTrace();}
		
//		데이터 및 패킷 생성, 패킷 전
		byte[] sendData = "안녕하세요 clientA".getBytes();
		DatagramPacket sendPacket =null;
		try { sendPacket =new DatagramPacket(sendData, sendData.length,multicastInetAddress, multicastPort);
		mcs.send(sendPacket);}
		catch (IOException e) {e.printStackTrace();}
		System.out.println("데이터 전송 완료"); 
		
//		멀티캐스트 그룹 가입
		try { mcs.joinGroup(multicastInetAddress);}
		catch (IOException e) {e.printStackTrace();}
		
//		데이터 받을 배열 및 패킷 생성
		byte[] receivedData = new byte[65508];
		DatagramPacket receivedPacket = null;
		
		try{ receivedPacket = new DatagramPacket(receivedData, receivedData.length);

//		패킷 수신 
		mcs.receive(receivedPacket);
		}
		catch (IOException e) {e.printStackTrace();}
		System.out.println("받은 데이터 : "+ new String(receivedPacket.getData()).trim());

		//		그룹 해제 
		try { mcs.leaveGroup(multicastInetAddress);}
		catch (IOException e) {e.printStackTrace();}
		
//	 	소켓 닫기 
		mcs.close();
		

	}

}
