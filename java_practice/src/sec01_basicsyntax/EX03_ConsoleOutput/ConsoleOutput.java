// 기본적인 콘솔 출력방법 --- print, printf, println 차

package sec01_basicsyntax.EX03_ConsoleOutput;

public class ConsoleOutput {
	
	public static void main(String[] ar) {
//		1, System.out.println()
		System.out.println("안녕하세요");
		System.out.println("안녕"+"하세요");
		System.out.println(2+4); //계산되어 6으로 출
		System.out.println(4.6);
		System.out.println("문자"+1);
		System.out.println("문자"+1+2); //문자뒤에 숫자는 문자로 인
		System.out.println(1+2+"문자"); //문자 앞에 나오는 숫자 및 서식은 계산되어 3으로 출
		System.out.println(); // 엔터의 역
	
		int a = 5; // 변수 a를 5로 지정
		String b = "하세요."; //변수 b를 하세요.로 지정
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("안녕"+b);
		System.out.println(a+"안녕"+b);
		System.out.println();
		
//		2, System.out.print()
		System.out.print("반갑");
		System.out.print("습니다");
		System.out.print("7");
		System.out.print("\n");
		System.out.print("\n");
		
//		3, System.out.printf()
		System.out.printf("%d\n",10); // 10진수 
		System.out.printf("%o\n",10); // 8진수 
		System.out.printf("%x\n",10); // 16진수 
		System.out.printf("%s\n","문자열 출력"); // 문자열 
		System.out.printf("%f\n",3.2583);// 실수 
		System.out.printf("%d와 %4.2f\n",10,3.4934); // 전체 4자리, 소수점아래 2자리까지 
		
		
	}

}
