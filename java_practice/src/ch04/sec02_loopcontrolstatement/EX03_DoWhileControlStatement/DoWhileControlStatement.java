package ch04.sec02_loopcontrolstatement.EX03_DoWhileControlStatement;

public class DoWhileControlStatement {
	
	public static void main(String[] args) {
//		while 
		int a;
		a=0;
		while(a<0) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println(); //아무 출력도 안되고 엔터 
		
//		do-while 
		a=0;
		do {
			System.out.print(a+" "); // 0만 출력 후 탈
			a++;
		} 
		while(a<0);
		System.out.println();
		
//		while
		a=0;
		while(a<1) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println();
		
//		do-while
		a=0;
		do {
			System.out.print(a+" ");
			a++;
		} 
		while(a<1);
		System.out.println();
		
//		while
		a=0;
		while(a<10) {
			System.out.print(a+" "); // 0 1 2 3 4 5 6 7 8 9
			a++;
		}
		System.out.println();
		
//		do-while
		
		a=0;
		do {
			System.out.print(a+" ");// 0 1 2 3 4 5 6 7 8 9 
			a++;
		}
		while(a<10);
		System.out.println();
	}
	/* 
	 	while 과 do-while은 결과 값으나 실행순서가 다르다. 
		while은 조건문 검사가 선행되고 출력 및 증가 순으로 일어나고
		do-while은 최초 1회는 출력된 이후에 증가 후 조건문 검사가 진행된다.
		순서가 다르다 
	 */

}
