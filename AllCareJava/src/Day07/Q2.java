package Day07;

import java.util.Random;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 크기가 10인 배열, 1~10 랜덤수
		 * 배열 안에 가장 큰 값이 몇번째 인덱스에 있는지
		 * 가장 큰 값이 같은 값이 있으면 인덱스 같이 출력
		 *
		 * 1. 배열선언
		 * 2. 랜덤수 입력
		 * 3. 최대값 구하기 
		 * 4. 최대값 중복시 인덱스 
		 *   
		 *   랜덤수 10 40 1 3 30 40
		 */

		Random r = new Random();
		//1. 배열선언 
		int[] num=new int[10];

		//2. 랜덤수 입력
		for(int i=0; i<num.length; i++) {
			num[i]=r.nextInt(11);
			System.out.print(num[i]+" ");
		}
		System.out.println();

		
		
		
		int max=num[0];
		String index="";
		int count=0;
		
		// 3. 최대값구하기 
		for(int i=0; i<num.length; i++) {
			if(max-num[i]<0) {
				max=num[i];
			}
		
		}
		// 4. 중복인덱스 출력하기 
		for(int i=0; i<num.length; i++) {
			if(max-num[i]==0) {
				count++;
				index+=i+" ";
			}
		}

		System.out.println("최대값 : "+max);
		System.out.println("index : "+index+", 최대값 중복 : "+(count-1));
	}
}
