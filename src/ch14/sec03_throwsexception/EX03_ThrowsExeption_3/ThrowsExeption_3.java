package ch14.sec03_throwsexception.EX03_ThrowsExeption_3;

class A{
	void abc() {
		bcd();
		
	}
	void bcd() { // bcd()에서 두가지 예외처리 
		try {
			Class cls=Class.forName("java.lang.Object");
			Thread.sleep(1000);
		}
		catch(InterruptedException|ClassNotFoundException e) {
			
		}
	}
}

class B{
	void abc() { //bcd()에서 예외처리 전가하여 abc()에서 처리.
		try {
			bcd();
		}
		catch(InterruptedException|ClassNotFoundException e) {
			
		}
	}
	void bcd() throws InterruptedException, ClassNotFoundException{
		Class cls=Class.forName("java.lang.Object");
		Thread.sleep(1000);
	}
}
public class ThrowsExeption_3 {

	public static void main(String[] args) {


	}

}
