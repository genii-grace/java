package ch20.sec04_multicastcommunication.EX02_Multicast_Text;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class Multicast_Text_ClientA {
	
	static void receiveMessage(MulticastSocket mcs) {
		byte[] receivedData;
		DatagramPacket receivedPacket;
		receivedData = new byte[65508];
		receivedPacket = new DatagramPacket(receivedData,receivedData.length);
		
		try { mcs.receive(receivedPacket);}
		catch(IOException e) {e.printStackTrace();}
		
		System.out.println("보내온 주소 : "+receivedPacket.getSocketAddress());
		System.out.println("보낸 내용 : "+new String(receivedPacket.getData()).trim());
	}

	public static void main(String[] args) {
		
		System.out.println("<<Client A>>");
		
//		멀티캐스팅 주소지 생성 
		InetAddress multicastAddress=null;
		try { multicastAddress = InetAddress.getByName("234.234.234.234");}
		catch (UnknownHostException e) {e.printStackTrace();}
		
//		멀티캐스트 소켓 생성
		int multicastPort=10000;
		MulticastSocket mcs=null;
		try { mcs=new MulticastSocket(multicastPort); }
		catch (IOException e) {e.printStackTrace();}
		
//		멀티캐스트 그룹에 가입
		try { mcs.joinGroup(multicastAddress);}
		catch(IOException e) {e.printStackTrace();}
	
//		전송 데이터 및 패킷 생성
		byte[] sendData = "안녕하세요 ClientA".getBytes();
		DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,multicastAddress,multicastPort);
		
//		전송
		try {mcs.send(sendPacket);}
		catch (IOException e) {e.printStackTrace();}
		
//		패킷 수신 - 수신내용 출력 메서드 정의 
		receiveMessage(mcs);
		receiveMessage(mcs);
		
//		멀티캐스트 그룹 해제
		try { mcs.leaveGroup(multicastAddress); }
		catch (IOException e) {e.printStackTrace();}
		
//		소켓 닫기
		mcs.close();
	}
	

}
