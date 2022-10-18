package Day17;

import java.util.Random;
import java.util.Scanner;

//업앤다운 문제 


public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		int com = r.nextInt(31)+1;
		//System.out.println(com);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("숫자를 입력하세요 : ");
		
		int user = sc.nextInt();
		
		
			if(user>31 || user <1) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
			else {
				if(com>user) {
					System.out.println("UP");
				}
				
				else if(com==user) {
					System.out.println("정답입니다.");
					break;
					
				}
				
				else {
					System.out.println("DOWN");
				}
				
			}
		}
		System.out.println("게임 종료");
		
	}

}
