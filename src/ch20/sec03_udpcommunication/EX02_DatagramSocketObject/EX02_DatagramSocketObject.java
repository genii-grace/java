package ch20.sec03_udpcommunication.EX02_DatagramSocketObject;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class EX02_DatagramSocketObject {
	public static void main(String[] args){
		
//		DatagramSocekt 객체 생성
		DatagramSocket ds1 =null;
		DatagramSocket ds2 =null;
		DatagramSocket ds3 =null;
		DatagramSocket ds4 =null;
		
//		DatagramSocket 바인딩 
		try {
			ds1=new DatagramSocket(); // 사용 가능한 포트에 바인딩 
			ds2=new DatagramSocket(10000); // 10000번 포트에 바인딩 
			ds3=new DatagramSocket(10001, InetAddress.getByName("localhost")); // 로컬호스트의 포트에 바인딩  
			ds4=new DatagramSocket(new InetSocketAddress("localhost",10002));// 소켓정보에 포함된 포트에 바인딩 
			
		} catch (SocketException | UnknownHostException e) { e.printStackTrace();}
//		소켓 바인딩정보 확인
		System.out.println("ds1의 바인딩 정보 : "+ds1.getLocalAddress()+" : "+ds1.getLocalPort());
		System.out.println("ds2의 바인딩 정보 : "+ds2.getLocalAddress()+" : "+ds2.getLocalPort());
		System.out.println("ds3의 바인딩 정보 : "+ds3.getLocalAddress()+" : "+ds3.getLocalPort());
		System.out.println("ds4의 바인딩 정보 : "+ds4.getLocalAddress()+" : "+ds4.getLocalPort());
		
//		원격지정보 확인
		System.out.println("ds4 원격지 주소정보 : "+ds4.getInetAddress()+ " : "+ds4.getPort());
		
		try {
			ds4.connect(new InetSocketAddress("localhost", 10003)); // 4번 소켓은 포트 10003, ip localhost 로 연결됨  
		}catch(SocketException e) { e.printStackTrace(); }
		System.out.println("ds4 원격지 주소정보 : "+ds4.getInetAddress()+ " : "+ds4.getPort());
		
		ds4.disconnect();
		System.out.println();
		
//		전송할 데이터 
		byte[] data1="수신지 주소가 없는 데이터그램 패킷".getBytes();
		byte[] data2="수신지 주소가 있는 데이터그램 패킷".getBytes();
		
//		전송할 데이터를 패킷화 
		DatagramPacket dp1=new DatagramPacket(data1, data1.length);
		DatagramPacket dp2=new DatagramPacket(data2,data2.length, new InetSocketAddress("localhost", 10002)); //도착지가 10002 번 

//		소켓 커넥트 
		try {
			ds1.connect(new InetSocketAddress("localhost",10002));
			ds2.connect(new InetSocketAddress("localhost",10002));
			ds3.connect(new InetSocketAddress("localhost",10002));
			
//		dp1 : 커넥트정보 있는 소켓 + 수신지 주소 없는 패킷 
			ds1.send(dp1);
			ds2.send(dp1);
			ds3.send(dp1);
			
			ds1.disconnect();
			ds2.disconnect();
			ds3.disconnect();
			
//		dp2 : 커넥트정보 없는 소켓 + 수신지 정보 있는 패킷 
			ds1.send(dp2);
			ds2.send(dp2);
			ds3.send(dp2);
			
//			커넥트정보 있는 소켓 + 수신지 정보 있는 패킷
			ds3.connect(new InetSocketAddress("localhost", 10002));
			ds3.send(dp2);
			ds3.disconnect();
			


//			데이터 수신 
			byte[] receivedData=new byte[65508]; // 데이터 받을 배열 사이즈 정의 
			DatagramPacket dp=new DatagramPacket(receivedData, receivedData.length);
			
			for(int i=0; i<7; i++) {
				ds4.receive(dp);
				System.out.print("송신자 정보 : "+dp.getAddress()+":"+dp.getPort());
				System.out.println(" : "+new String(dp.getData()).trim());
			}
			
			System.out.println("송신 버퍼 크기 : "+ds1.getSendBufferSize());
			System.out.println("수신 버퍼 크기 : "+ds1.getReceiveBufferSize());
			
		} catch(IOException e) { e.printStackTrace(); }
			
	}

}
