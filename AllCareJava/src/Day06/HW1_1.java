package Day06;

import java.util.Random;
import java.util.Scanner;

public class HW1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 랜덤수 3개, 내가 입력 3개(중복 체크할 것-> 중복인 경우 다시 재입력)
		 * 숫자 및 자리 비교 (자리가 다르면 볼, 자리 및 값이 같으면 스트라잌, 같으면 홈런-> 게임종료)
		 * out, 1~2strike, 1~3ball, 홈런 
		 * 일반변수로 만들기 (배열사용x)
		 */

		int ball=0;
		int strike=0;
		boolean check1=true;
		boolean check2=true;

		//1. COM랜덤수 세자리 받기 (1~9)
		Random r = new Random(); //랜덤수 세개 받기
		int r1=r.nextInt(9)+1;
		int r2=r.nextInt(9)+1;
		int r3=r.nextInt(9)+1;

		while(r1==r2||r1==r3||r3==r2) { //랜덤수 중복 제거 
			r1=r.nextInt(9)+1;
			r2=r.nextInt(9)+1;
			r3=r.nextInt(9)+1;
		}
		System.out.println(r1+","+r2+","+r3);

		//2. 입력 받기 
		Scanner sc = new Scanner(System.in);
		while(check1) {
			check2=true;
			System.out.print("첫번째 숫자를 입력하세요 : ");
			//첫번째 숫자 입력
			int num1 = sc.nextInt();

			//첫번째 숫자 정상 입력
			if(num1>0&&num1<10) {
				while(check2) {
					System.out.print("두번째 숫자를 입력하세요 : ");
					//두번째 숫자 입력 
					int num2 = sc.nextInt();

					//중복체크 
					while(num2==num1) {
						System.out.println("중복입니다.");
						System.out.print("두번째 숫자를 입력하세요 : ");
						//두번째 숫자 입력 
						num2 = sc.nextInt();
					}
					//두번째 숫자 정상입력
					if(num2>0&&num2<10) {
						while(check2) {
							//세번째 숫자 입력
							System.out.print("세번째 숫자를 입력하세요 : ");
							int num3=sc.nextInt();

							//중복체크
							while(num3==num1||num3==num2) {
								System.out.println("중복입니다.");
								System.out.print("세번째 숫자를 입력하세요 : ");
								num3=sc.nextInt();
							}
							if(num3>0&&num3<10) {
								if(r1==num1&&r2==num2&&r3==num3) {
									System.out.println("홈런!");
									check1=false;
									check2=false;

								}
								else if (r1==num1||r2==num2||r3==num3||r1==num2||r1==num3||r2==num1||r2==num3||r3==num2||r3==num1) {
									if(r1==num1) {strike++;}
									if(r2==num2) {strike++;}
									if(r3==num3) {strike++;}
									if(r1==num2) {ball++;}
									if(r1==num3) {ball++;}
									if(r2==num1) {ball++;}
									if(r2==num3) {ball++;}
									if(r3==num2) {ball++;}
									if(r3==num1) {ball++;}
									
									System.out.println(strike+"스트라이크, "+ball+"볼");
									check2=false;
								}
								else{
									System.out.println("아웃!");
									check2=false;
								}
							}
							//세번째 숫자 음수이거나 9보다 클 때
							else {
								System.out.println("숫자는 10보다 작은 양수로 입력하세요\n");
							}
						}
					}

					//두번째 숫자 음수이거나 9보다 클 때
					else {
						System.out.println("숫자는 10보다 작은 양수로 입력하세요\n");
					}
				}
			}
			//첫번째 숫자 음수이거나 9보다 클 때
			else {
				System.out.println("숫자는 10보다 작은 양수로 입력하세요\n");
			}
		}
	}
}
