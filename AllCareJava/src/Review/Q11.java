package Review;

import java.util.Scanner;

public class Q11 {

	static void sq(int a) {
		System.out.println();
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	static void tri(int a) {
		System.out.println();
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	static void ttri(int a) {
		System.out.println();
		for(int i=1; i<=a; i++) {
			for(int j=a-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		System.out.println();
	}

	static void pyra(int a) {
		System.out.println();
		for(int i=1; i<=a; i++) {
			for(int j=a-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	static void dia(int a) {
		System.out.println();
		for(int i=1; i<=(a/2)+1; i++) {
			for(int j=(a/2); j>=i; j--) {
				System.out.print(" ");
			}

			for(int j=1; j<2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=a/2; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}

			for(int j=(a/2)+2; j>2*i-2; j--) {
				System.out.print("*");
			}System.out.println();
		}System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("1.직사각형\n2.정직삼각형\n3.역직삼각형\n4.피라미드\n5.다이아몬드\n6.종료\n");
			System.out.print("모양을 선택하세요 : ");
			int sel = sc.nextInt();

			while(sel<=0||sel>=7) {
				System.out.println("잘못된 입력입니다. 다시 선택하세요.");
				sel = sc.nextInt();
			}
			
			if(sel==6) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();


			if(sel==1) {
				sq(num);
			}
			else if(sel==2) {
				tri(num);
			}
			else if(sel==3) {
				ttri(num);
			}
			else if(sel==4) {
				pyra(num);
			}
			else {
				dia(num);
			}
			
		}
	}

}
