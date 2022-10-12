package Day13;

import java.util.Random;
import java.util.Scanner;

public class Q2_no25 {

	static int fish(Random r, int[][] hosu) { //랜덤으로 물고기 위치 세팅

		int fishcount = 0;
		while(fishcount < 3) {
			int h = r.nextInt(5); // 행 랜덤
			int y = r.nextInt(5); // 열 랜덤
			if(hosu[h][y] == 0) {
				hosu[h][y] = 1;
				fishcount++;
			}
		}

		return fishcount;

	}

	static int[] inputCasting(Scanner sc) {

		int[] input = new int[2];

		System.out.print("행 입력 : ");
		int h = sc.nextInt();
		System.out.print("열 입력 : ");
		int y = sc.nextInt();

		//break;
		input[0]=h;
		input[1]=y;
		System.out.println(h+","+y);

		return input;

	}

	static boolean inputCheck(int[] input) {

		if(input[0]>5||input[0]<-1||input[1]>5||input[1]<-1) {
			System.out.println("잘못된 입력입니다.");
			return false;
		}
		else {
			return true;
		}

	}
	
	static void fishPrint(int[][] hosu) {
		for (int i = 0; i < hosu.length; i++)
		{
			for (int j = 0; j < hosu[i].length; j++)
			{
				if (hosu[i][j] == 0)
				{
					System.out.print("○");
				}
				else
				{
					System.out.print("●");
				}
			}
			System.out.println();
		}
	}

	static void castPrint(int[][] hosu, int[] input) {
		for (int i = 0; i < hosu.length; i++)
		{
			for (int j = 0; j < hosu[i].length; j++)
			{
				if(input[0] == i && input[1] == j) {
					System.out.print("X");
				}
				else if (hosu[i][j] == 0)
				{
					System.out.print("○");
				}
				else
				{
					System.out.print("●");
				}
			}
			System.out.println();
		}
	}
	
	static int catchFish(int h, int y, int[][] hosu, int fishcount) {
		
		if(hosu[h][y] == 1) {
			System.out.println("물고기를 잡았습니다.");
			hosu[h][y] = 0;
			fishcount--;
			return fishcount;
		}
		else{
			return fishcount;
		}
	}
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		//1. 5X5 호수 만들기
		int[][] hosu = new int[5][5];
		int[] input = new int[2];

		int fishcount = fish(r, hosu); //물고기 수량 
		fishPrint(hosu); // 물고기 위치 확인 

		//캐스팅
		while(true) {
			input = inputCasting(sc);
			if(inputCheck(input)) {
				break;
			}
			
		}
	
			int h=input[0];
			int y=input[1];


			castPrint(hosu,input);
			//물고기 확인
			fishcount = catchFish(h,y,hosu,fishcount);

			//위, 아래, 왼쪽, 오른쪽
			while(fishcount > 0) {
				System.out.print("1. 위 2. 아래 3. 왼쪽 4. 오른쪽 : ");
				int num = sc.nextInt();
				if(num == 1) {
					h--;
					if(h < 0) {
						System.out.println("더이상 위로 움직일 수 없습니다.");
						h = 0;
					}
				}
				else if(num == 2) {
					h++;
					if(h > 4) {
						System.out.println("더이상 아래로 움직일 수 없습니다.");
						h = 4;
					}
				}
				else if(num == 3) {
					y--;
					if(y<0) {
						System.out.println("더이상 왼쪽으로 움직일 수 없습니다.");
						y=0;
					}
				}
				else if(num == 4) {
					y++;
					if(y>4) {
						System.out.println("더이상 오른쪽으로 움직일 수 없습니다.");
						y=4;
					}
				}
				else {
					System.out.println("잘못된 입력입니다.");
				}
				//물고기 체크
				fishcount = catchFish(h,y,hosu,fishcount);
				//출력
				for (int i = 0; i < hosu.length; i++)
				{
					for (int j = 0; j < hosu[i].length; j++)
					{
						if(h == i && y == j) {
							System.out.print("X");
						}
						else if (hosu[i][j] == 0)
						{
							System.out.print("○");
						}
						else
						{
							System.out.print("●");
						}
					}
					System.out.println();
				}
			}
			System.out.println("물고기 게임을 종료합니다.");
		}

	}
