package baekjoon;

import java.util.Scanner;

public class Main1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * 첫줄에 a와 b 입력,
		 * a가 b 보다 크면 > 출력
		 * a가 b 보다 작으면 < 출력
		 * a와 b 가 같으면 == 출력 
		 */

		
		//입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close(); //콘솔 입력 마감 
		
		if (a>b) {
			System.out.print(">");
		}
		else if (a<b) {
			System.out.print("<");
		}
		else {
			System.out.print("==");
		}
	}

}
