package Day04;

import java.util.Scanner;

public class Day03_hw2sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 입력 받기 
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
				
		System.out.print("영어 : ");
		int eng = sc.nextInt();
				
		System.out.print("수학 : ");
		int math = sc.nextInt();
				

		//2. 정상입력일 때 학점출력하기 
		if(kor>=0&&kor<=100&&eng>=0&&eng<=100&&math>=0&&math<=100) {
			
			double avg=(double)((kor+eng+math)/3); // 평균값 
			//System.out.print(avg); //평균값 확인하기
			
			if(avg>=95){
				System.out.printf("평균 점수는 %.1f, 학점은 A+ 입니다.",avg);
			}
			else if(avg>=90){
				System.out.printf("평균 점수는 %.1f, 학점은 A 입니다.",avg);
					}
			else if(avg>= 85) {
				System.out.printf("평균 점수는 %.1f, 학점은 B+ 입니다.",avg);
			}
			else if(avg>=80) {
				System.out.printf("평균 점수는 %.1f, 학점은 B 입니다.",avg);
			}
			else if(avg>=75) {
				System.out.printf("평균 점수는 %.1f, 학점은 C+ 입니다.",avg);
			}
			else if(avg>=70) {
				System.out.printf("평균 점수는 %.1f, 학점은 C 입니다.",avg);
			}
			else if(avg>=65) {
				System.out.printf("평균 점수는 %.1f, 학점은 D 입니다.",avg);
			}
			else {
				System.out.printf("평균 점수는 %.1f, 학점은 F 입니다.",avg);
			}
		}
		//3.잘못된 과목 이름 출력 
		else { 
			
			String wrongSub=""; 
			
			if(kor<0||kor>100) {
				wrongSub+="국어 ";
			}
			if(eng<0||eng>100) {
				wrongSub+="영어 ";
			}
			if(math<0||math>100) {
				wrongSub+="수학 ";
			}
			System.out.println(wrongSub+"점수가 잘 못 입력되었습니다.");

		}
	}

}
