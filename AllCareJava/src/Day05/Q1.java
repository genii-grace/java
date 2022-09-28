package Day05;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		/*
		 * 1. 별찍기 모양선택  
		 *	 1. 직사각형, 2. 정직삼각형, 3. 역직삼각형, 4. 피라미드, 5. 다이아몬드, 6. 종료 ,잘못된 입력
		 * 2. 찍을 숫자 입력
		 *  음수 인 경우 잘못된 입력  
		 */
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		while (check) {
			System.out.println("================");
			System.out.print("1. 직사각형 \n2. 정직삼각형 \n3. 역직삼각형 \n4. 피라미드 \n5. 다이아몬드\n6. 종료\n");
			System.out.println("================");
			System.out.println();
			System.out.print("모양을 선택하세요 : ");
			int style=sc.nextInt();
			if(style>=1&& style<=5) {

				System.out.print("숫자를 입력하세요 : ");
				int num=sc.nextInt();

				if(style==1) {
					System.out.println();
					for(int i=0; i<num; i++) {
						for(int j=0; j<num; j++) {
							System.out.print("*");
						}System.out.println();
					}System.out.println();
				}
				else if(style==2) {
					System.out.println();
					for(int i=0; i<num; i++) {
						for (int j=0; j<i+1; j++) { // sol. for(int j=0; j<=i; j++)
							System.out.print("*");
						}System.out.println();
					}System.out.println();
				}
				else if(style==3) {
					System.out.println();
					for(int i=0; i<num; i++) {
						for(int j=0; j<num; j++) {
							if(i+j<num-1) {
								System.out.print(" ");
							}else {
								System.out.print("*");
							}
						}System.out.println();
					}System.out.println();
				}
				else if(style==4) {
					System.out.println();
					for(int i=0; i<(num/2)+1; i++) {
						for(int k=0; k<((num/2)-i); k++) {
							System.out.print(" ");
						}
						for(int j=0; j<(2*i+1); j++) { //sol. for(int j=0; j<=2*i; j++)
							System.out.print("*");
						}System.out.println();
					}System.out.println();
				}

				else {
					System.out.println();
					for(int i=0; i<(num/2)+1; i++) {
						for(int k=0; k<((num/2)-i); k++) {
							System.out.print(" ");
						}
						for(int j=0; j<(2*i+1); j++) {
							System.out.print("*");
						}System.out.println();
					}


					for(int i=num/2; i>0; i--) {
						for(int k=i-1; k<=(num/2)-1; k++) {
							System.out.print(" ");
						}
						for(int j=0; j<(2*i-1); j++) {
							System.out.print("*");
						} System.out.println(); 
					} System.out.println();
					
				}

			}
			else if(style==6) {
				System.out.println();
				System.out.println("프로그램이 종료됩니다.");
				check=false;
				break;
			}
			else {
				System.out.println();
				System.out.println("잘못된 입력입니다.");
			}
		}

	}

}
