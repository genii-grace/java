package ch06.practice;

class A{
	int m;
	
	void method() {
		System.out.println("A의 메서드 ");
	}
}

public class methodPractice {
	
	public static void main(String[] args) {
		

	A a=new A(); // class A의 객체를 생성하고 참조변수 a를 선언함
	
	a.m=5; // class A 객체에 m 필드에 5를 입력
	System.out.println(a.m);
	
	a.method();
	
	
	
	}
}
