package Day03;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		//월과 온도 입력받음
		// 3~5월 봄, 6~8월 여름, 9~11월 가을, 12월~2월 겨울 . 출력 
		// 3~15도 봄, 18~37도 여름,3~15도 가을, 2~-15도 겨울 
		// 그외 월, 온도는 잘못된 출력 
		
		//입력 
		Scanner sc = new Scanner (System.in);
		System.out.print("월 입력 : ");
		int mon = sc.nextInt();
		System.out.print("온도 입력 : ");
		int c = sc.nextInt();
		
		//월 구분
		if(1>=mon && 12<=mon) {

		switch(mon) {
		case 3:
		case 4:
		case 5:
			if(c>=3 && c<=15) {System.out.println("계절은 봄입니다. 온도는 "+c+"도 입니다.");}
			else {System.out.println("계절과 온도가 맞지 않습니다.");}
			break;
		
		case 6:
		case 7:
		case 8:
			if(c>=18 && c<=37) {System.out.println("계절은 여름입니다. 온도는 "+c+"도 입니다.");}
			else  {System.out.println("계절과 온도가 맞지 않습니다.");}
			break;
		
		case 9:
		case 10:
		case 11:
			if (c>=3 && c<=15) {System.out.println("계절은 가을입니다. 온도는 "+c+"도 입니다.");}
			else  {System.out.println("계절과 온도가 맞지 않습니다.");}
			break;
			
		case 12:
		case 1:
		case 2: 
			if (c>=-15 && c<=2) {System.out.println("계절은 겨울입니다. 온도는 "+c+"도 입니다.");}
			else  {System.out.println("계절과 온도가 맞지 않습니다.");}
			break;
		
		default :
		{System.out.println("잘못된 입력입니다.");}
		break;
			
		}  
		} else { System.out.println("잘못된 입력입니다.");
	}
}
}
