package Day03;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 숫자 2개 입력, 연산자 입력, 결과값 출력
		// 연산자 잘못 입력시 잘못된 연산자 입니다 출력
		// 나눗셈은 소숫점 첫자리까지 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자 2 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자 입력 : ");
		String op = sc.next(); //연산자를 문자로 받기 
		
		if (op.equals("+")||op.equals("-")||op.equals("*")||op.equals("/")) { //문자 비교 
			
			if(op.equals("+")) {
				System.out.printf("%d", num1+num2);
			}
			else if(op.equals("-")) {
				System.out.printf("%d", num1-num2);
				}
			else if(op.equals("*")) {
				System.out.printf("%d", num1*num2);
				}
			else {
				System.out.printf("%.1f", (double)num1/num2);
				}
			}
		else {System.out.println("잘못된 연산자 입니다."); //연산자 벗어났을 때 
		} 

		
		/*
		조건을 나누기 위해서 이중 if 를 자꾸 사용해서 단계가 늘어나는 성향이 있음
		코드 짜보고 중간에 중복일 때는 줄일 수 있는 방법을 찾아볼 것
		
		
		 강사님 풀이
		 	if(op.equals("+")) {
				System.out.printf("%d", num1+num2);
			}
			else if(op.equals("-")) {
				System.out.printf("%d", num1-num2);
				}
			else if(op.equals("*")) {
				System.out.printf("%d", num1*num2);
				}
			else if(op.equals("/")) {
				System.out.printf("%.1f", (double)num1/num2);
				}
			else {
			System.out.println("잘못된 연산자 입니다.");
			}
		 
		  */
		
	}

}
