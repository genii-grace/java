package Day06;

import java.util.Random;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 3개의 변수에 1~9까지 랜덤수 부여
		 * 중복안됨
		 */
		
		Random r =new Random();
		
		int num1, num2, num3=0;
		

		num1=r.nextInt(9)+1;
		num2=r.nextInt(9)+1;
		num3=r.nextInt(9)+1;
	

		while(num1==num2||num1==num3||num2==num3) {
			num1=r.nextInt(9)+1;
			num2=r.nextInt(9)+1;
			num3=r.nextInt(9)+1;
		}

		
		System.out.println(num1+", "+num2+", "+num3);
		
		
	}

}