//3가지 유형 if문 

package ch04.sec01_selectcontrolstatement.EX01_IfControlStatement;

public class IfControlstatement {
	
	public static void main(String[] args) {
		
//		if 
		int value1 = 5;
		if(value1>3);{
			System.out.println("실행1");
		}
		
		if(value1<5) {
			System.out.println("실행2"); //거짓이므로 출력 안됨 
		}
		
		boolean bool1=true;
		boolean bool2=false;
		
		if(bool1) {
			System.out.println("실행3");
		}
		
		if(bool2) {
			System.out.println("실행4"); //bool2는 false 이므로 출력 안됨 
		}
		
//		if-else
		int value2 = 5;
		if(value2>3) {
			System.out.println("실행5"); // 참이므로 실행5가 출력됨 
		}else {
			System.out.println("실행6");
		}
		
//		삼항연산자와 변환가능
		System.out.println((value2<3)?"실행5":"실행6"); // 거짓이므로 실행6 출력 
		System.out.println();
		
		
//		복합 if-else문
		
		int value3= 85;
		
		if(value3>=70) {
			System.out.println("C"); // 참이므로 c등급으로 출력되며 탈출함 순서가 중요 
		}else if(value3>=80) {
			System.out.println("B");
		}else if(value3>=90) {
			System.out.println("A");
		}
		else {
			System.out.println("F");
		}
		
		
//		성적변환
		if(value3>=90) {
			System.out.println("A"); // 90점 이상 A
		} else if(value3<90 && value3>=80) {
			System.out.println("B"); // 80점 이상, 90점 미만 B 
		} else if(value3<80 && value3>=70) {
			System.out.println("C"); // 70점 이상, 80점 미만 C
		}
		else {
			System.out.println("F");// 70점 미만 F
		}
	}

}
