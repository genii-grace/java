package Day22;

class A{
	
}

class B extends A{
	
}

class C extends A{
	
}

class D extends A{
	
}

public class CastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new B(); // 업캐스팅 
		
		B b = (B)a; // 다운캐스팅 
		
		A[] listA = new A[10];
		
		listA[0]=new B();
		listA[1]=new C();
		listA[2]=new D();
		
		//부모형의 배열이면 상속하는 자식들의 객체를 담을 수 있음
		
		
		
	}

}
