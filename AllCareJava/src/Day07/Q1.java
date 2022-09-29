package Day07;

import java.util.Random;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 숫자 야구 게임 배열로 만들기 
		 * 
		 * 1. 컴퓨터 랜덤수 받기, 중복 제거
		 * 2. 유저 랜덤 수 입력, 중복 제거,1~9 이내
		 * 3. 배열을 이용해서 숫자 비교
		 * 
		 */
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] com = new int[3];
		
		//1. 컴퓨터 랜덤수 받기
		for(int i=0; i<3; i++) {
			com[i]=r.nextInt(9)+1;		
		}
		
		//1. 중복제거 
		while(com[0]==com[1]||com[1]==com[2]||com[0]==com[2]) {
			for(int i=0; i<3; i++) {
				com[i]=r.nextInt(9)+1;		
			}
		}
		
		for(int i=0; i<3; i++) {
			System.out.print(com[i]);
		}
		
		System.out.println();
		
		int strike=0;
		int ball=0;
		
		while(strike<3) {
			
			
			//2. 유저 랜덤 수 입력 
			int[] user = new int[3];
			for(int i=0; i<3; i++) {
				System.out.print((i+1)+"번째 숫자 입력 : ");
				user[i] = sc.nextInt();
			}
			
			//2. 유저중복, 1~9  이외 숫제 제외
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2]||user[0]>10||user[0]<0||user[1]>10||user[1]<0||user[2]>10||user[2]<0) {
				System.out.println("잘못된 입력입니다.");
			}
	
		
			//3. 숫자 비교
			else {
				strike=0;
				ball=0;
				
				for(int i=0; i<3; i++) {
					for(int j=0; j<3; j++) {
						if(user[i]==com[j]) {
							strike++;
						}
						else {
							ball++;
						}
					}
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
