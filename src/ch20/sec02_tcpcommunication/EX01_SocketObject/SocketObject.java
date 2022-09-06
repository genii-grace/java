package ch20.sec02_tcpcommunication.EX01_SocketObject;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketObject {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
//		소켓 생성
		Socket socket1 = new Socket(); //원격지 정보 없음
		Socket socket2 = new Socket("www.naver.com",80); //원경지 host  name(ip정보 획득 가능), 포트번호
		Socket socket3 = new Socket(InetAddress.getByName("www.naver.com"), 80); // InetAddress.getByName 로 네이버 정보 가져오기 
//		Socket socket4 = new Socket("www.naver.com", 80, InetAddress.getLocalHost(), 10000);
//		Socket socket5 = new Socket(InetAddress.getByName("www.naver.com"), 80, InetAddress.getLocalHost(), 10000);

/*		socket4,5를 실행하면 BindException : Can't assign requested address 오류가 난다.
 * 		공통점으로 유추할 수 있는 부분은 로컬호스트 정보와 포트번호를 지정한 부분이 문제인듯 하다.
 *		구글링 결과, 확인한 에러는 바인딩할 임시포트가 부족할 때 발생한다고 한다.
 */
//		메서드 
		System.out.println("socket1의 초기상태 : "+socket1.getInetAddress()+ ":"+socket1.getPort()); 
		socket1.connect(new InetSocketAddress("www.naver.com", 80));
		System.out.println("socket1에 원격지정보 connect : "+socket1.getInetAddress()+ " : " +socket1.getPort());	
		System.out.println();
		
		System.out.println("socket2 정보 : "+socket2.getInetAddress()+ " : "+socket2.getPort());
		System.out.println("socket2의 LocalAddress와 Por 정보 : "+socket2.getLocalAddress()+" : "+socket2.getLocalPort());
		System.out.println(socket2.getLocalSocketAddress());
		System.out.println();
		
		System.out.println("socket3의 localAddress 정보 : "+socket3.getLocalAddress()+ " : "+ socket3.getLocalPort());
		
		System.out.println("socket2의 송수신 버퍼사이즈 : "+socket2.getSendBufferSize()+","+socket2.getReceiveBufferSize());
		
	}

}
