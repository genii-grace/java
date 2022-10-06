package Day10;

import java.util.Random;
import java.util.Scanner;

public class Practice_FishingSol_Day09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		//1. 5X5 호수 만들기
		int[][] hosu = new int[5][5];
		//2. Random을 통해서 호수에 값을 세팅
		int fishcount = 0;
		while(fishcount < 3) {
			int h = r.nextInt(5); // 행 랜덤
			int y = r.nextInt(5); // 열 랜덤
			if(hosu[h][y] == 0) {
				hosu[h][y] = 1;
				fishcount++;
			}
		}
		
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
		
		//캐스팅
		int h;
		int y;
		while(true) {
			System.out.print("행 입력 : ");
			h = sc.nextInt();
			System.out.print("열 입력 : ");
			y = sc.nextInt();
			if(h>-1 && h<5 && y>-1 && y<5) {
				break;
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		System.out.println(h+","+y);
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
		//물고기 확인
		if(hosu[h][y] == 1) {
			System.out.println("물고기를 잡았습니다.");
			hosu[h][y] = 0;
			fishcount--;
		}
		
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
			if(hosu[h][y] == 1) {
				System.out.println("물고기를 잡았습니다.");
				hosu[h][y] = 0;
				fishcount--;
			}
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
