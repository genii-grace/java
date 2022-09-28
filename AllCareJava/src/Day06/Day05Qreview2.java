package Day06;

import java.util.Scanner;

public class Day05Qreview2 {

	public static void main(String[] args) {

		// 최대공약수 : 나머지값이 0인 경우
		// 최소공배수 : 큰 수를 최대공약수로 나눈 값과 나머지 수를 곱해줌
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 입력 : ");
		int a = sc.nextInt(); 
		System.out.print("숫자2 입력 : ");
		int b = sc.nextInt(); 
		
		//최대공약수 구하기
		int c=a;
		int d=b;
		
		int gcd=0;
		int lcm=0;
		
		int temp = 1;
		
		while(temp!=0) { //sol. temp>0
			temp=a%b;
			a=b;
			b=temp;
			
		}
		gcd=a;
		System.out.println("최대공약수 : "+ gcd);
		
		lcm=c*d/gcd;
		System.out.println("최소공배수 : "+lcm);
	}

}
