package Day10;

import java.util.Scanner;

/*
 * 연산자 입력
 * 연산자 잘못 입력되면 잘못된 연산자
 * 나눗셈은 소숫점 첫자리 
 * 숫자1 입력
 * 숫자2 입력
 * 결과값 출력
 * 
 * 더하기 : 주고 받고
 * 곱하기 : 주고 안받고
 * 빼기 : 안주고 받고
 * 나누기 : 안주고 안받고  
 */

public class Q1 {
	
	static int a=0;
	static int b=0;
	
	static int add (int num1, int num2) {
		return num1+num2;
	}
	
	static int multi () {
		
		return a*b;
		
	}
	
	static void sub(int num1, int num2) {
		System.out.printf("%d",num1-num2);
	}
	
	static void div() {
		System.out.printf("%.1f",(double)a/b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 1 : ");
		int num1=sc.nextInt();
		
		System.out.print("숫자 2 : ");
		int num2=sc.nextInt();
		
		System.out.print("연산자 : ");
		String op=sc.next();
		
		while(!(op.equals("+")||op.equals("-")||op.equals("*")||op.equals("/"))) {
			System.out.println("잘못된 연산자 입니다. 다시 입력해주세요.");
			op=sc.next();
			
		}
		
		System.out.print("결과값 : ");
		
		if(op.equals("+")) {
			System.out.println(add(num1,num2));
			}
		else if(op.equals("-")) {
			sub(num1,num2);
		}
		
		else if(op.equals("*")) {
			a=num1;
			b=num2;
			System.out.println(multi());
		}
		
		else if(op.equals("/")) {
			a=num1;
			b=num2;
			div();
		}
		
		else {
			System.out.println("잘못된 연산자 입니다.");
		}
		
	}

}
