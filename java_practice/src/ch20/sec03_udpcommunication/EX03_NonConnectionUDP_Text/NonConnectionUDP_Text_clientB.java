package ch20.sec03_udpcommunication.EX03_NonConnectionUDP_Text;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class NonConnectionUDP_Text_clientB {

	public static void main(String[] args) {

		System.out.println("<<Client B>>");
		
		DatagramSocket ds=null;
		
		try {
			ds=new DatagramSocket(20010);
		}catch (SocketException e) {e.printStackTrace();}
		
		byte[] receivedData = new byte[65508];
		DatagramPacket receivedPacket = new DatagramPacket(receivedData, receivedData.length);
		
		try {
			ds.receive(receivedPacket);
	
		}catch(IOException e) {e.printStackTrace();}
		System.out.println("수신데이터 : "+new String(receivedPacket.getData(),0,receivedPacket.getLength()));
		
		byte[] sendData = "반갑습니다".getBytes();
		DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,receivedPacket.getSocketAddress());
		
		System.out.println("송신데이터 : "+new String(sendPacket.getData(),0,sendPacket.getLength()));
		
		try {
			ds.send(sendPacket);
		}catch (IOException e) {e.printStackTrace();}
		
		
	}

}
