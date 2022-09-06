package ch19.sec03_consoleinputoutput.EX02_ConsoleInputObject_2;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputObject_2 {

	public static void main(String[] args) throws IOException {

		InputStream is =System.in;
		
		int data;
		while( (data=is.read())!='\n'){
			System.out.print((char)data);
		}
		
		is.read();
		System.out.println();
		System.out.println();
		
		byte[] byteArray1= new byte[100];
		int count1=is.read(byteArray1);
		for(int i=0; i<count1; i++) {
			System.out.print((char)byteArray1[i]);
		}
		System.out.println(" : count = "+count1);
		System.out.println();
		
		byte[] byteArray2=new byte[8];
		int offset=3;
		int length=5;
		int count2=is.read(byteArray2, offset, length);
		for(int i=0; i<offset+count2; i++) {
			System.out.print((char)byteArray2[i]);
			
		}
		System.out.println(": count ="+count2);
	}

}
