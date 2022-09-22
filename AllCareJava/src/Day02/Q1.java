package Day02;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문제1. 숫자 두개를 입력받아 산술연산 한 결과를 출력한다. 
		
		// step1. Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// step2. 입력을 안내하고 입력받아 변수에 저장 
		System.out.print("숫자 1 : ");
		int num1 = sc.nextInt();
	
		System.out.print("숫자 2 : ");
		int num2 = sc.nextInt();
		
		// step3. 출력 및 연산결과 출력 
		System.out.println("더하기 결과 값 : "+(num1+num2));
		//printf 사용해보기
		System.out.printf("더하기 결과 값(prinf) : %d\n",num1+num2);
		System.out.println("빼기 결과 값 : "+(num1-num2));
		System.out.println("곱하기 결과 값 : "+(num1*num2));
		System.out.println("나누기 결과 값 : "+(num1/num2));
		System.out.println("나머지 연산자 결과 값 : "+(num1%num2));


	}

}
