package ch20.sec03_udpcommunication.EX03_ConnectionUDP_File_B;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class ConnectionUDP_File_B {
	
	public static void main(String[] args) {
		
		System.out.println("<<Client B>>");
		
//		DatagramSocket 생성  및 바인딩
		DatagramSocket ds =null;
		try { ds=new DatagramSocket(20000);
//		원격지커넥트
		ds.connect(new InetSocketAddress("localhost",10000));
		}catch (SocketException e) {e.printStackTrace();}
		
//		패킷 수신할 데이터 배열, 패킷 생성 
		byte[] receivedData = null;
		DatagramPacket receivedPacket = null;
		
//		파일 이름 수신
		receivedData = new byte[65508];
		receivedPacket = new DatagramPacket(receivedData, receivedData.length);
		try {ds.receive(receivedPacket);}
		catch(IOException e) {e.printStackTrace();}
		String fileName=new String(receivedPacket.getData(),0,receivedPacket.getLength());
		
//		수신한 파일이름으로 만들어질 파일명 지정
		File file=new File("chap20/"+fileName);
		BufferedOutputStream bos=null;
		try {bos = new BufferedOutputStream(new FileOutputStream(file));}
		catch ( FileNotFoundException e) {e.printStackTrace();}
		System.out.println("수신 파일 이름 : "+fileName);
		
//		시작태그, 끝태그 기준으로 파일 수신
		String startSign="/start";
		String endSign="/end";
		receivedData = new byte[65508]; // 수신할 데이터 저장할 배열 
		receivedPacket = new DatagramPacket(receivedData, receivedData.length); // 데이터랑 데이터 길이만큼 받기 
		try {
			ds.receive(receivedPacket); // 수신한 패킷 복사 
		if(new String(receivedPacket.getData(),0,receivedPacket.getLength()).equals(startSign)) //stratSign 같은경우 
			{
				while(true) {
					ds.receive(receivedPacket); // 패킷 복사 
					if(new String(receivedPacket.getData(),0,receivedPacket.getLength()).equals(endSign))
							break; //endSign 과 같으면 파일쓰기 정지 (bos.close 로 빠져나가기) 
					bos.write(receivedPacket.getData(),0,receivedPacket.getLength()); //파일 쓰기 
					bos.flush();
				}	
			
			}
		bos.close();
		
		}catch(IOException e) {e.printStackTrace();}
		
//		파일 전송 완료 메세지 응답
		byte[] sendData="파일 수신 완료".getBytes();
		DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length);
		try { ds.send(sendPacket); }
		catch (IOException e) {e.printStackTrace();}
		
		
		
	}	
}
