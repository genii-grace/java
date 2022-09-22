package Day02;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 월을 입력하고, 해당하는 계절을 출력한다.
		
		// 월 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		
		//해당하는 계절 찾기
		String mos;
		switch(month){ // 보통 switch () 에는 변수를 넣고 해당 변수 값으로 case 문을 돌린다. 
			case 12:
			case 1:
			case 2:
				mos = "겨울입니다.";
				break;
				
			case 3:
			case 4:
			case 5:
				mos= "봄입니다.";
				break;
				
			case 6:
			case 7:
			case 8:
				mos = "여름입니다.";
				break;
				
			case 9:
			case 10:
			case 11:
				mos = "가을입니다.";
				break;
				
			default:
				mos = "달의 범위를 벗어났습니다.";
				break;
					
		}
			System.out.println(mos);
			
		

	}

}
