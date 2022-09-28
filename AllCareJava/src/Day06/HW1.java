package Day06;

import java.util.Random;
import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 랜덤수 3개, 내가 입력 3개(중복 체크할 것-> 중복인 경우 다시 재입력)
		 * 숫자 및 자리 비교 (자리가 다르면 볼, 자리 및 값이 같으면 스트라잌, 같으면 홈런-> 게임종료)
		 * out, 1~2strike, 1~3ball, 홈런 
		 * 일반변수로 만들기 (배열사용x)
		 */

		int ball=0;
		int str=0;

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
		while(true) {

			System.out.print("첫번째 숫자를 입력하세요 : ");
			int num1 = sc.nextInt();

			if(num1>0&&num1<10) { // 첫번째 숫자 10 미만으로 설정		
				System.out.print("두번째 숫자를 입력하세요 : ");

				int num2 = sc.nextInt();
				if(num2>0&&num2<10) { // 두번째 숫자 10 미만으로 설정
					while(num2==num1) {
						System.out.print("중복입니다. 두번째 숫자를 입력하세요 : ");
						num2 = sc.nextInt();
					}

					System.out.print("세번째 숫자를 입력하세요 : ");
					int num3 = sc.nextInt();
					if(num3>0&&num3<10) {
						while(num3==num2||num3==num1) {
							System.out.print("중복입니다. 세번째 숫자를 입력하세요 : ");
							num3 = sc.nextInt();
						}	

						// 정상입력 일 때,
						System.out.println();
						System.out.println("====================");
						System.out.println("첫째자리 : "+num1);
						System.out.println("둘째자리 : "+num2);
						System.out.println("셋째자리 : "+num3);

// 홈런
						if(r1==num1&&r2==num2&&r3==num3) { //홈런 
							System.out.println("홈런");
							break;
						}

/*
* BALL : 같은 값이 있긴 하면 볼
* strike : 자리까지 같을 때
 */
						
						
						
						
						
//OUT
						else {
							System.out.println("Out");
						}
						
					}

					
					else{ // 세번째 숫자 10 이상일 때
						System.out.println("잘못된 입력입니다. 다시 입력하세요.");
					}

				}
				else { // 두번째 숫자 10 이상일 때
					System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				}

			}
			else { // 첫번째 숫자 10이상일 때 
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}

		}
	}
}



