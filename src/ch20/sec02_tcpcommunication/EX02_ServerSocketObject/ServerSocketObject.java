package ch20.sec02_tcpcommunication.EX02_ServerSocketObject;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketObject {

	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket1 = new ServerSocket();
		ServerSocket serverSocket2 = new ServerSocket(20000);
		
		System.out.println("serversocket1은 바인딩되어있나요? : "+serverSocket1.isBound());
		System.out.println("serversocket1은 바인딩되어있나요? : "+serverSocket2.isBound());
		System.out.println();

		serverSocket1.bind(new InetSocketAddress(InetAddress.getLocalHost(),10000));
		System.out.println("serversocket1은 바인딩되어있나요? : "+serverSocket1.isBound());
		System.out.println("serversocket1은 바인딩되어있나요? : "+serverSocket2.isBound());
		System.out.println();
	
		for(int i=0; i<10000; i++) { // i<65536 이지만 화면출력 관계상 수치낮춤 
			try {
				ServerSocket serverSocket = new ServerSocket(i);
			}catch(IOException e) {
				System.out.println(i+"번째 포트 사용중 ..args.");
		}
	}
		
		System.out.println();
		
		serverSocket1.setSoTimeout(2000);
		try {
			Socket socket=serverSocket1.accept();
		}catch (IOException e) {
			System.out.println(serverSocket1.getSoTimeout()+"ms시간이 지나 접속대기를 종료합니다.");
		}
}
}
