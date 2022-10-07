package Day12;

import java.util.Scanner;

public class Q1_no20 {
	
	static String strInput() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		//String str = sc.next();
		
		return sc.next();
	}
	
	static int selectNum() {

		Scanner sc = new Scanner(System.in);
		System.out.print("1.짝수 2.홀수 선택하세요 : ");
		//int num = sc.nextInt();
		
		return sc.nextInt();
		
	}
	
	static String result (String str, int num){
	
		String strResult ="";
		
		if(num==1) {

			for(int i=0; i<str.length(); i++) {

				if(i%2==0) {//짝수 인덱스 일 때 

				strResult += str.charAt(i);
				
				}
				
			}

		}
		
		else if (num==2) {
			for(int i=0; i<str.length(); i++) {

				if(i%2!=0) {//짝수 인덱스 일 때 

				strResult += str.charAt(i);
				
				}
				
			}
			
		}
		else {
			strResult="잘못된 입력입니다.";
		}
		
		return strResult;
	}

	public static void main(String[] args) {

		/*
		 * 문자열 입력
		 * 1.짝수 2.홀수 선택 -> 잘못된 입력
		 * 짝수인덱스 문자 출력 
		 * 홀수인덱스 문자 출력 
		 * 
		 * 메서드 3개 이상
		 * 메인에 문장 1개 
		 */

		System.out.println(result(strInput(),selectNum()));
		

	}

}
