package Review;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//숫자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		//짝수 출력
		System.out.print("짝수 : ");
		for(int i=1; i<num; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		//홀수 출력 
		System.out.print("홀수 : ");
		for(int i=1; i<num; i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}

}
