package ch13.sec01_instanceinnerclass.EX02_UseMemberOfOuterClass;


class A{
	int a=3;
	int b=4;
	void abc() {
		System.out.println("method of class A");
	}
	
	class B{
		int a=5;
		int b=6;
		void abc() {
			System.out.println("method of class B");
		}
		
		void bcd() {
			System.out.println(a); // this. 생략 
			System.out.println(b); // this. 생략 
			abc(); // this.생략
			
			
			System.out.println(A.this.a); //outer class A의 a
			System.out.println(A.this.b);// outer class B의 b
			A.this.abc(); // outer A의 abc()
		}
	}
}
public class UseMemberOfOuterClass {

	public static void main(String[] args) {

		A a=new A();
		
		A.B b=a.new B();
		
		b.bcd();
	}

}
