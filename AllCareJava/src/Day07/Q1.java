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
			for(int j=0; j<i; j++) 
				if(com[i]==com[j]) { //중복제거
					i--; //중복인 경우 i를 낮춰서 재입력 받기 
					break;
				}
		}


		for(int i=0; i<3; i++) {
			System.out.print(com[i]);
		}

		System.out.println();

		while(true) {		
			
			//2. 유저 랜덤 수 입력 
			int[] user = new int[3];
			for(int i=0; i<3; i++) {
				System.out.print((i+1)+"번째 숫자 입력 : ");
				user[i] = sc.nextInt();
				if(user[i]<0||user[i]>10) { // 숫자 범위 지정 
					System.out.println("잘못된 입력입니다.");
					i--;
					continue;
				}
				for(int j=0; j<i;j++) { // 중복제거
					if(user[i]==user[j]) { 
						//j는 다음 입력자리를 뜻함 i=0일 때는 가장 처음 입력이므로 중복비교하지않고
						//i=0으로 넘어간 후 j=0 일때 같으면 순서를 낮춤 
						System.out.println("중복입니다.");
						i--;
						break;
					} 
				}

			} 


			//3. 숫자 비교

			int strike=0;
			int ball=0;

			for(int i=0; i<3; i++) { //USER
				for(int j=0; j<3; j++) {//COM
					if(user[i]==com[j]) {// 값 비교 
						if(i==j) {
							strike++;	
						}
						else {
							ball++;
						}
					}
				}
			}

			if(strike==0&&ball==0) {
				System.out.println("아웃");
			}
			else if(strike==3) {
				System.out.println("홈런"); 
				break;
			}
			else {
				System.out.println(strike+"스트라이크, "+ball+"볼");
			}
		}
	}
}

