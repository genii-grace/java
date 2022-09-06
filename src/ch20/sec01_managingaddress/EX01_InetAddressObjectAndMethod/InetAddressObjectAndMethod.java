package ch20.sec01_managingaddress.EX01_InetAddressObjectAndMethod;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;


public class InetAddressObjectAndMethod {

	public static void main(String[] args) throws IOException {
		
		InetAddress ia1 = InetAddress.getByName("www.google.com");
		InetAddress ia2 = InetAddress.getByAddress(new byte[] {(byte)172,(byte)217,(byte)161,36});
		InetAddress ia3 = InetAddress.getByAddress("www.google.com",new byte[] {(byte)172,(byte)217,(byte)161,36}); 
		
		System.out.println("InetAddress.getByName (ia1) 결과 : " + ia1);
		System.out.println("InetAddress.getByAddress 결과 : "+ia2);
		System.out.println("InetAddress.getByAddress 결과 : "+ia3);
		System.out.println();
		
		InetAddress ia4 = InetAddress.getLocalHost();
		InetAddress ia5 = InetAddress.getLoopbackAddress();
		
		System.out.println(ia4);
		System.out.println(ia5);
		
		InetAddress[] ia6=InetAddress.getAllByName("www.naver.com");
		System.out.println("InetAddress.getAllByName 결과 : " + Arrays.toString(ia6));
		System.out.println();
		
		
		
		System.out.println();
		byte[] address =ia1.getAddress();
		System.out.println("Arrays.toString() 결과 : "+Arrays.toString(address)); //142.250.76.132
		System.out.println("getHostAddress() 결과 : "+ia1.getHostAddress());
		System.out.println("getHostName() 결과 : "+ ia1.getHostName());
		System.out.println();
		System.out.println("isReachable 결과 : "+ia1.isReachable(1000));
		System.out.println("isLoopbackAddress 결과 : "+ia1.isLoopbackAddress());
		System.out.println("isMulticastAddress 결과 : "+ia1.isMulticastAddress());
		
		

	}

}
