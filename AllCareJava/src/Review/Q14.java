package Review;

import java.util.Random;
import java.util.Scanner;

public class Q14 {

	static String select(int n) {

		if(n==1) {
			return "가위";
		}
		else if(n==2) {
			return "바위";
		}
		else {
			return "보";
		}

	}

	static void compare(String com, String user) {
		
		if(com.equals("가위")) {
			
			if(user.equals("가위")) {
				System.out.println("비겼습니다.");
			}
			else if(user.equals("바위")) {
				
				System.out.println("user 승!");
			}
			else {
				System.out.println("com 승!");
			}
			
			
		}
		else if (com.equals("바위")) {
			
			if(user.equals("바위")) {
				System.out.println("비겼습니다.");
			}
			else if(user.equals("보")) {
				
				System.out.println("user 승!");
			}
			else {
				System.out.println("com 승!");
			}
			
		}
		else {
			if(user.equals("보")) {
				System.out.println("비겼습니다.");
			}
			else if(user.equals("가위")) {
				
				System.out.println("user 승!");
			}
			else {
				System.out.println("com 승!");
			}
			
		}
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int[] n = new int[2];
		//n[0] : com, n[1] : user


		while(true) {
			//첫화면 
			System.out.print("1.게임시작 2.종료\n선택 : ");
			int menu = sc.nextInt();

			//첫화면 잘못된 입력 
			while(menu<=0 || menu>=3) {
				System.out.println("잘못된 입력입니다.");
				System.out.print("1.게임시작 2.종료\n선택 : ");
				menu = sc.nextInt();
			}

			if(menu==1) {
				//com 랜덤수 생성 
				n[0] = r.nextInt(3)+1;

				//가위바위보 
				System.out.print("1.가위 2.바위 3.보\n선택 : ");
				n[1] = sc.nextInt();

				//가위바위보 잘못된 입력
				while(n[1]<=0 || n[1]>=4) {
					System.out.println("잘못된 입력입니다.");
					System.out.print("1.가위 2.바위 3.보\n선택 : ");
					n[1] = sc.nextInt();
				}
				
				System.out.println("=======================");
				System.out.println("com : "+select(n[0]));
				System.out.println("user : "+select(n[1]));
				compare(select(n[0]),select(n[1]));
				System.out.println("=======================");
				

			}

			//게임 종
			else {
				System.out.println("게임을 종료합니다.");
				break;
			}


		}



	}

}
