package Day03;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//입력받은 수의 약수 구하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int inputNum=sc.nextInt();
		
		System.out.print(inputNum+"의 약수는 ");
		
		for(int i=1; i<=inputNum; i++) {
			
			if((inputNum%i)==0) {
				
				System.out.print(i);
				
				if(i!=inputNum) {
					
				System.out.print(", ");
				
				}
			}
		}
		System.out.println(" 입니다.");

	}

}
