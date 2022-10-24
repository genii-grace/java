package Day21;

import java.util.Scanner;

class Control{
		Scanner sc=new Scanner(System.in);
		
	int input(int a) {
		System.out.print("숫자 입력 : ");
		a=sc.nextInt();
		return a;		
	}
	
	double intput(double a) {
		System.out.print("숫자 입력 : ");
		a=sc.nextDouble();
		return a; 
	}
	
	void output(int result) {
		System.out.println("결과 값 : "+result);
	}
	
	void output(double result) {
		System.out.println("결과 값 : "+result);
	}
	
	int plus(int a, int b) {
		return a+b;
	}
	
	double plus(double a, double b) {
		return a+b;
	}
	
	int minus(int a, int b) {
		return a-b;
	}
	
	double minus(double a, double b) {
		return a-b;
	}
	
	int div(int a, int b) {
		return a/b;
	}
	
	double div(double a, double b) {
		return a/b;
	}
	
	int multi(int a, int b) {
		return a*b;
	}
	
	double multi(double a, double b) {
		return a*b;
	}
	
	
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Control c=new Control();
		int num1=0;
		int num2=0;
		
		while(true) {
		
			System.out.println("1.정수연산 2.실수연산 3.종료");
			num1=sc.nextInt();
			if(num1==1||num1==2) {
				System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기");
				num2=sc.nextInt();
				if(num2==1) {//더하기 
					if(num1==1) {//정수 
						c.output(c.plus(c.input(0),c.input(0)));
					}
					else {//실수
						c.output(c.plus(c.intput(0.0),c.intput(0.0)));
					}
				}
				else if(num2==2) {//빼기 
					if(num1==1) {//정수 
						c.output(c.minus(c.input(0),c.input(0)));
					}
					else {//실수
						c.output(c.minus(c.intput(0.0),c.intput(0.0)));
					}
					
				}
				else if(num2==3) {//곱하기 
					if(num1==1) {//정수 
						c.output(c.multi(c.input(0),c.input(0)));
					}
					else {//실수
						c.output(c.multi(c.intput(0.0),c.intput(0.0)));
					}
					
					
				}
				else if(num2==4) {//나누기 
					if(num1==1) {//정수 
						c.output(c.div(c.input(0),c.input(0)));
					}
					else {//실수
						c.output(c.div(c.intput(0.0),c.intput(0.0)));
					}
					
				}
				else {
					System.out.println("잘못된 입력입니다.");
				}
				
			}
			else if(num1==3) {
				System.out.println("종료");
				break;
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		
	}

}
