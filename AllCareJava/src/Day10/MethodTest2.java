package Day10;

import java.util.Scanner;

public class MethodTest2 {
	
	//입력받기
	static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num=sc.nextInt();
		return num;
		
	}
	
	//대소비교, 출력
	
	static void compare(int num1, int num2) {
		
		if(num1>num2) {
			System.out.println("앞의 숫자가 더 큽니다. ");
		}
		else if(num1<num2) {
			System.out.println("뒤의 숫자가 더 큽니다. ");
		}
		
		else {
			System.out.println("두 숫자는 같습니다.");
		}
	}

	public static void main(String[] args) {

		//대소비교 모두 메서드화 하기 
		
		//1. 두수 입력받음
		int num1=input();
		int num2=input();
		//2. 대소 비교
		//3. 출력 
		compare(num1,num2);
		
	
		
		

	}

}
