package ch14.sec02_exceptionhandlingsyntax.EX04_MultiCatch_3;

public class MultiCatch_3 {

	public static void main(String[] args) {

		try {
			System.out.println(3/1);
			int num = Integer.parseInt("10A");
		}
		catch(ArithmeticException e) {
			System.out.println("예외가 발생했습니다.");
		}		catch(NumberFormatException e) {
			System.out.println("예외가 발생했습니다.");
		}
		
		
		try {
			System.out.println(3/1);
			int num=Integer.parseInt("10A");
		}
		catch(ArithmeticException | NumberFormatException e) { //or 연산자를 사용하여 catc블록 통합 
			
			System.out.println("예외가 발생했습니다.");
		}
	}

}
