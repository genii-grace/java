package Day04;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		/* 첫화면 1. 원하는 구구단 입력, 2. 전체 구구단 출력, 3. 종료
		 * 잘못입력시 첫 화면으로 돌아감 
		 * 잘못 입력하는 경우 : 1~3 이외 숫자 입력, 2~9 이외숫자 입력 
		 */

		Scanner sc = new Scanner(System.in);
		boolean result=true;

		while(result) {
			System.out.println("=======================");
			System.out.println("1.원하는 구구단 출력.");
			System.out.println("2.전체 구구단 출력.");
			System.out.println("3.종료.");
			System.out.println("=======================");
			System.out.println();
			System.out.print("번호를 입력하세요 : ");
			int num1 = sc.nextInt(); // 메뉴 고르기
			
			if(num1>=1&&num1<=3) {

				if(num1==1) { // 메뉴 1 선택 
					System.out.print("원하는 구구단을 입력하세요 : ");
					int numGugudan = sc.nextInt();
					
					if(numGugudan>=2 && numGugudan<=9) {
						System.out.println();
						System.out.println(numGugudan+"단");
						for(int i=1;i<10;i++) {
							System.out.println(numGugudan+" x "+i+" = "+(numGugudan*i));
						}
						System.out.println();

						//continue;
					}
					else {
						System.out.println("잘못된 입력입니다.");
						System.out.println();
					}
				}
				else if (num1==2){ // 메뉴 2 선택
					for(int i=2; i<10;i++) {
						System.out.println();
						System.out.println(i+"단");

						for(int j=1; j<10; j++) {
							System.out.println(i+" x "+j+" = "+(i*j));
						}

						System.out.println();
					}
				}
				else { // 메뉴 3 선택 
					System.out.println("프로그램 종료");
					//result=false;
					break;
				}
			}
			else { // 잘못된 입력
				System.out.println("잘못된 입력입니다.");
				System.out.println();
				continue;
			}
		}
	}

}

/* 강사님 피드백 
 *  if(num1 ==1){구구단 선택}
 *  else if (num1==2){전체구구단}
 *  else if (num1==3){종료}
 * 	else {잘못된 입력}
 * 
 * if문 안에서는 continue 
 * */
