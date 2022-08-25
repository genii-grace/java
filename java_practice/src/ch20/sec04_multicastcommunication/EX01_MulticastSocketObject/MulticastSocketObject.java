package ch20.sec04_multicastcommunication.EX01_MulticastSocketObject;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.rmi.UnknownHostException;

public class MulticastSocketObject {

	public static void main(String[] args) {
		
//		멀티캐스트 소켓객체 생성
		MulticastSocket mcs1 = null;
		MulticastSocket mcs2 = null;
		MulticastSocket mcs3 = null;
		
		try {
			mcs1 = new MulticastSocket();
			mcs2 = new MulticastSocket(10000); //10000포트로 들어오는데이터 받음
			mcs3 = new MulticastSocket(new InetSocketAddress("172.30.1.56", 10000));
		} catch (IOException e) {e.printStackTrace();}
		
		System.out.println(mcs1.getLocalSocketAddress());
		System.out.println(mcs2.getLocalSocketAddress());
		System.out.println(mcs3.getLocalSocketAddress());
		System.out.println();
		
//		TTL
		try {
			System.out.println("TIME TO LIVE : "+mcs1.getTimeToLive());
			mcs1.setTimeToLive(50);
			System.out.println("TIME TO LIVE : "+mcs1.getTimeToLive());
		}catch (IOException e) {
			e.printStackTrace();
			}
		System.out.println();
		
//			join, leave, send, receive
		try {
			mcs1.joinGroup(InetAddress.getByName("234.234.234.234"));
			mcs2.joinGroup(InetAddress.getByName("234.234.234.234"));
			mcs3.joinGroup(InetAddress.getByName("234.234.234.234"));
			
//			전송데이터, 전송패킷 생성 
			byte[] sendData = "안녕하세요".getBytes();
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,InetAddress.getByName("234.234.234.234"), 10000);
			
//			전송
			mcs1.send(sendPacket);
			
//			수신할 배열 생성
			byte[] receivedData;
			DatagramPacket receivedPacket;
			
			receivedData = new byte[65508];
			receivedPacket = new DatagramPacket(receivedData, receivedData.length);
			mcs2.receive(receivedPacket);
			System.out.println("mcs2 가 수신한 데이터 : "+new String(receivedPacket.getData()).trim());
			System.out.println("송신지 : "+receivedPacket.getSocketAddress());

			
			receivedData = new byte[65508];
			receivedPacket = new DatagramPacket(receivedData, receivedData.length);
			mcs3.receive(receivedPacket);
			System.out.println("mcs3 이 수신한 데이터 : "+new String(receivedPacket.getData()).trim());
			System.out.println("송신지 : "+receivedPacket.getSocketAddress());
			
			
		} catch(UnknownHostException e) {
			e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
				}
	}

}
