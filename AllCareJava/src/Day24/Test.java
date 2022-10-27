package Day24;

class A{
	void abc (){
		System.out.println("A");
	}
}

class B extends A{
	void abc (){
		System.out.println("B");
	}
}

class C extends A{
	void abc (){
		System.out.println("C");
	}
}



public class Test {

	static void test(A a) {
		a.abc();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub



		A a = new A();
		A a1 = new B();
		A a2 = new C();

		a.abc(); //A
		a1.abc(); //B
		a2.abc(); //C
		
		test(a);
		test(a1);
		test(a2);
		
	}

}
