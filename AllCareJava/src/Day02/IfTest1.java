package Day02;

import java.util.Scanner;

public class IfTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if 문 테스트
		// 성적 입력 하여 결과 확인하기 -- 90 이상 합격
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하세요 : ");
		int grade = sc.nextInt();
		
		/*
		// 아래 코드는 점수기준 일부만 명시되어 있음
		// 0보다 작은 값 또는 100보다 큰 값을 넣었을 경우에도 결과가 나오므로 해당 부분도 조건으로 잡아줘야 함
		if(grade>=90) { 
			System.out.println("축하합니다 합격입니다.");
			System.out.println("대단하네요!");
		}else {
			System.out.println("아쉽지만 불합격입니다.");
			System.out.println("공부하셨나요?");
		}
		*/
		
		// 합격 90~100
		// 불합격 0~89
		// 이외 잘못된 입력
		
		if(grade>=90 && grade<=100) {
			System.out.println("축하합니다 합격입니다.");
		}
		
		else if(grade >=0 && grade <90) {
			System.out.println("아쉽지만 불합격입니다.");
		}
		
		else 
			System.out.println("잘못된 입력입니다.");
		
		
	}
		

	

}
