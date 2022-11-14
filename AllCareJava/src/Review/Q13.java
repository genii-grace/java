package Review;

import java.util.Scanner;

class Gcd{
	int a;
	int b;
	int r=1;

	
	int runGCD(int a, int b) {
		while(r>0) {
		this.r=a%b;
		a=b;
		b=r;
		}
		return a;
	}
}

class Lcm{
	Gcd gcd = new Gcd();
	
	int runLCM(int a, int b) {
		
		int g=gcd.runGCD(a, b);
		
		int i=a/g;
		int j=b/g;
		int result=i*j*g;
		
		return result;
	}
}

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//숫자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자 2 : ");
		int num2 = sc.nextInt();
		
		//최대 공약수 
		Gcd gcd = new Gcd();
		System.out.println(num1+"과 "+num2+"의 최대공약수는 "+gcd.runGCD(num1, num2)+" 입니다.");
		
		Lcm lcm = new Lcm();
		System.out.println(num1+"과 "+num2+"의 최소공배수는 "+lcm.runLCM(num1, num2)+" 입니다.");
		
		
	}

}
