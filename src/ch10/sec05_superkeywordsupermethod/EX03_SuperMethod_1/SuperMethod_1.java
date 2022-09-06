package ch10.sec05_superkeywordsupermethod.EX03_SuperMethod_1;

class A{
	A(){
		System.out.println("constructor of A");
	}
}

class B extends A{
	B(){
		super(); // 부모클래스 A의 객체를 호출한다.
		System.out.println("constructor of B");
	}
}

class C{
	C(int a){
		System.out.println("constructor of C");
	}
}

class D extends C{
	D(){
		super(3);
	}
}

public class SuperMethod_1 {

	public static void main(String[] args) {

		A aa=new A();
		System.out.println();
		
		B bb=new B(); // 부모클래스 A 객체도 호출하였으므로 A 도 출력됨.

	}

}
