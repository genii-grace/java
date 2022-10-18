package Day17;

import java.util.Scanner;

//문자열 나누기 


public class Q2 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String user = sc.next();
		int index=-1;
		int count=1;
		int turn=1;

		while(turn<user.length()) {
			for(int i=index+1; i<user.length()-1;i++) {
				if(user.charAt(i)==user.charAt(i+1)) {
					count++; //중복수
					turn++;
				}
				else {
					index=i+1;//숫자가 바뀌는 지점 
					turn++;
					break;
				}
			}
			if(user.charAt(index-1)=='1') {
				if(count%3==0) {
					System.out.print("C");
				}
				else if(count%2==1) {
					System.out.print("B");
				}
				else {
					System.out.print("A");
				}
			}
			else if(user.charAt(index-1)=='2') {
				if(count%3==0) {
					System.out.print("F");
				}
				else if(count%2==1) {
					System.out.print("E");
				}
				else {
					System.out.print("D");
				}
			}
			else if(user.charAt(index-1)=='3') {
				if(count%3==0) {
					System.out.print("I");
				}
				else if(count%2==1) {
					System.out.print("H");
				}
				else {
					System.out.print("G");
				}
			}
			else if(user.charAt(index-1)=='4') {
				if(count%3==0) {
					System.out.print("L");
				}
				else if(count%2==1) {
					System.out.print("K");
				}
				else {
					System.out.print("J");
				}
			}
			else if(user.charAt(index-1)=='5') {
				if(count%3==0) {
					System.out.print("O");
				}
				else if(count%2==1) {
					System.out.print("N");
				}
				else {
					System.out.print("M");
				}
			}
			else if(user.charAt(index-1)=='6') {
				if(count%3==0) {
					System.out.print("R");
				}
				else if(count%2==1) {
					System.out.print("Q");
				}
				else {
					System.out.print("P");
				}
			}
			else if(user.charAt(index-1)=='7') {
				if(count%3==0) {
					System.out.print("U");
				}
				else if(count%2==1) {
					System.out.print("T");
				}
				else {
					System.out.print("S");
				}
			}
			else if(user.charAt(index-1)=='8') {
				if(count%3==0) {
					System.out.print("X");
				}
				else if(count%2==1) {
					System.out.print("W");
				}
				else {
					System.out.print("V");
				}
			}
			else if(user.charAt(index-1)=='9') {
				System.out.print("Y");
			}
			else if(user.charAt(index-1)=='0') {
				System.out.print("Z");
			}
			else if(user.charAt(index-1)=='*') {
				System.out.print("*");
			}
			else if(user.charAt(index-1)=='#') {
				System.out.print("#");
			}

			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}









