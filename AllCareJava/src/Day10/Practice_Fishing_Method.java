package Day10;

import java.util.Random;
import java.util.Scanner;

public class Practice_Fishing_Method {
	static int rannum=0;
	static int fishcount=0;
	
	static int[][] hosu=new int[5][5];
	
	static void catchfish(int castX, int castY) {
		
		if(hosu[castX][castY]==1) {
			System.out.println("물고기를 잡았습니다.");
			hosu[castX][castY]=0;
			fishcount--;
			}
		
	}
	
	static void checkFish() {
		
		for(int i=0; i<hosu.length; i++) {
			for(int j=0; j<hosu[i].length; j++) {
				if(hosu[i][j]==0) {
					System.out.print("*");
				}
				else {
					System.out.print("O");
				}
			}System.out.println();
		}
		
	}
	
	static int random() {
		
		Random r = new Random();
		rannum=r.nextInt(5);
		return rannum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 호수 만들기
		//int[][] hosu= new int[5][5];
		//2. 물고기 위치 랜덤
		int x=0;
		int y=0;
		//int fishcount=0;

		int castX=0;
		int castY=0;
		
		int num=0;
		
		Scanner sc = new Scanner(System.in);
		
		//Random r=new Random();
		for (int i=0; i<3; i++) {
			x=random();
			y=random();
			fishcount++;
			//2-1. 중복제거
			if(hosu[x][y]==1) {
				i--;
			}
			else {
				hosu[x][y]=1;
			}

		}
		
		checkFish();

		//3. 물고기 3완료되면 캐스팅
		while(true) {
			
			System.out.print("캐스팅 행 : ");
			castX = sc.nextInt();
			System.out.print("캐스팅 열 : ");
			castY = sc.nextInt();

			if(castX>-1&&castX<5&&castY>-1&&castY<5) {
				break;
			}
			else {
				System.out.println("호수 범위 안에서 캐스팅하세요 ");
			}
		}
		
		catchfish(castX, castY);
			
		
		
		// 캐스팅 
		hosu[castX][castY]=1;

		while(fishcount>0) {
			//물고기 및 캐스팅 현 상황출력 
			for(int i=0; i<hosu.length; i++) {
				for(int j=0; j<hosu[i].length; j++) {

					if (i==castX && j==castY){
						System.out.print("X");
					}
					else if(hosu[i][j]==1) {
						System.out.print("O");
					}
					else {
						System.out.print("*");
					}
				}System.out.println();
			}
			System.out.println("1.위 2.아래 3.왼쪽 4.오른쪽");
			num=sc.nextInt();
			//4. 이동 
			if (num==1) {
				hosu[castX][castY]=0;
				castX--;
				
				if(castX<0) {
					castX=0;
					System.out.println("더이상 위로 갈 수 없습니다.");
				}
				else {
					hosu[castX][castY]=1;
				}
			}
			
			else if(num==2) {
				
				hosu[castX][castY]=0;
				castX++;
				if(castX>=5) {
					castX=4;
					System.out.println("더이상 아래로 갈 수 없습니다.");
				}
				
			}
			else if(num==3) {
				
				hosu[castX][castY]=0;
				castY--;
				if(castY<0) {
					castY=0;
					System.out.println("더이상 왼쪽으로 갈 수 없습니다.");
				}
				
			}
			else if(num==4) {
				
				hosu[castX][castY]=0;
				castY++;
				if(castY>=5) {
					castY=4;
					System.out.println("더이상 오른쪽으로 갈 수 없습니다.");
				}
				
			}
			else {
				System.out.println("잘못된 입력입니다. ");
			}
		
			//5. 물고기 잡기
			
			catchfish(castX, castY);
		
		}

		
		
		//6. 게임 종료 

			System.out.println("게임 종료");

	}

}
