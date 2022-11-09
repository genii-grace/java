package Review;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//월, 온도 입력받음
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int m = sc.nextInt();
		
		System.out.print("온도 입력 : ");
		int c = sc.nextInt();
		
		if(m>0 && m<13) {
		switch(m) {
		//3~5월 봄
		case 3:
		case 4:
		case 5:
			//3~15도
			if(c>=3&&c<=15) {
				System.out.println("계절은 봄입니다. 온도는 "+c+"도 입니다.");
			}
			//계절과 온도가 맞지 않음 
			else {
				System.out.println("계절과 온도가 맞지 않습니다.");
			}
			break;
		
		//6~8월 여름
		case 6:
		case 7:
		case 8:
			//18~37도
			if(c>=18&&c<=37) {
				System.out.println("계절은 여름입니다. 온도는 "+c+"도 입니다.");
			}
			//계절과 온도가 맞지 않음 
			else {
				System.out.println("계절과 온도가 맞지 않습니다.");
			}
			break;
		
		//9~11월 가을
		case 9:
		case 10:
		case 11:
			//3~15도
			if(c>=3&&c<=15) {
				System.out.println("계절은 가을입니다. 온도는 "+c+"도 입니다.");
			}
			//계절과 온도가 맞지 않음 
			else {
				System.out.println("계절과 온도가 맞지 않습니다.");
			}
			break;
		
		//12~2월 겨울
		case 1:
		case 2:
		case 12:
			//-15~2도
			if(c>=-15&&c<=2) {
				System.out.println("계절은 겨울입니다. 온도는 "+c+"도 입니다.");
			}
			//계절과 온도가 맞지 않음 
			else {
				System.out.println("계절과 온도가 맞지 않습니다.");
			}
			break;
		}
		}
		//잘못된입력 
		else {
			System.out.println("잘못된 입력입니다.");
		}
	}

}
