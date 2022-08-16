package ch19.sec05_readerwriter.EX03_InputStreamReader_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReader_1 {

	public static void main(String[] args) {
		
		File inputStreamReader = new File("chap19/InputStreamReader.txt");
		
		try(Reader reader=new FileReader(inputStreamReader)) {
			int data;
			while( (data=reader.read())!= -1) {
				System.out.print((char)data);
			}
		}catch(IOException e) {}
		
		System.out.println();
		
		try(InputStream is = new FileInputStream(inputStreamReader);
				InputStreamReader isr = new InputStreamReader(is, "UTF-8");){
			int data;
			while( (data=isr.read())!= -1) {
				System.out.print((char)data);
				
			}
		}catch (IOException e) {}
	}

}
