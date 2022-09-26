package Day04;

import java.util.Scanner;

public class Day03_hw1sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 입력받기 
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int inputNum=sc.nextInt();
		
		System.out.print(inputNum+"의 약수는 ");
		
		//2. 입력받은 숫자만큼 반복 
		for(int i=1; i<inputNum; i++) { //입력받은 숫자 전까지 출력 
		//3~4. 나머지가 0인 수 출력 
			if((inputNum%i)==0) {
				
				System.out.print(i+", ");
		//5. 쉼표 찍기  

				
				}
			}
		
		System.out.println(inputNum+" 입니다."); // 마지막에 입력받은 숫자와 고정 문자열 출력 
 
	}

}

		