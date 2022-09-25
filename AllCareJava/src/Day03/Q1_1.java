package Day03;

import java.util.Scanner;

public class Q1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//월과 온도 입력받음
		// 3~5월 봄, 6~8월 여름, 9~11월 가을, 12월~2월 겨울
		// 3~15도 봄, 18~37도 여름,3~15도 가을, 2~-15도 겨울 
		// 그외 월, 온도는 잘못된 출력 
				
		//입력 
		Scanner sc = new Scanner (System.in);
		System.out.print("월 입력 : ");
		int mon = sc.nextInt();
		System.out.print("온도 입력 : ");
		int c = sc.nextInt();
				
		//if문으로 짜보기
		
		if(c>= -15 && c<=15 || c>=18 && c<=37) { //주어진 온도 범위 
			if(1<=mon && 12>=mon) { // 1~12월까지 범위 
				
				if(3<=mon && 5>=mon) { //봄 
					if(3<=c && 15>=c) {System.out.println("계절은 봄입니다. 온도는 "+c+"입니다.");}
					else {System.out.println("계절과 온도가 맞지않습니다.");}
				}
				else if (6<=mon && 8>=mon) { //여름 
					if(18<=c && 37>=c) {System.out.println("계절은 여름입니다. 온도는 "+c+"입니다.");}
					else {System.out.println("계절과 온도가 맞지않습니다.");}
				}
				else if (9<=mon && 11>=mon) { //가을 
					if(3<=c && 15>=c) {System.out.println("계절은 가을입니다. 온도는 "+c+"입니다.");}
					else {System.out.println("계절과 온도가 맞지않습니다.");}
				}
				else if (2>=mon || 12==mon) { //겨울 
					if(-15<=c && 2>=c) {System.out.println("계절은 겨울입니다. 온도는 "+c+"입니다.");}
					else {System.out.println("계절과 온도가 맞지않습니다.");}
				}
				
				}
			else {System.out.println("잘못된 입력입니다."); //월 범위 벗어났을 때 
			}
		}
		else {  //주어진 온도범위를 벗어났을 떄 
			System.out.println("잘못된 입력입니다.");
			}
			
	}
}
		