package Day12;

import java.util.Random;
import java.util.Scanner;

public class HW_no22 {
	
	//야구게임의 메서드화 

	/* 설명 : 
	 * 1. 컴퓨터 랜덤수 생성, 중복제거, 1~9 이내 
	 * 2. 유저 숫자 입력, 중복제거, 1~9 이내 
	 * 3. 컴퓨터와 유저숫자 비교 
	 * 3-1. 자리와 숫자가 같음 : strike
	 * 3-2. 숫자는 같지만 자리가 다름 : ball
	 * 3-3. strike, ball 없으면 out, 3strike 이면 홈런 -> 게임 종료  
	 * 4. strike, ball 출력 
	 */
	
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

	static boolean sameValue(int[] a, int[] b, int i) {

		boolean result=false;

		for(int j=0;j<i;j++) {
			if(a[i]==b[j]){
				result=true;
			}
			else {
				result=false;
			}
		}

		return result;
	}

	static int[] comRandom() { //컴퓨터 랜덤수 

		for (int i=0; i<3; i++) {
			com[i]=randomMake(r);
			if(sameValue(com, com, i)){
				i--;
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
			if(sameValue(user, user, i)) {
				System.out.println("중복입니다.");
				i--;
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

		baseball(comRandom(), userNum());

	}

}
