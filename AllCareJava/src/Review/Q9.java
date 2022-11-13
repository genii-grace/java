package Review;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("=====================");
			System.out.print("1.원하는 구구단 출력\n2.전체구구단 출력\n3.종료\n");
			System.out.println("=====================");
			int num = sc.nextInt();
			if(num==1||num==2||num==3) {

				if(num==1) {
					while(true) {
						System.out.print("원하는 구구단 : ");
						num = sc.nextInt();
						if(num>0&&num<10) {
							System.out.println("\n"+num+"단 ");
							for(int i=1; i<10; i++) {
								System.out.println(num+" x "+i+" = "+(num*i));
							}
							System.out.println();
							break;
						}
						else {
							System.out.println("잘못된 입력입니다.");
							break;
						}
					}
				}
				else if(num==2) {
					System.out.println("전체 구구단\n");
					for(int i=2;i<10;i++) {
						System.out.println(i+"단");
						for(int j=1; j<10; j++) {
							System.out.println(i+" x "+j+" = "+(i*j));
						}
						System.out.println();
					}

				}
				else {
					System.out.println("프로그램이 종료됩니다.");
					break;
				}

			}
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}

	}

}
