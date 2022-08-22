package ch20.sec02_tcpcommunication.EX03_TCP_Text;

import java.io.IOException;
import java.net.ServerSocket;

public class TCP_Text_PortNumberTest {

	public static void main(String[] args) {
		
		for(int i=0; i<40000;i++) {
			try {
				ServerSocket serverSocket=new ServerSocket(i);
			}catch(IOException e) {
				System.out.println(i+"번째 포트 사용중");
			}
		}
	}

}
