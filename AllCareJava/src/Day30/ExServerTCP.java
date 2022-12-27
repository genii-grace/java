package Day30;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ExServerTCP {

	public static void main(String[] args) throws Exception {
		
		int port = 7777;
		int times=10;
		ServerSocket ss=new ServerSocket(port);
		
		int i=1;
		while(i<=times) {
			Socket s= ss.accept();
			//accept로 소켓만 생성되었고 접속 이후에 밑에 내용 돌아감 
			OutputStream os = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			for(int j=1; j<=10; j++) {
				dos.write(j);
			}
			s.close();
			++i;
		}
		ss.close();
	}

}
