package ch13.sec05_innerinterface.EX01_CreateObjectOfInnerInterface;


class A{
	interface B{ //class A의 inner interface B
		public abstract void bcd();
	}
}

class C implements A.B{
	public void bcd() {
		System.out.println("이너 인터페이스 구현클래스 생성");
	}
}
public class CreateObjectOfInnerInterface {

	public static void main(String[] args) {
		
		A.B ab=new C();
		C c=new C();
		c.bcd();
		
		A.B b=new A.B() {
			public void bcd() {
				System.out.println("익명이너클래스로 객체생성");
			}
		};
		
		b.bcd();
	}

}
