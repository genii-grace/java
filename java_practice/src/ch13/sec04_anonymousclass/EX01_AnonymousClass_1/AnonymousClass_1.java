package ch13.sec04_anonymousclass.EX01_AnonymousClass_1;

class A{
	C c=new B(); //B생성자로 만든 C타입 객체 의 참조변수 c
	void abc() { // c.bcd 함수호출 하는 함
		c.bcd(); // c가 가리키는 bcd() 함수호출 
	}
	
	class B implements C{ // interface C를 구현하는 B class
		public void bcd() {
			System.out.println("instance inner class");
		} // interface C를 완성시키는 class B
	}
}

interface C{
	public abstract void bcd();
}

public class AnonymousClass_1 {

	public static void main(String[] args) {

		A a=new A();
		a.abc(); // bcd()를 호출함 
	}

}
