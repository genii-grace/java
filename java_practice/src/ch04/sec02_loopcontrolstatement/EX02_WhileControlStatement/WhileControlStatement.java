//while문의 기본 문법구조 / for문으로 변환 / 특수형태, 무한루프 탈출

package ch04.sec02_loopcontrolstatement.EX02_WhileControlStatement;

public class WhileControlStatement {
	
	public static void main(String[] args) {
		
		int a=0; // 초기문 
		while(a<10) { //조건문 a가 10보다 작을때 까지 반
			System.out.print(a+" "); // 0 1 2 3 4 5 6 7 8 9
			a++; // 증감
		}
		
		System.out.println();
	
	
		for(int i=0; i<10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int b=10;
		while(b>0) {
			System.out.print(b+" "); // 10 9 8 7 6 5 4 3 2 1
			b--;
		}
		
		System.out.println();
		
		
		int c=0;
		while(true){ //무한루프
			if(c>10) { // c가 10보다 커지면 탈출해~
				break;
			}
			System.out.print(c+" ");
			c++;
		}
		
		
	}
}
