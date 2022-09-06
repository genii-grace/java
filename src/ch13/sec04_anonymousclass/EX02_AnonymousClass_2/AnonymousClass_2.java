package ch13.sec04_anonymousclass.EX02_AnonymousClass_2;


class A{
	C c=new C() { // interface C 객체를 만들기 위해  익명이너클래스 사용 
		public void bcd() {
			System.out.println("익명이너클래스");
		}
	};
	
	void abc() {
		c.bcd();
	}
}

interface C{
	public abstract void bcd();
	
}


public class AnonymousClass_2 {

	public static void main(String[] args) {
	
		A a=new A();
		a.abc();
	}

}
