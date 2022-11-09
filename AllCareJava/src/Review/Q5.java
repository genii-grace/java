package Review;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//숫자 하나 입력받음
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		System.out.print(num+"의 약수는 ");
		//약수 : 나머지 연산 값 0인 것 
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				System.out.print(i+",");
			}
		}
		System.out.print(num+" 입니다.");

	}

}
