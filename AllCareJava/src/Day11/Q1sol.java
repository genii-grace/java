package Day11;

import java.util.Scanner;

public class Q1sol {

	//1. 입력 주고 안받고
	static int[] input() {
		int[] score = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		score[0] = sc.nextInt();
		
		System.out.print("영어 : ");
		score[1] = sc.nextInt();
		
		System.out.print("수학 : ");
		score[2] = sc.nextInt();
		
		return score;
		
	}
	//2. 평균 학점 연산 주고 받고
	static double avgfunction(int[] score) {
		double avg=(double)((score[0]+score[1]+score[2])/3.0); // 평균값
		return avg;
	}
	//3. 평균 학점 결과 주고 받고
	static String hakjumResult(double avg) {
		String result = "";
		if(avg>=95){
			 result="A+";
		}
		else if(avg>=90){
			result="A";
		}
		else if(avg>= 85) {
			result="B+";
		}
		else if(avg>=80) {
			result="B";
		}
		else if(avg>=75) {
			result="C+";
		}
		else if(avg>=70) {
			result="C";
		}
		else if(avg>=65) {
			result="D";
		}
		else {
			result="F";
		}
		
		return result;
	}
	//4. 잘못된 값 입력 확인 안주고 받고
	static void wrongCheck(int[] score, double avg, String result) {
		if(score[0]>=0&&score[0]<=100&&score[1]>=0&&score[1]<=100&&score[2]>=0&&score[2]<=100) {
			//6. 평균학점 출력 안주고 받고
			hakjumPrint(avg, result);
		}
		else
		{
			//5. 잘못된 입력 출력 안주고 안받고
			wrongPrint();
		}
	}
	//5. 잘못된 입력 출력 안주고 안받고
	static void wrongPrint() {
		System.out.println("잘못된 입력입니다.");
	}
	//6. 평균학점 출력 안주고 받고
	static void hakjumPrint(double avg, String result) {
		System.out.printf("평균 점수는 %.1f, 학점은 %s 입니다.",avg,result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score=input();
		double avg =avgfunction(score);
		String result =hakjumResult(avg);
		wrongCheck(score, avg, result);
	}

}
