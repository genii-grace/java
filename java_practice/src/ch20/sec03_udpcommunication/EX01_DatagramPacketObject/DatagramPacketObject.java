package ch20.sec03_udpcommunication.EX01_DatagramPacketObject;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class DatagramPacketObject {

	public static void main(String[] args) {
		
		
		byte[] buf = "UDP-데이터그램패킷".getBytes();
		
		DatagramPacket dp1 = new DatagramPacket(buf, buf.length);
		DatagramPacket dp2 = new DatagramPacket(buf,4,buf.length-4);
		
		DatagramPacket dp3=null;
		DatagramPacket dp4=null;
		
		try {
			dp3=new DatagramPacket(buf, buf.length,InetAddress.getByName("localhost"), 10000);
			dp4= new DatagramPacket(buf, 4, buf.length-4,InetAddress.getByName("localhost"), 10000);
		}catch (UnknownHostException e) {e.printStackTrace();}
		
		DatagramPacket dp5 = new DatagramPacket(buf, buf.length, new InetSocketAddress("localhost",10000));
		DatagramPacket dp6 = new DatagramPacket(buf,4,buf.length-4,new InetSocketAddress("localhost",10000));
		
		
		System.out.println("dp1 원격지 IP : "+dp1.getAddress());
		System.out.println("dp1 원격지 Port : "+dp1.getPort());
		System.out.println();
		
		System.out.println("dp3 원격지 IP : "+dp3.getAddress());
		System.out.println("dp3 원격지 Port : "+dp3.getPort());
		System.out.println("dp3 Socket 정보 : "+dp3.getSocketAddress());
		System.out.println();
		
		System.out.println("dp1 포함 데이터 : "+new String(dp1.getData()));
		System.out.println("dp2 포함 데이터 : "+new String(dp2.getData()));
		System.out.println("dp2 포함 데이터 옵셋 적용 : "+new String(dp2.getData(),dp2.getOffset(),dp2.getLength()));
		System.out.println();
		
		dp1.setData("안녕하세요".getBytes());
		System.out.println("dp1 변경된 데이터 : "+new String(dp1.getData()));
		
		dp2.setData("반갑습니다.".getBytes(),6,6);
		System.out.println("dp2 변경된 데이터 : "+new String(dp2.getData(),dp2.getOffset(),dp2.getLength()));
		
	}

}
