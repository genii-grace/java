package ch12.sec01_abstractclass.EX01_AbstractClass_1;

abstract class A{
	abstract void abc();
}

class B extends A{
	void abc() {
		System.out.println("방법1. 자식 클래스 생성 및 추상 메서드 구현 ");
	}
}
public class AbstractClass_1 {

	public static void main(String[] args) {

		A b1=new B();
		A b2=new B(); // 객체 생성할때 간편하다 
		
		b1.abc();
		b2.abc();

	}

}
