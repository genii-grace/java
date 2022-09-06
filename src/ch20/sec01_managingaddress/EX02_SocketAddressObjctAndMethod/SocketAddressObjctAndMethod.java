package ch20.sec01_managingaddress.EX02_SocketAddressObjctAndMethod;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class SocketAddressObjctAndMethod {

	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress ia1=InetAddress.getByName("www.google.com");
		int port =10000;
		InetSocketAddress isa1=new InetSocketAddress(port);
		InetSocketAddress isa2 = new InetSocketAddress("www.google.com",port);
		InetSocketAddress isa3=new InetSocketAddress(ia1, port);
		
		System.out.println("ia1, google InetAddress.getByName : "+ia1+"\n");		
		System.out.println("InetSocketAddress port : "+isa1+"\n");
		System.out.println("InetsocketAddress google,port : "+isa2+"\n");
		System.out.println("InetSocketAddress ia1, port : "+isa3+"\n");
		System.out.println();
		System.out.println();

	
		System.out.println("isa2.getAddress 결과 : "+isa2.getAddress()+"\n");
		System.out.println("isa2.getHostName 결과 : "+isa2.getHostName()+"\n");
		System.out.println("isa2.getPort 결과 : "+ isa2.getPort()+"\n");
	}

}
