package ch19.sec01_fileandcharset.EX06_ByteArrayToFromString;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ByteArrayToFromString {

	public static void main(String[] args) throws UnsupportedEncodingException {


		byte[] array1="안녕".getBytes();
		byte[] array2="방가".getBytes(Charset.defaultCharset());
		byte[] array3="땡큐".getBytes(Charset.forName("MS949"));
		byte[] array4="감사".getBytes(Charset.forName("UTF-8"));
		
		System.out.println(array1.length);
		System.out.println(array2.length);
		System.out.println(array3.length);
		System.out.println(array4.length);
		
		String str1=new String(array1);
		String str2=new String(array2, Charset.defaultCharset());
		String str3=new String(array3, Charset.forName("MS949"));
		String str4=new String(array4, Charset.forName("UTF-8"));
		String str5=new String(array4, Charset.forName("MS949"));
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
	}

}
