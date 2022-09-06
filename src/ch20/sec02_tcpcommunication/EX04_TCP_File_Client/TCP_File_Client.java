package ch20.sec02_tcpcommunication.EX04_TCP_File_Client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP_File_Client {

	public static void main(String[] args) {

		
		System.out.println("<<Client>>");
		
		try {
			Socket socket=new Socket(InetAddress.getByName("localhost"), 10000);
			System.out.println("Server에 접속 완료");
			System.out.println("접속 Server 주소 : "+socket.getInetAddress()+" : "+socket.getPort());

//			데이터 전송준비
			DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
			
//			파일 읽어오기 	
			File file=new File("chap20/ImgFileUsingTCP.jpg");
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis  = new BufferedInputStream(fis);
			System.out.println("파일전송 : "+file.getName());
			
//			파일 이름 전송
			dos.writeUTF(file.getName());
			
//			파일 전송
			byte[] data=new byte[2048];
			int len;
			while( (len=bis.read(data))!=-1) {
				dos.writeInt(len);
				dos.write(data,0,len);
				dos.flush();
			}
			dos.write(-1);
			dos.flush();
			
//			서버 피드백 받기 
			String str=dis.readUTF();
			System.out.println("Server응답 : "+str);
		}
		catch (UnknownHostException e) {}
		catch (IOException e) {e.printStackTrace();}
		
	}

}
