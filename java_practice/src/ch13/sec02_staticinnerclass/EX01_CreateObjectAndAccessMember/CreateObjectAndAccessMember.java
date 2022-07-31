package ch13.sec02_staticinnerclass.EX01_CreateObjectAndAccessMember;

class A{
	int a=3;
	static int b=4;
	void method1() {
		System.out.println("instance method");
	
	}
	
	static void method2() {
		System.out.println("static method");
	}
	static class B{
		void bcd() {
//			System.out.println(a);
			System.out.println(b);
//			method1();
			method2();
		}// 정적 이너클래스는 정적멤버만 사용가능 
	}
}
public class CreateObjectAndAccessMember {

	public static void main(String[] args) {

		A.B b= new A.B();
		b.bcd();

	}

}
