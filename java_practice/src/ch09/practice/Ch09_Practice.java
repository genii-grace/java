package ch09.practice;

class A {

	int a=2;
	static int b=3;
	
	void abc() {
		System.out.println(a);
		System.out.println(b);
	}
	
	static void bcd() {
		
//		System.out.println(a);
		System.out.println(b);
	}

	}

public class Ch09_Practice{
	

public static void main(String[] args) {
	
	A a=new A();
	System.out.println(a.a);
	System.out.println(A.b);
	
	a.abc();
	a.bcd();
	
}
}
