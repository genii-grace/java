package Day09;

import java.util.Random;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//반복문 조건 
		boolean check=true;

		// 호수 설정 
		int[][] hosu=new int[5][5];

		//물고기 
		int h=0; 
		int r=0; 
		int count=0; //물고기 숫자 

		//낚시꾼  
		int x=0;
		int y=0;
		
		// 랜덤으로 3개위치의 물고기 생성 
		Random rd = new Random();
		for(int i=0; i<3; i++) {
			h=rd.nextInt(5);
			r=rd.nextInt(5);
			
			//중복 
			if(hosu[h][r]==1) {
				i--;
			}
			//중복 아닐때 
			else {
				hosu[h][r]=1;
				count++;
				
				//물고기 위치 출력 
				System.out.println("물고기"+"["+h+","+r+"]");
			}

		}
		Scanner sc=new Scanner(System.in);
		while(check) {
			//캐스팅 
			while(true) {
				System.out.print("캐스팅 위치를 입력하세요 : ");
				x=sc.nextInt();
				y=sc.nextInt();
				
				//범위내 캐스팅 했을 때 
				if(y>-1 && y<5 && x>-1 && x<5) { 
					break;
				}
				//범위 외 캐스팅 했을 때 반복 
				else {
					System.out.println("호수 범위 안에서 입력하세요 ");
				}

			}
			//캐스팅 위치 출력 
			System.out.println("x : "+x+" y : "+y);

			
			//한방에 캐스팅해서 물고기 잡았을 때 
			if(hosu[x][y]==1) {
				System.out.println("물고기를 잡았습니다.");
				hosu[x][y]=0;
				count--;
			}


			while(count>0) {
				System.out.print("1. 위 2. 아래  3. 왼쪽  4. 오른쪽 ");
				int num= sc.nextInt();

				if(num==1) {

					x--;
					if(x<0) {
						System.out.println("더이상 움직일 수 없습니다.");
						x=0;
					}

				}

				else if(num==2) {

					x++;
					if(x>4) {
						System.out.println("더이상 움직일 수 없습니다.");
						x=4;
					}

				}
				else if(num==3) {

					y--;
					if(x<0) {
						System.out.println("더이상 움직일 수 없습니다.");
						y=0;
					}

				}
				else if(num==4) {
					y++;
					if(x>4) {
						System.out.println("더이상 움직일 수 없습니다.");
						y=4;
					}

				}
				else {
					System.out.println("잘못된 입력입니다. ");
				}

				//물고기 체크
				if(hosu[x][y]==1) {
					System.out.println("물고기를 잡았습니다.");
					System.out.println("x : "+x+" y : "+y);
					hosu[x][y]=0;
					count--;
				}

			}
			while(count==0) {
				System.out.println("물고기 게임 종료");
				check=false;
				break;
			}
			
		}

	}



}


