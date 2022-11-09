package Review;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//숫자 두개 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자2 : ");
		int num2 = sc.nextInt();
		
		//연산자 입력 
		System.out.print("연산자 : ");
		String cal = sc.next();
		
		if(cal.equals("+")) {
			System.out.println("결과값 : "+(num1+num2)+" 입니다.");
		}
		else if(cal.equals("-")) {
			System.out.println("결과값 : "+(num1-num2)+" 입니다.");
		}
		else if(cal.equals("*")) {
			System.out.println("결과값 : "+(num1*num2)+" 입니다.");
		}
		else if(cal.equals("/")) {
			System.out.printf("결과값 : %.1f 입니다.\n",(double)num1/(double)num2);
		}
		// 나눗셈은 소숫점 첫자리까지 출력 
		//연산자 잘못된 입력입니다.
		else {
			System.out.println("잘못된 연산자 입니다.");
		}
	}

}
