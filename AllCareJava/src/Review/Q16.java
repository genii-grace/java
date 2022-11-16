package Review;

import java.util.Random;
import java.util.Scanner;

public class Q16 {

	static int wrongCheck(int i, int user) {
		if(user<=0||user>=10) {
			System.out.println("잘못된 입력입니다.");
			i--;
			return i;
		}
		
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		int[] com = new int[3];

		//com 랜덤수 중복제거 
		while(com[0]==com[1]||com[0]==com[2]||com[1]==com[2]) {
			for(int i=0; i<com.length; i++) {
				com[i]=r.nextInt(9)+1;
			}
		}
		for(int i=0; i<com.length; i++) {
			System.out.print(com[i]+" ");
		}System.out.println();

		int[] user = new int[3];
		Scanner sc = new Scanner(System.in);

		//user 잘못된입력 및 중복제거
		for(int i=0; i<user.length; i++) {
			if(i==0) {
				System.out.print("첫째자리 : ");
				user[i]=sc.nextInt();
				i=wrongCheck(i,user[i]);
			}
			else if(i==1) {
				System.out.print("둘째자리 : ");
				user[i]=sc.nextInt();
				i=wrongCheck(i,user[i]);
				if(user[1]==user[0]||user[1]==user[2]) {
					System.out.println("중복입력 입니다.");
					i--;
				}
			}
			
			else {
				System.out.print("셋째자리 : ");
				user[i]=sc.nextInt();
				i=wrongCheck(i,user[i]);
				if(user[2]==user[0]||user[1]==user[2]) {
					System.out.println("중복입력 입니다.");
					i--;
				}
			}
		}


	}

}
