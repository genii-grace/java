package Review;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] agrs) {

		//세과목의 점수를 입력 받음 (국어, 영어, 수학)
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();

		// 과목별 입력 점수 초과 확인 
		if(kor>=0&&kor<=100&&math>=0&&math<=100&&eng>=0&&eng<=100) {

			// 평균을 소숫점 첫자리까지 계산
			double avg = ((double)(kor+math+eng))/3;
			String num;
			// 학점 계산 
			if(avg>=95) {
				num="A+";
			}
			else if(avg>=90) {
				num="A";
			}
			else if(avg>=85) {
				num="B+";
			}
			else if(avg>=80) {
				num="B";
			}
			else if(avg>=75) {
				num="C+";
			}
			else if(avg>=70) {
				num="C";
			}
			else if(avg>60) {
				num="D";
			}
			else {
				num="F";
			}
			// 평균과 학점 출력
			System.out.printf("학점은 %.1f이고 학점은 "+num+" 입니다.",avg);
		}
		// 100점을 초과하는 점수를 입력하면 평균 계산을 하지 않고 
		// 과목별로 점수를 잘못 입력 됐습니다. 출력 
		else {
			if(kor<0||kor>100) {
				System.out.print("국어 ");
			}
			if(math<0||math>100) {
				System.out.print("수학 ");
			}
			if(eng<0||eng>100) {
				System.out.print("영어 ");
			}
			System.out.println("점수를 잘못 입력했습니다.");
		}
	}

}

