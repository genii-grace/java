package ch20.sec01_managingaddress.EX01_InetAddressObjectAndMethod;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;


public class InetAddressObjectAndMethod {

	public static void main(String[] args) throws IOException {
		
		InetAddress ia1 = InetAddress.getByName("www.google.com");
		InetAddress ia2 = InetAddress.getByAddress(new byte[] {(byte)172,(byte)217,(byte)161,36});
		InetAddress ia3 = InetAddress.getByAddress("www.google.com",new byte[] {(byte)172,(byte)217,(byte)161,36}); 
		
		System.out.println(ia1);
		System.out.println(ia2);
		System.out.println(ia3);
		
		InetAddress ia4 = InetAddress.getLocalHost();
		InetAddress ia5 = InetAddress.getLoopbackAddress();
		
		System.out.println(ia4);
		System.out.println(ia5);
		
		InetAddress[] ia6=InetAddress.getAllByName("www.naver.com");
		System.out.println(Arrays.toString(ia6));
		System.out.println();
		
		byte[] address =ia1.getAddress();
		System.out.println(Arrays.toString(address));
		System.out.println(ia1.getHostAddress());
		System.out.println(ia1.getHostName());
		System.out.println();
		System.out.println(ia1.isReachable(1000));
		System.out.println(ia1.isLoopbackAddress());
		System.out.println(ia1.isMulticastAddress());
		
		

	}

}
