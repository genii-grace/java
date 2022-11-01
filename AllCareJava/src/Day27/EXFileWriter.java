package Day27;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EXFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요 : ");
		String source = sc.next();

		char input[] = new char[source.length()];
		source.getChars(0,  source.length(),input, 0);
		
		System.out.println("파일명을 입력하세요 : ");
		String s= sc.next();
		
		FileWriter fw = new FileWriter(s);
		fw.write(input);
		fw.close();
		System.out.println(s+" 파일이 생성되었습니다.");
		
		
	}

}
