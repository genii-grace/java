package ch04.practice;

public class ch04_practice {

	public static void main(String[] args) {

//		Q3
		/* 내가 짠 코
		for(int i=0; ; i++) {
			if(i<11) {
				if(i%2==0) {
				System.out.println(i);
				}
				else {
					continue;
					}
			} 
			else {
				break;
			}
		} 
		*/
		
//		Q3 코드
		
		for(int i=0; ; i++) {
			if(i%2==1) {
				continue;
			}
			if(i>10) {
				break;
			}
			System.out.println(i);
		}
		
//		Q4
		for(int i=10; i>0; i-=2) {
			System.out.println(i);
		}
		
		int i=10;
		while(i>0) {
			System.out.println(i);
			i-=2;
		}
		
//		Q6
		
		for(i=0 ; i<10; i++) {
			for(int j=0; j<5; j++) {
				if(i==3 && j==2) {
					i=100;
					break;
				} 
			} 
		}
		
//		Q7
		
		POS1: for(i=0; i<0; i++) {
			for(int j=0; j<5; j++) {
				if(i==3 && j==2) {
					break POS1;
				}
			}
		}
		
		
	}

}
