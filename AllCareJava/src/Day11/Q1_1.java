package Day11;

import java.util.Scanner;

public class Q1_1 {

	//1. 세과목의 점수를 정수로 입력 (주고 안받고)
	
	static int[] sub = new int[3];
	
	static int[] input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		sub[0] = sc.nextInt();
		System.out.print("영어 : ");
		sub[1] = sc.nextInt();
		System.out.print("수학 : ");
		sub[2] = sc.nextInt();
		
		overInput(sub);
		
		return sub;
	}
	
	//2. 평균 연산 (주고 받고)
	static double avg(int[] sub) {
		return ((double)((sub[0]+sub[1]+sub[2])/3.0));
	}
	
	//3. 평균학점 출력 (주고 받고)
	static String avgCheck(double avg) {
		String scoreCheck="";
		
		if(avg>=95) {
			scoreCheck="A+";
		}
		else if(avg>=90) {
			scoreCheck="B+";
		}
		else if(avg>=85) {
			scoreCheck="B";
		}
		else if(avg>=70) {
			scoreCheck="C+";
		}
		else if(avg>=60) {
			scoreCheck="D";
		}
		else {
			scoreCheck="F";
		}
		return scoreCheck;
	}
	
	//4. 100점을 초과 확인 (안주고 받고)
	static void overInput(int[] sub) {
		for (int i=0; i<sub.length-1;i++) {
		if(sub[i]<-1||sub[i]>=101) {
			overInputPrint();
		}
		}
	}
	//5. 잘못된 입력입니다 출력 (안주고 안받고)
	static void overInputPrint() {
		System.out.println("잘못된 입력입니다.");
		input();
	}
	
	//6. 평균학점 출력 (안주고 받고)
	static void avgScore(double avg, String scoreCheck) {
		System.out.printf("평균 학점은 %.1f 학점은 %s 입니다.\n",avg,scoreCheck);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sub=input();
		avg(sub);
		avgCheck(avg(sub));
		avgScore(avg(sub),avgCheck(avg(sub)));
		
		
		}

}
