//for문의 기본 문법구조,특수형태, 무한루프에서 탈출

package ch04.sec02_loopcontrolstatement.EX01_ForControlStatement;

public class ForControlstatement {
	
	public static void main(String[] args) {
		
//		변수를 외부에서 선언하는 for 
		int a;
		for (a=0;a<3;a++) { //a는 0부터 시작.a=0,1,2일때까지 증감하며 아래구문 실행
			System.out.print(a+" ");
		}
		System.out.println(); // 0 1 2
	
//		변수를 초기문에서 선언하는 for
		for(int i =0; i<3; i++) { //i는 0부터 시작 i=0,1,2 까지 증가하여 아래구문 실행
			System.out.print(i+" ");
		}
		System.out.println();
		
//		감소하면서 진행되는 반복문 
		for(int i=10;i>0; i--) { //i는 10부터 시작해서 1까지 반
			System.out.print(i+" "); // 10 9 8 7 6 5 4 3 2 1
		}
		System.out.println();
		
//		++ -- 이외에도 가능한 반복문 
		for(int i=0;i<10; i+=2) { //i는  0부터 시작해서 9까지 증가하는데, 2씩 늘어
			System.out.print(i+" "); // 0 2 4 6 8
		
		}
		System.out.println();
		
//		변수가 2개인 반복문 
		for(int i=0, j=0; i<10; i++, j++) { //i,j0부터 시작, i가 9일때까지 실
			System.out.print(i+j+" "); // 0 2 4 6 8 10 12 14 16 18
		}
		System.out.println();
		
//		무한루프를 탈출하는 방법 
		for(int i=0; ; i++) { //무한루프 
			if(i>10) { // 그치만 i가 9일때까지만 진행
				break; // i가 10이상이면 탈출해서 무한루프 탈출출력 
			}
			System.out.print(i+" "); // 0 1 2 3 4 5 6 7 8 9
		}
		System.out.print("무한루프 탈출");
	}

}
