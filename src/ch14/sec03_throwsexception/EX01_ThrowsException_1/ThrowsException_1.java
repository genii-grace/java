package ch14.sec03_throwsexception.EX01_ThrowsException_1;


class A{
	void abc() {
		bcd();
	}
	void bcd() { // bcd()에서 예외처리 
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			
		}
	}
}

class B{
	void abc() { //bcd()가 전가한 예외처리를 abc() 에서 진행 
		try {
			bcd();
		}
		catch (InterruptedException e) {
	}
}
	void bcd() throws InterruptedException{
		Thread.sleep(1000);
	}
}

public class ThrowsException_1 {

	public static void main(String[] args) {

	}

}
