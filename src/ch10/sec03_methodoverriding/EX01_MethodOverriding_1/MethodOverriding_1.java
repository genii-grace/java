package ch10.sec03_methodoverriding.EX01_MethodOverriding_1;

class A{
	void print() {
		System.out.println("A class");
	}
}

class B extends A{
	@Override
	void print() {
		System.out.println("B class");
	}
}

public class MethodOverriding_1 {
	public static void main(String[] args) {
		
		A aa=new A();
		aa.print();
		
		B bb=new B();
		bb.print();
		
		A ab=new B();
		ab.print();
		
		aa.print();
	}

}
