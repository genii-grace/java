package ch18.sec01_lambdaexprssion.EX05_RefOfStaticMethod;

interface A{
	void abc();
}

class B{
	static void bcd() {
		System.out.println("method");
	}
}

public class RefOfStaticMethod {

	public static void main(String[] args) {
		
		A a1=new A() {
			@Override
			public void abc() {
				B.bcd();
			}
		}; //익명이너클래스 

		A a2=()->{B.bcd();};
		//람다식 표현
		
		A a3=B::bcd;
		//정적메서드 참조
		
		
		a1.abc();
		a2.abc();
		a3.abc();
		

	}

}
