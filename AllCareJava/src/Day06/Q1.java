package Day06;

import java.util.Random;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * <첫화면> 1. 게임시작, 2. 종료
		 * 게임 시작 시 1. 가위, 2. 바위, 3.보 선택
		 * 컴퓨터는 랜덤으로 고르는중 
		 * 게임 끝난 후 첫화면으로 이동
		 * 
		 */
		
		Scanner sc= new Scanner(System.in);
		Random r = new Random();
		
		boolean check = true;
		
		while(check) {
			System.out.println("=================");
			System.out.print("1. 게임 시작\n2. 게임 종료\n");
			System.out.println("=================");
			System.out.print("메뉴를 고르세요 : ");
			int menu = sc.nextInt();
			
			if(menu==1) {
				int com = r.nextInt(3)+1; //컴퓨터 1~3까지 선택 
				System.out.print("1.가위 2.바위 3. 보 선택 : ");
				int num = sc.nextInt(); // 나의 선택 받기
			
				if(num==1) { //가위
					if(com==1) {
						System.out.println();
						System.out.println("com : "+com+" 가위");
						System.out.println("user : "+num+" 가위");
						System.out.println("무승부");
						System.out.println();
					}
					else if(com==2) {
						System.out.println();
						System.out.println("com : "+com+" 바위");
						System.out.println("user : "+num+" 가위");
						System.out.println("com 승 ");
						System.out.println();
					}
					
					else {
						System.out.println();
						System.out.println("com : "+com+" 보");
						System.out.println("user : "+num+" 가위");
						System.out.println("user 승 ");
						System.out.println();
						
					}
					
				}
				else if(num==2) {//바위 
					if(com==1) {
						System.out.println();
						System.out.println("com : "+com+" 가위");
						System.out.println("user : "+num+" 바위");
						System.out.println("user 승");
						System.out.println();
					}
					else if(com==2) {
						System.out.println();
						System.out.println("com : "+com+" 바위");
						System.out.println("user : "+num+" 바위");
						System.out.println("무승부 ");
						System.out.println();
					}
					
					else {
						System.out.println();
						System.out.println("com : "+com+" 보");
						System.out.println("user : "+num+" 바위");
						System.out.println("com 승 ");
						System.out.println();
						
					}
				}
				else {//보 
					if(com==1) {
						System.out.println();
						System.out.println("com : "+com+" 가위");
						System.out.println("user : "+num+" 보");
						System.out.println("com 승");
						System.out.println();
					}
					else if(com==2) {
						System.out.println();
						System.out.println("com : "+com+" 바위");
						System.out.println("user : "+num+" 보");
						System.out.println("user 승 ");
						System.out.println();
					}
					
					else {
						System.out.println();
						System.out.println("com : "+com+" 보");
						System.out.println("user : "+num+" 보");
						System.out.println("무승부 ");
						System.out.println();
						
					}
				}
				
				
			}
			else if(menu==2) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			else {
				System.out.println("잘못된 입력입니다. 다시 선택하세요.");
			}
			
			
		}
		
	}

}
