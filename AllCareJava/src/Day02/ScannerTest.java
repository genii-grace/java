package Day02;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		// 키보드 입력받는 Scanner 사용해보기 
		// Scanner 는 java.util 불러와야 함 
		
		Scanner sc = new Scanner(System.in);//스캐너객체 생성
		
		System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt(); // 정수입력을 변수 a 에 받아서 저장, 엔터를 입력하면 입력이 완료됨 
		System.out.println("입력하신 숫자는 "+a+"입니다."); // 입력받은 정수 출력 
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.next(); //문자열을 변수 str에 받아서 저장, 엔터를 입력하면 입력이 완료됨 
		System.out.println("입력하신 문자열은 \""+str+"\"입니다."); // 입력받은 문자열출력 
	
		

		
	}

}
