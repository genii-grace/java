package Day13;

import java.util.Scanner;

public class Q1_no24 {

	static boolean check =true;
	static int count;

	static int[][] fly= new int[2][1];
	static int[] userInput = new int[2];



	static int seatCheck() {
		count =0;

		for(int i=0; i<fly.length; i++) {
			for(int j=0; j<fly[i].length; j++) {
				if(fly[i][j]==0) {
					count++;
				}
			}
		}

		return count;

	}

	static void fullSeat(int count) {
		if(count==0) {
			System.out.println("예약 할 수 있는 자리가 없습니다.");
			check=false;
		}

	}

	static void userInput(int count, Scanner sc) {
		System.out.print("예약하실 좌석을 입력해주세요 (총 "+count+"석) : ");

		userInput[0] = sc.nextInt(); //행 
		userInput[1] = sc.nextInt(); //열 

		//System.out.println(userInput[0]+","+userInput[1]);

	}

	static void userInputCheck() {
		if(userInput[0]>=9 || userInput[0]<0 || userInput[1]>=2 || userInput[1]<0) {
			System.out.println("잘못된 입력입니다.");
		}
	}


	static boolean reserve() {


		if(fly[userInput[0]][userInput[1]]==0) {
			fly[userInput[0]][userInput[1]]=1;
			System.out.println("예약이 완료 되었습니다.");
			return false;
		}
		else {
			return true;
		}


	}

	static void reReserve(boolean reserve) {


		if(reserve) {
			int i=userInput[0];
			int j=userInput[1];


			if(fly[i][j]==1) {
				System.out.println("예약이 완료된 자리입니다. 다시 예약해 주세요");
				for(i=0; i<fly.length;i++) {
					for(j=0; j<fly[i].length; j++) {
						if(fly[i][j]==0) {
							System.out.print("["+i+", "+j+"]");

						}
						else {
							continue;
						}
						//System.out.println();
					}
					System.out.println();
				}

			}
		}


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. 남은 자리 체크
		 * 2. 자리 인덱스 입력받기
		 * 3. 인덱스 8, 1 보다 크면 잘못된 입력 -> 첫화면으로 리턴
		 * 4-1. 입력한 자리 비어있으면 (null) 예약완료 출력 -> 그 칸 채워줌[숫자 1]  -> 첫화면 
		 * 4-2. 입력한 자리에 사람 있으면 (숫자 1) 다시 에약해주세요 출력 -> 비어있는 인덱스(null) 자리 출력 -> 첫화면 
		 */

		while(check) {

			Scanner sc = new Scanner(System.in);


			seatCheck(); //예약 가능한 자리 수 카운트 
			fullSeat(seatCheck()); //예약이 완료됐을 경우 

			userInput(seatCheck(), sc); //좌석 userInput 입력 
			userInputCheck(); //범위내 입력 확인 

			reReserve(reserve());
			
			


		}
	}
}

