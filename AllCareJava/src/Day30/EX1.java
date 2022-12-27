package Day30;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class EX1 {

	public static void main(String[] args)throws UnknownHostException, MalformedURLException {
		// TODO Auto-generated method stub

		InetAddress address = InetAddress.getLocalHost();
		System.out.println("Local Computer name : "+address.getHostName());
		System.out.println("Local Computer IP Address : "+address.getHostAddress());
		InetAddress[] all=InetAddress.getAllByName("www.naver.com");
		for(int i=0; i<all.length; i++) {
			System.out.println(all[i]);
		}
		URL starbucks = new URL("https://www.starbucks.co.kr/index.do");
		
		System.out.println("프로토콜 : "+starbucks.getProtocol());
		System.out.println("포트 : "+starbucks.getPort());
		System.out.println("호스트 : "+starbucks.getHost());
		System.out.println("파일(경로 포함) : "+starbucks.getFile());
		System.out.println("전체 URL : "+starbucks.toExternalForm());
		
	}

}
