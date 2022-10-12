package Day13;

import java.util.Random;
import java.util.Scanner;

public class Q2_no25 {

	static int fish(Random r, int[][] hosu, int fishcount) { //랜덤으로 물고기 위치 세팅

		//int fishcount = 0;
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

	static int[] inputCasting(Scanner sc) { //캐스팅 위치 입력받기 

		int[] input = new int[2];

		System.out.print("행 입력 : ");
		input[0] = sc.nextInt();
		System.out.print("열 입력 : ");
		input[1] = sc.nextInt();

		//break;
		//input[0]=h;
		//input[1]=y;
		System.out.println(input[0]+","+input[1]);

		return input;

	}

	static boolean inputCheck(int[] input) { //입력범위 체크 

		if(input[0]>5||input[0]<-1||input[1]>5||input[1]<-1) {
			System.out.println("잘못된 입력입니다.");
			return false;
		}
		else {
			return true;
		}

	}

	static void fishPrint(int[][] hosu) { //물고기 위치 출력 
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

	static void castPrint(int[][] hosu, int[] input) {//캐스팅 상황 출력 
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

	static int catchFish(int[] input, int[][] hosu, int fishcount) { //물고기 잡음

		if(hosu[input[0]][input[1]] == 1) {
			System.out.println("물고기를 잡았습니다.");
			hosu[input[0]][input[1]] = 0;
			fishcount--;
			return fishcount;
		}
		else{
			return fishcount;
		}
	}

	static void move(Scanner sc, int[] input) { //캐스팅 이동 
		System.out.print("1. 위 2. 아래 3. 왼쪽 4. 오른쪽 : ");
		int num = sc.nextInt();
		if(num == 1) {
			input[0]--;
			if(input[0] < 0) {
				System.out.println("더이상 위로 움직일 수 없습니다.");
				input[0] = 0;
			}
		}
		else if(num == 2) {
			input[0]++;
			if(input[0] > 4) {
				System.out.println("더이상 아래로 움직일 수 없습니다.");
				input[0] = 4;
			}
		}
		else if(num == 3) {
			input[1]--;
			if(input[1]<0) {
				System.out.println("더이상 왼쪽으로 움직일 수 없습니다.");
				input[1]=0;
			}
		}
		else if(num == 4) {
			input[1]++;
			if(input[1]>4) {
				System.out.println("더이상 오른쪽으로 움직일 수 없습니다.");
				input[1]=4;
			}
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		//1. 5X5 호수 만들기
		int[][] hosu = new int[5][5];
		int[] input = new int[2];

		//물고기 
		int fishcount = 0;
		fishcount=fish(r, hosu,fishcount); //물고기 수량 

		//fishPrint(hosu); // 물고기 위치 확인 

		//캐스팅
		while(true) {
			input = inputCasting(sc); //입력받기 
			if(inputCheck(input)) { //정상입력 확인 
				break;
			}

		}

		//출력 
		castPrint(hosu,input);

		//물고기 확인
		fishcount = catchFish(input,hosu,fishcount);

		//위, 아래, 왼쪽, 오른쪽
		while(fishcount > 0) {
			move(sc, input);

			//물고기 체크
			fishcount = catchFish(input,hosu,fishcount);
			//출력
			castPrint(hosu,input);

		}
		System.out.println("물고기 게임을 종료합니다.");
	}

}
