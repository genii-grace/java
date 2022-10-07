package Day12;

import java.util.Scanner;

public class Q2_no21 {

	static Scanner sc = new Scanner(System.in);

	static int start() {
		System.out.println("=====================");
		System.out.println("1.구구단 출력 \n2.별찍기 출력\n3.종료");
		System.out.println("=====================");
		System.out.print("선택 : ");

		return sc.nextInt();
	}

	static void programSelect (int num) {

		if(num==1) {
			gugudan();	
		}

		else if(num==2) {
			star();
		}
		else if(num==3) {
			System.out.println("프로그램이 종료됩니다. ");
		}
		else {
			wrongPrint();
		}
	}

	static void gugudan() {


		//구구단 
		System.out.println("=======================");
		System.out.println("1.원하는 구구단 출력.");
		System.out.println("2.전체 구구단 출력.");
		System.out.println("=======================");
		System.out.println();
		System.out.print("번호를 입력하세요 : ");
		int num1 = sc.nextInt(); // 메뉴 고르기


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
			wrongPrint();


		}



		programSelect(start());

	}

	static void star() {

		//별찍기 

		System.out.println("================");
		System.out.print("1. 직사각형 \n2. 정직삼각형 \n3. 역직삼각형 \n4. 피라미드 \n5. 다이아몬드\n");
		System.out.println("================");
		System.out.println();
		System.out.print("모양을 선택하세요 : ");
		int style=sc.nextInt();
		if(style>=1&& style<=5) {

			System.out.print("숫자를 입력하세요 : ");
			int starNum=sc.nextInt();

			if(style==1) {
				System.out.println();
				for(int i=0; i<starNum; i++) {
					for(int j=0; j<starNum; j++) {
						System.out.print("*");
					}System.out.println();
				}System.out.println();
			}
			else if(style==2) {
				System.out.println();
				for(int i=0; i<starNum; i++) {
					for (int j=0; j<i+1; j++) { // sol. for(int j=0; j<=i; j++)
						System.out.print("*");
					}System.out.println();
				}System.out.println();
			}
			else if(style==3) {
				System.out.println();
				for(int i=0; i<starNum; i++) {
					for(int j=0; j<starNum; j++) {
						if(i+j<starNum-1) {
							System.out.print(" ");
						}else {
							System.out.print("*");
						}
					}System.out.println();
				}System.out.println();
			}
			else if(style==4) {
				System.out.println();
				for(int i=0; i<(starNum/2)+1; i++) {
					for(int k=0; k<((starNum/2)-i); k++) {
						System.out.print(" ");
					}
					for(int j=0; j<(2*i+1); j++) { //sol. for(int j=0; j<=2*i; j++)
						System.out.print("*");
					}System.out.println();
				}System.out.println();
			}

			else {
				System.out.println();
				for(int i=0; i<(starNum/2)+1; i++) {
					for(int k=0; k<((starNum/2)-i); k++) {
						System.out.print(" ");
					}
					for(int j=0; j<(2*i+1); j++) {
						System.out.print("*");
					}System.out.println();
				}


				for(int i=starNum/2; i>0; i--) {
					for(int k=i-1; k<=(starNum/2)-1; k++) {
						System.out.print(" ");
					}
					for(int j=0; j<(2*i-1); j++) {
						System.out.print("*");
					} System.out.println(); 
				} System.out.println();

			}

		}

		else {
			System.out.println();
			wrongPrint();
		}
		programSelect(start());
	}


	static void wrongPrint() {
		System.out.println("잘못된 입력입니다. 다시 선택하세요. ");
		programSelect(start());
	}

	public static void main(String[] args) {

		programSelect(start());


	}
}


