package ch14.sec04_userexception.EX04_UserExceptionExample;

class MinusException extends Exception{
	public MinusException() {
		super();
		
	}
	
	public MinusException(String message) {
		super(message);
	}
}

class OverException extends Exception{
	public OverException() {
		super();
	}
	
	public OverException(String message) {
		super(message);
	}
}

class A{
	void checkScore(int score) throws MinusException, OverException{
		if(score<0) {
			throw new MinusException("예외발생 : 음수값 입력");
		}
		else if(score>100) {
			throw new OverException("예외발생 : 100 초과값 입력");
		}
		else
			System.out.println("정상값 입니다.");
	}
}

public class UserExceptionExample {

	public static void main(String[] args) {
		
		int num1=86;
		int num2=150;
		
		A a=new A();
		
		try {
			a.checkScore(num1);
			a.checkScore(num2);
		}
		catch(MinusException|OverException e) {
			System.out.println(e.getMessage());
		}

	}

}
