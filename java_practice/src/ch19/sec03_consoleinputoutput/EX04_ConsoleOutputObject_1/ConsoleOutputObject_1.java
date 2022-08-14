package ch19.sec03_consoleinputoutput.EX04_ConsoleOutputObject_1;
import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutputObject_1 {

	public static void main(String[] args) throws IOException {
	
		OutputStream os=System.out;
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\n');
		os.flush();
		
		byte[] byteArray1="Hello!".getBytes();
		os.write(byteArray1);
		os.write('\n');
		os.flush();
		
		byte[] byteArray2="Better the last smile than the first laughter".getBytes();
		os.write(byteArray2, 7,8);
		os.flush();
		
	
	}

}
