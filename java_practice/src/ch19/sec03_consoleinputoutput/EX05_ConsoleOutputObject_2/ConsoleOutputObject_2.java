package ch19.sec03_consoleinputoutput.EX05_ConsoleOutputObject_2;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class ConsoleOutputObject_2 {

	public static void main(String[] args) throws IOException {

		OutputStream os=System.out;
		byte[] byteArray1="안녕하세요".getBytes(Charset.forName("UTF-8"));
		os.write(byteArray1);
		os.write('\n');
		os.flush();
		
		byte[] byteArray2="반가워요".getBytes(Charset.defaultCharset());
		os.write(byteArray2, 6, 6);
		os.flush();
		
	}

}
