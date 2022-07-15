package ch04.sec03_overlappedcontrolstatement.EX01_OverlappedControlStatement;

public class OverlappedControlstatement {
	
	public static void main(String[] args) {
		
		int value1=5;
		int value2=3;
		
		if(value1>5){
			if(value2<2) {
				System.out.println("실행1");
			}
			else {
				System.out.println("실행2");
			}
		}else {
			System.out.println("실행3"); // 실행3 출력 
		}
	
		System.out.println();
		
		int value3=2;
		switch(value3) {
		case 1:
			for(int k=0; k>0;k++) {
				System.out.print(k+" ");
			}
			break;
			
		case 2:
			for(int k=10; k>0; k--) {
				System.out.print(k+" "); // 10 9 8 7 6 5 4 3 2 1
			}
			break;
		}
		System.out.println();
		System.out.println();
		
		for(int i=0;i<3;i++) {
			for(int j=0; j<5;j++) {
				System.out.println(i+" "+j); //0 0, 0 1, 0 2, 0 3, 0 4 ,0 4 , 1 0 , 1 1 , 1 2 , 1 3 , 1 4 , 2 0, 2 1, 2 2, 2 3 , 2 4
				if(i==j) {
					System.out.println("i=j"); //i=j
				}
				/*
				i가 0일때 j 를 5회 돌아 출력. i가 1,2일때까지 각각 5회씩 돌아 출력
				 */
			}
		}
	}
}
