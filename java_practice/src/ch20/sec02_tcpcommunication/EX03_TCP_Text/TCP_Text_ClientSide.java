package ch20.sec02_tcpcommunication.EX03_TCP_Text;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP_Text_ClientSide {

	public static void main(String[] args) {
		System.out.println("<<Client>>");
		try {
			Socket socket= new Socket(InetAddress.getByAddress(new byte[]{(byte)172,30,1,43}),10000);
			
			System.out.println("Server에 접속 완료");
			System.out.println("접속 Server 주소 : "+socket.getInetAddress()+" : "+socket.getPort());
			
			DataInputStream dis=new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
			
			dos.writeUTF("안녕하세요");
			dos.flush();
			String str=dis.readUTF();
			System.out.println("Server : "+str);
		} catch (UnknownHostException e) {}
		catch (IOException e) {e.printStackTrace();}
	}

}
