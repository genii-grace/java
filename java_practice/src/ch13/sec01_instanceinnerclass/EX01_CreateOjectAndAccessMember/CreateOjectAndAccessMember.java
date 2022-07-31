package ch13.sec01_instanceinnerclass.EX01_CreateOjectAndAccessMember;


class A{
	public int a=3;
	protected int b=4;
	int c=5;
	private int d=6;
	
	void abc() {
		System.out.println("abc() of class A");
	}
	
	class B{ // A의 이너 클래스 
		void bcd() {
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
			abc();
		} // 이너클래스에서는 아우터클래스의 필드와 메서드를 접근지정자 상관없이 사용 가
	}
}
public class CreateOjectAndAccessMember {

	public static void main(String[] args) {

		A a=new A();
		A.B b=a.new B(); //
		b.bcd();
	}

}
