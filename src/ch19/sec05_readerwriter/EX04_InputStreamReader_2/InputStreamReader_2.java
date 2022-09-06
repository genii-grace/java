package ch19.sec05_readerwriter.EX04_InputStreamReader_2;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_2 {

	public static void main(String[] args) {
		
		try(InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");){
				int data;
				while( (data=isr.read())!='\n') {
					System.out.print((char)data);
				}
		}catch (IOException e) {}
				
	}

}
