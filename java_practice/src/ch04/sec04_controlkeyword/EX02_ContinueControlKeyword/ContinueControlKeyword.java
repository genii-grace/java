package ch04.sec04_controlkeyword.EX02_ContinueControlKeyword;

public class ContinueControlKeyword {
	
	public static void main(String[] args) {
		
//		단일continue
		for(int i=0; i<10; i++) {
			continue; // 출력내용 없
		}
		
//		이중반복문에서 continue
		for(int i=0; i<10; i++) {
			if(i==5) {
				continue;
			}
		System.out.print(i+" "); // 0 1 2 3 4 6 7 8 9
	}
		System.out.println();
	
		
//		중복반복문에서 continue
	for(int i=0; i<5; i++) {
		for(int j=0; j<5; j++) {
			if(j==3) {
				continue;
			}
			System.out.println(i+", "+j); // 0,0  0,1  0,2  0,4  0,5  1,0  1,1  1,2  1,4  1,5 ...
		}
	}
	System.out.println();
	
	
	POS1: for(int i=0; i<5; i++) {
		for(int j=0; j<5; j++) {
			if(j==3) {
				continue POS1;
			}
			System.out.println(i+", "+ j); //0,0 0,1 0,2 1,0 1,1 1,2 ...
		}
	}
	}
}
