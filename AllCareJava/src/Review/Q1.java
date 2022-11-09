package Review;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//숫자 두개를 입력받음
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 : ");
		int a = sc.nextInt();
		
		System.out.print("숫자2 : ");
		int b = sc.nextInt();
		//더하기 빼고 곱하기 나누기 나머지연산자로 연산한 결과값 출력 
		System.out.println("더하기 결과 값 : "+(a+b));
		System.out.println("빼기 결과 값 : "+(a-b));
		System.out.println("곱하기 결과 값 : "+(a*b));
		System.out.println("나누기 결과 값 : "+(a/b));
		System.out.println("나머지 연산자 결과 값 : "+(a%b));

	}

}
