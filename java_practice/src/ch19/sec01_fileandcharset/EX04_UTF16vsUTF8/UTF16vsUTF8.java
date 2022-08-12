package ch19.sec01_fileandcharset.EX04_UTF16vsUTF8;

import java.io.UnsupportedEncodingException;

public class UTF16vsUTF8 {

	public static void main(String[] args) throws UnsupportedEncodingException {

		byte[] b1="abc".getBytes("UTF-16");
		System.out.println("abc를 UTF-16으로 바이트 변환 : "+b1.length);
		
		byte[] b2="abc".getBytes("UTF-8");
		System.out.println("abc를 UTF-8로 바이트 변환 : "+b2.length);

		System.out.print("UTF-16 코드 : ");
		for(byte b:b1) {System.out.printf("%02X ", b);}
		System.out.println();
		
		System.out.print("UTF-8 코드 : ");
		for(byte b:b2) {System.out.printf("%02X ", b);}
		System.out.println();
		
		System.out.println("UTF-16 문자열로 변환 : "+new String(b1,"UTF-16"));
		System.out.println("UTF-8 문자열로 변환 : "+new String(b2,"UTF-8"));
		
		System.out.println();
		System.out.println();
		
		byte[] b3="가나다".getBytes("UTF-16");
		System.out.println("가나다를 UTF-16으로 바이트 변환 : "+b3.length);
		
		byte[] b4="가나다".getBytes("UTF-8");
		System.out.println("가나다를 UTF-8로 바이트 변환 : "+b4.length);

		System.out.print("UTF-16 코드 : ");
		for(byte b:b3) {System.out.printf("%02X ", b);}
		System.out.println();
		
		System.out.print("UTF-8 코드 : ");
		for(byte b:b4) {System.out.printf("%02X ", b);}
		System.out.println();
		
		System.out.println("UTF-16 문자열로 변환 : "+new String(b3,"UTF-16"));
		System.out.println("UTF-8 문자열로 변환 : "+new String(b4,"UTF-8"));
	}

}
