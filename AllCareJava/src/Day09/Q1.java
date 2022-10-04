package Day09;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. 남은 자리 체크
		 * 2. 자리 인덱스 입력받기
		 * 3. 인덱스 8, 1 보다 크면 잘못된 입력 -> 첫화면으로 리턴
		 * 4-1. 입력한 자리 비어있으면 (null) 예약완료 출력 -> 그 칸 채워줌[숫자 1]  -> 첫화면 
		 * 4-2. 입력한 자리에 사람 있으면 (숫자 1) 다시 에약해주세요 출력 -> 비어있는 인덱스(null) 자리 출력 -> 첫화면 
		 */


		//0. Setting

		Scanner sc = new Scanner(System.in);


		int count=0;

		String[][] fly= new String[9][2];

		//1. 남은 자리 체크 
		while(true) {
			count=0;
			for(int i=0; i<fly.length; i++) {
				for(int j=0; j<fly[i].length; j++) {
					if(fly[i][j]==null) {
						count++;
					}
				}
			}
			if(count==0) {
				System.out.println("예약 할 수 있는 자리가 없습니다.");
				
			}
			else {
				//2. 자리 인덱스 입력받기 
				System.out.print("예약하실 좌석을 입력해주세요 (총 "+count+"석) : ");
				int i = sc.nextInt(); //행 
				int j = sc.nextInt(); //열 

				//3. 인덱스 8, 1보다 크면 잘못된 입력 
				if(i>=9 || i<0 || j>=2 || j<0) {
					System.out.println("잘못된 입력입니다.");
				}

				// 정상입력 분기
				else {
					//4-1. 입력한 자리가 비어있을 때, 
					if(fly[i][j]==null) {
						fly[i][j]="1";
						System.out.println("예약이 완료 되었습니다.");
					}

					//4-2. 입력한 자리가 비어있지 않을 때 
					else {

						System.out.println("예약이 완료된 자리입니다. 다시 예약해 주세요");
						for(i=0; i<fly.length;i++) {
							for(j=0; j<fly[i].length; j++) {
								if(fly[i][j]==null) {
									System.out.print("["+i+", "+j+"]");

								}
								else {
									continue;
								}
								//System.out.println();
							}System.out.println();
						}
					}
				}

			}
		}
	}

}
