package ch19.sec03_consoleinputoutput.EX01_ConsoleInputObject_1;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputObject_1 {

	public static void main(String[] args) throws IOException {
		
		InputStream is =System.in;
		int data;
		while((data=is.read()) != '\n') {
			System.out.println("읽은 데이터 : "+(char)data + "남은 바이트 수 : "+is.available());
		}
		
		System.out.println(data);
		System.out.println(is.read());
	}

}
