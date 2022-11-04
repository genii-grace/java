package Day28;

import java.io.FileReader;

public class ExceptionTest2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader file;
		
		file = new FileReader("a.txt");
		int i;
		while((i=file.read()) != -1) {
			System.out.println((char)i);
		}
		file.close();
		

	}

}
