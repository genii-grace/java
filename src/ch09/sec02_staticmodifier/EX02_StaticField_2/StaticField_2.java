package ch09.sec02_staticmodifier.EX02_StaticField_2;

class A{
	
	int m=3; // instance field
	static int n=5; // static field
}

public class StaticField_2 {

	public static void main(String[] args) {
		
		A a1=new A();
		A a2=new A();
		
		a1.m=10;
		a2.m=20;
		
		System.out.println(a1.m+" , "+a2.m);
		System.out.println();
		
		a1.n=30;
		a1.n=40;
		
		System.out.println(a1.n+" , "+a2.n);
		System.out.println();
		
		A.n=100;
		System.out.println(a1.n+" , "+a2.n);

	}

}
