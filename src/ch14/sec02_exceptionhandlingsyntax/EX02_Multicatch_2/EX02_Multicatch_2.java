package ch14.sec02_exceptionhandlingsyntax.EX02_Multicatch_2;

public class EX02_Multicatch_2 {

	public static void main(String[] args) {


		try {
			System.out.println(3/1);
			int num=Integer.parseInt("10A");
		}
		
		catch (NumberFormatException e) {
			System.out.println("숫자로 바꿀 수 없습니다.");
		}
			
		catch (Exception e) { //예외가 아니므로  실행되지 않음 
			System.out.println("숫자는 0으로 나눌수 없습니다.");
		}

		 
		finally {
			System.out.println("프로그램 종료");
		}
	}

}
