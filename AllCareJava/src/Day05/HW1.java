package Day05;

import java.util.Random;

public class HW1 {

	public static void main(String[] args) {
		
		/*
		 * 문자 A (65) 에서 랜덤 0~25 값을 추출한 다음 더하기 연산을 해서 랜덤한 문자를 만듦
		 * 랜덤문자 10개를 만들고
		 * 10개 문자를 더하기 연산해서 하나의 문자열로 만듦
		 * 10개 문자도 출력, 문자열도 출력 
		 * 
		 * 
		 */
		
		Random r = new Random();
		
		char a='A';
		
		System.out.println("랜덤수 : ");
		for(int i=0; i<10; i++) {
			int ranNum = r.nextInt(26);
			System.out.print((char)(ranNum+a)+" ");
				
			}
			
		}
	}


