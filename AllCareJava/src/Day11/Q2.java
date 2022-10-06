package Day11;

import java.util.Scanner;

public class Q2 {
	

	
	//1. 사각형 넓이 구하기 주고 받고
	static int sq(int[] xy) {
		
		return xy[0]*xy[1];
	}
	
	
	//2. 삼각형 넓이 구하기 안주고 받고 
	static void tri(int[] a) {

		System.out.println("삼각형 넓이 : "+(int)((a[0]*a[1])/2));
		System.out.println();
		
	}
	
	
	//3. 형태 선택  주고 안받고 
	static int select() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.사각형넓이 2.삼각형넓이 3.종료");
		int select = sc.nextInt();
	
		return select;
	}
	
	//4. 가로세로 입력 주고 안받고 
	static int[] input() {
		int[] a=new int[2];
		Scanner sc1 =new Scanner(System.in);
		System.out.print("가로 : ");
		a[0]=sc1.nextInt();
		System.out.print("세로 : ");
		a[1]=sc1.nextInt();
		
		return a;
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			
			int select=select();
			
			if (select==1) {
				//사각형 넓이 함수 
				int []xy=input();
				System.out.println("사각형의 넓이 : "+sq(xy));
				System.out.println();
			}
			else if (select==2){
				//삼각형 넓이 함수 

				tri(input());
				
			}
			else if (select==3) {
				System.out.println("프로그램을 종료합니다. ");
				break;
			}
			else {
				System.out.println("잘못된 입력입니다. ");
			}
			
		}

	}

}
