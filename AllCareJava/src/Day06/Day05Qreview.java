package Day06;

import java.util.Random;

public class Day05Qreview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 랜덤수 10개 받아서 랜덤수 10개, 문자로 전환해서 문자열 출력 
		 */

		Random r =new Random();
		char ch = 'A';
		String strNum="";	


		System.out.print("랜덤수 : ");
	
		for(int i=0; i<10; i++) {
			strNum += ((char)(r.nextInt(26)+ch));
			
	
		}
		System.out.println();
		System.out.println(strNum);
		
		
			
		}
}
