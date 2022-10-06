package Day11;

import java.util.Scanner;

public class Q1 {

	static int num=0;
	static int kor=0;
	static int eng=0;
	static int math=0;
	static double avg=0.0;
	
	//점수 입력
	static int input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		num=sc.nextInt();

		falseInputCheck(num);

		return num;

	}

	//100점 초과 여부 확인 
	static void falseInputCheck(int num) {
		//100점 초과시 
		if(num<=-1 || num>=101) {
			
			//출력함수콜 
			falseInputPrint();

		}
	}
	//100점 초과시 출력 
	static void falseInputPrint() {
		System.out.println("잘못된 입력입니다.");
		num=0;
		input();
	}

	//평균 연산
	static double avgSubject(int kor, int eng, int math) {
		
		avg=(double)((kor+eng+math)/3);
		
		return avg;
	}
	
	//평균 출력
	static void avgPrint(double avg) {
		System.out.println("평균은 "+avg+"입니다.");
	}
	
	//학점 출력
	static String score(double avg) {
		
		String scoreCheck=null;
		
		if(avg >= 95) {
			scoreCheck="A+";
		}
		else if(avg >= 90) {
			scoreCheck="A";
		}
		else if(avg >=85) {
			scoreCheck="B+";
		}
		else if(avg>=80) {
			scoreCheck="B";
		}
		else if(avg>=70) {
			scoreCheck="C";
		}
		else if(avg>=60) {
			scoreCheck="D";
		}
		else {
			scoreCheck="F";
		}
		
		return scoreCheck;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//점수 입력 받기 
		kor=input();
		eng=input();
		math=input();

		//입력받은 점수를 평균 연산 시작 
		avgSubject(kor,eng,math);
		//평균 출력
		avgPrint(avg);
		
		//학점 계산 
		score(avg);
		System.out.println("학점은 "+score(avg)+"입니다.");
		
	}

}
