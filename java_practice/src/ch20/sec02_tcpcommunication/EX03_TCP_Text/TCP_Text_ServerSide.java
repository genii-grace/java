package ch20.sec02_tcpcommunication.EX03_TCP_Text;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Text_ServerSide {

	public static void main(String[] args) {
		System.out.println("<<Sever>>");

		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(10000); // 포트번호 10000인 서버소켓 생성
		
		}catch(IOException e) {
			System.out.println("해당포트를 열 수 없습니다.");
			System.exit(0); //프로그램 종료
		}
		System.out.println("- Clinet 접속 대기 ... ");
		try {
			Socket socket = serverSocket.accept(); //연결이 수락되면 소켓을 생성
			System.out.println("Client 연결 수락");
			System.out.println("접속한 Client 주소 : "+socket.getInetAddress()+" : "+socket.getPort());
			
			DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
			
			String str=dis.readUTF();
			System.out.println("clinet : "+str);
			
			
			dos.writeUTF("어서오세요");
			dos.flush();
			
		}catch (IOException e) {}
	}

}
