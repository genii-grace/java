package ch12.sec02_interface.EX07_DefaultMethod_2;


interface A{
	default void abc() {
		System.out.println("abc() of interface A");
	}
}

class B implements A{
	public void abc() {
		
		A.super.abc();
		System.out.println("abc() of cass B");
		
	}
}
public class DefaultMethod_2 {

	public static void main(String[] args) {

		B b=new B();
		
		b.abc();
	}

}
