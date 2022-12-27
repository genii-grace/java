package Day30;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ExClientTCP {

	public static void main(String[] args) throws Exception {
	
		String server = "172.30.1.25";
		int port=7777;
		
		Socket c = new Socket(server, port);
		InputStream is = c.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		
		for(int i=1; i<=10; i++) {
			int j=dis.read();
			System.out.println("서버로부터 받은 데이터  : "+j+" 출력 ");
		}
		c.close();
	}

}
