package ch20.sec03_udpcommunication.EX03_NonConnectionUDP_Text;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class NonConnectionUDP_Text {

	public static void main(String[] args) {


		System.out.println("<<ClientA>>");
		
//		소켓 객체 생성 후 바인딩 
		DatagramSocket ds=null;
		try { ds=new DatagramSocket(10010);}
		catch(SocketException e) {e.printStackTrace();}
		
//		전송데이터 생성 후 패킷 생성
		byte[] sendData="안녕하세요".getBytes();
		DatagramPacket sendPacket =new DatagramPacket(sendData,sendData.length, new InetSocketAddress("172.30.1.8", 20010));
		
//		패킷 전송
		System.out.println("송신 데이터 : "+new String(sendPacket.getData(),0,sendPacket.getLength()));
		try {
			ds.send(sendPacket);
			
		}catch (IOException e) {e.printStackTrace();}
		
//		데이터그램 패킷 수신
		
		byte[] receivedData = new byte[65508];
		DatagramPacket receivedPacket = new DatagramPacket(receivedData,receivedData.length);
		
		try {
			ds.receive(receivedPacket);
			
		}catch (IOException e) {e.printStackTrace();}
		System.out.println("수신데이터 : "+new String(receivedPacket.getData(),0,receivedPacket.getLength()));
	}

}
