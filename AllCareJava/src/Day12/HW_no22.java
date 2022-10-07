package Day12;

import java.util.Random;
import java.util.Scanner;

public class HW_no22 {
	static Random r = new Random();
	static Scanner sc = new Scanner(System.in);
	static int[] com = new int[3];
	static int[] user = new int[3];

	static int randomMake(Random r) { //랜덤수 
		return r.nextInt(9)+1;
	}

	static int scannerMake(Scanner sc) { //입력받기 
		return sc.nextInt();
	}

	static int[] comRandom() { //컴퓨터 랜덤수 

		for(int i=0; i<3; i++) {
			com[i]=randomMake(r);
			for(int j=0; j<i; j++) {
				if(com[i]==com[j]) { //중복제거
					i--; //중복인 경우 i를 낮춰서 재입력 받기 
				}
			}

		}
		System.out.print("com 랜덤수 : ");
		for(int i=0; i<3; i++) {
			System.out.print(+com[i]);
		}

		System.out.println();
		return com;
	}

	static int[] userNum() {
		
		for(int i=0; i<3; i++) {
			System.out.print((i+1)+"번째 숫자 입력 : ");
			user[i] = scannerMake(sc);
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
		return user;
	}
	
	static void baseball(int[] comRandom, int[] userNum) {
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
		}
		else {
			System.out.println(strike+"스트라이크, "+ball+"볼");
		}
	}
	
	public static void main(String[] args) {

		//야구게임의 메서드화 

		/*
		 * 1. 컴퓨터 랜덤수 생성, 중복제거, 1~9 이내 
		 * 2. 유저 숫자 입력, 중복제거, 1~9 이내 
		 * 3. 컴퓨터와 유저숫자 비교 
		 * 3-1. 자리와 숫자가 같음 : strike
		 * 3-2. 숫자는 같지만 자리가 다름 : ball
		 * 3-3. strike, ball 없으면 out, 3strike 이면 홈런 -> 게임 종료  
		 * 4. strike, ball 출력 
		 */

		baseball(comRandom(), userNum());

	}

}
