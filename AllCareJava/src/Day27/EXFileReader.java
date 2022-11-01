package Day27;

import java.io.FileReader;
import java.util.Scanner;

public class EXFileReader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("읽어들일 파일명을 입력하세요 : ");
		FileReader fr = new FileReader("/Users/jgraceyeom/workspace/java_practice/AllCareJava/");
		
		int i;
		while((i=fr.read())!= -1) {
			System.out.print((char)i);
		}

		fr.close();
	}

}
