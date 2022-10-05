package Day10;

import java.util.Scanner;

public class Day09HW1sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int R = 0; //행 
		int C = -1; //열, 증가할때 어차피 플러스 될 거라서 
		
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num=sc.nextInt();
		
		int[][] arr=new int[num][num];
		
		int K =num; //반복숫자 
		int SW = 1;//증감을 위한 스위치 
		int N=1; //값 
		
		while(true) {
			
			//열 
			for(int i=0; i<K; i++) {
				C += SW; // 방향을 정해주면서 숫자까지 늘려줌 
				arr[R][C]=N++;
			}
			
			K--; // 반복하는 숫자줄이기 
			if(K==0) { //마지막 숫자인 25를 입력했을 때가 마지막 반복타임이기 때문에 K가 0일때 이 반복문을 탈출.
				break;
			}
			
			//행
			for(int j=0; j<K; j++) {
				R+=SW;
				arr[R][C]=N++;
			}
			
			SW *= -1; //역행으로 바뀌는 시점 
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	


}
