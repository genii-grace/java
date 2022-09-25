package Day03;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//입력받은 수의 약수 구하기
		/* 구현방
		 * 1. 입력받기
		 * 2. 입력받은 숫자만큼 반복하여 약수 찾기 
		 * 3. 약수는 나누었을 때 나머지가 0이므로 나머지 연산자 사용
		 * 4. 나머지가 0인 수는 i 로 출력하기
		 * 5. 마지막 자기 자신이 나올때는 쉼표 제외하
		 */
		
		//1. 입력받기 
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int inputNum=sc.nextInt();
		
		System.out.print(inputNum+"의 약수는 ");
		
		//2. 입력받은 숫자만큼 반복 
		for(int i=1; i<=inputNum; i++) {
		//3~4. 나머지가 0인 수 출력 
			if((inputNum%i)==0) {
				
				System.out.print(i);
		//5. 쉼표 찍기  
				if(i!=inputNum) {
					
				System.out.print(", ");
				
				}
			}
		}
		System.out.println(" 입니다.");

	}

}
