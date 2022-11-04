package Day28;

import java.io.FileReader;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader file;
		
		try {
			file = new FileReader("a.txt");
			int i;
			while((i=file.read()) != -1) {
				System.out.println((char)i);
			}
			file.close();
		}
		catch(Exception e) {
			System.out.println("예외처리 루틴 : "+e+" 파일이 존재하지 않습니다.");
		}
		finally { //마지막에 무조건 실행됨 , 예외 발생여부에 개의치않음 
			System.out.println("하이");
			
		}
	}

}
