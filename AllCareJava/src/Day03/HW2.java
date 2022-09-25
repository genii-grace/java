package Day03;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		문제 : 
		세 과목 국어, 영어,수학의 점수(정수)를 입력받음
		평균을 소숫점 첫째자리까지 계산
		
		출력 : 평균 ㅇㅇ점, 학점은 ㅇㅇ 입니다
	 	
	 	조건 :
	 	a+ 95 점 a 90 점
	 	b+ 85 점 b 80 점
	 	c+ 75 점 c 70 점
		d 60점 이상, f 60점 미만 
		
		100점 이상 입력하면 잘못입력되었습니다. 출력
	   	잘못 입력한 과목과 함께 메세지 출력 
	   	예) 국어, 수학 점수가 잘 못 되었습니다. 출력 
		
		구현방법 : 
		1. Scanner를 이용하여 점수 입력받음
		2. 평균은 소수점 첫째자리 이므로 계산값은 double 이용
		3. 각 점수가 0 이상, 100 이하 일 때 학점 출력 
		4. 각 점수가 0 미만, 100 초과 일 때 단일 If 문 여러개 사용하여 잘못된 과목이름 출력 
		 */
		
		//1. 입력 받기 
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		//2. 평균 구하기
		double avg=(double)((kor+eng+math)/3); // 평균값 
		//System.out.print(avg); //평균값 확인하기 

		//3. 학점출력 
		if(kor>=0&&kor<=100&&eng>=0&&eng<=100&&math>=0&&math<=100) {
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
		//4.잘못된 과목 이름 출력 
		else { 
			if(kor<0||kor>100) {
				System.out.print("국어 ");
			}
			if(eng<0||eng>100) {
				System.out.print("영어 ");
			}
			if(math<0||math>100) {
				System.out.print("수학 ");
			}
			System.out.println("점수가 잘 못 입력되었습니다.");
		}
		
	}


}
