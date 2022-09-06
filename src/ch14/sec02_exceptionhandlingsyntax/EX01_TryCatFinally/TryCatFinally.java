package ch14.sec02_exceptionhandlingsyntax.EX01_TryCatFinally;

public class TryCatFinally {

	public static void main(String[] args) {

		try {
			
			System.out.println(3/0);
			System.out.println("프로그램 종료(try)"); // 위에서 이미 실행예외가 나왔으므로 여기는 출력되지 않음 
		}
		catch(ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
			System.out.println("프로그램 종료(catch)");
		}
		
		
		try {
			System.out.println(3/0);
		}
		
		catch(ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		}
		finally {
			System.out.println("프로그램 종료");
		}
	}

}
