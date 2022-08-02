package ch14.sec04_userexception.EX01_CreateUserException;


class MyException extends Exception{ // 예외클래스를 상속하였으므로 일반예외 

	public MyException() { // 생성자
		super();
	}
	
	public MyException(String message) { // 예외메세지 받을 생성자 
		super(message);
	}
}

class MyRTException extends RuntimeException{ // 런타임예외클래스를 상속하였으므로 실행예외

	public MyRTException() {
		super();
	}
	
	public MyRTException(String message) {
		super(message);
	}
}

class A{
	MyException me1=new MyException(); // 객체생성 
	MyException m2=new MyException("예외메세지_MyException"); // 객체생성 
//	생성자가 2개씩이므로 2개씩 객체 생성할 수 있다.
	
	MyRTException mre1=new MyRTException();
	MyRTException mre2=new MyRTException("예외메세지_MyException"); 
	
	void abc_1(int num) { //직접 예외 처리 
		try {
			if(num>70)
				System.out.println("정상작동");
			else
				throw me1; // num이 70보다 작으면 예외발생 
		}
		catch(MyException e) {
			System.out.println("예외처리 1");
		}
	}
	void bcd_1(int num) {
		abc_1(num);

	}
	
	void abc_2(int num) throws MyException { // 예외처리 전가
		if(num>70)
			System.out.println("정상작동");
		else
			throw me1; // num이 70보다 작으면 예외발
	}
	
	void bcd_2(int num) {
		try {
			abc_2(num);
		}
		catch (MyException e) {
			System.out.println("예외처리 2");
		}
	}
}

public class CreateUserException {

	public static void main(String[] args) {

		A a=new A();
		a.bcd_1(80);
		a.bcd_2(65);
	}

}
