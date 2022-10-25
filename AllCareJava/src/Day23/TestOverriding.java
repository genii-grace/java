package Day23;

class A{
	void abc() {
		System.out.println("A");
	}
}

class B extends A{
	@Override
	void abc() {
		System.out.println("B");
	}
}

class C extends A{
	@Override
	void abc() {
		System.out.println("C");
	}
}

public class TestOverriding {
	
	static void def(A a) { // 부모로 취합 
		a.abc();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		a.abc(); //A
		
		A a1 = new B();
		a1.abc(); //B
		
		A a2 = new C();
		a2.abc(); //C
		
		
		def(a);
	}

}
