package Day07;

import java.util.Random;
import java.util.Scanner;

public class Day06HW1sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 야구게임 강사님 피드백 
		
		/*
		 * 1. 컴퓨터 랜덤수 생성, 중복제거, 1~9 이내 
		 * 2. 유저 숫자 입력, 중복제거, 1~9 이내 
		 * 3. 컴퓨터와 유저숫자 비교 
		 * 3-1. 자리와 숫자가 같음 : strike
		 * 3-2. 숫자는 같지만 자리가 다름 : ball
		 * 3-3. strike, ball 없으면 out, 3strike 이면 홈런 -> 게임 종료  
		 * 4. strike, ball 출력 
		 */
		
		//1. 컴퓨터 랜덤수 
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
			
		int com1 = r.nextInt(9)+1;
		int com2 = r.nextInt(9)+1;
		int com3 = r.nextInt(9)+1;
		
		//1.중복제거
		while(com1==com2 || com2==com3 || com1==com3) {
			com1 = r.nextInt(9)+1;
			com2 = r.nextInt(9)+1;
			com3 = r.nextInt(9)+1;
		}
		
		System.out.printf("%d,%d,%d\n",com1,com2,com3);
		
		int strike =0;
		int ball=0;
		
		while(strike<3) {
			//2. 유저 숫자입력 
			System.out.print("첫번째 숫자 : ");
			int user1 = sc.nextInt();
			System.out.print("두번째 숫자 : ");
			int user2 = sc.nextInt();
			System.out.print("세번째 숫자 : ");
			int user3 = sc.nextInt();
			
			//2. 중복제거, 1~9까지 
			if(user1<1||user1>9||user2<1||user2>9||user3<1||user3>9||user1==user2||user2==user3||user3==user1) {
				System.out.println("잘못된 입력입니다.");	
			}
			else { //3. 비교 출력
				strike=0;
				ball=0;
				
				if(com1==user1) {
					strike++;
				}
				if(com2==user2) {
					strike++;
				}
				if(com3==user3) {
					strike++;
				}
				if(user1==com2||user1==com3) {
					ball++;
				}
				if(user2==com1||user2==com3) {
					ball++;
				}
				if(user3==com1||user3==com2) {
					ball++;
				}
				if(strike==0&&ball==0) {
					System.out.println("아웃");
				}
				else if(strike==3) {
					System.out.println("홈런");
				}
				else {
					System.out.println(strike+"스트라이크, "+ball+"볼");
				}
				
			}
		}
			

	}

}
