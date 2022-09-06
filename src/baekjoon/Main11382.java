package baekjoon;

import java.util.Scanner;

public class Main11382 {

// 예시에서 정민이가 더하는 숫자는 127보다 큰숫자이므로 Int 가 아닌 long 으로 잡아준다 
	public static void main(String[] args) {
//		런타임에러 

		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		System.out.println(a+b+c);
		sc.close();

	}
}

