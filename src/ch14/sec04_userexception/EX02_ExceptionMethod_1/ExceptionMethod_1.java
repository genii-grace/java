package ch14.sec04_userexception.EX02_ExceptionMethod_1;

public class ExceptionMethod_1 {

	public static void main(String[] args) {

		try {
			throw new Exception(); // 예외메세지에 아무것도 입력하지 않았음 
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage()); // null 출력 
		}

		try{
			throw new Exception("예외메세지");
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

}
