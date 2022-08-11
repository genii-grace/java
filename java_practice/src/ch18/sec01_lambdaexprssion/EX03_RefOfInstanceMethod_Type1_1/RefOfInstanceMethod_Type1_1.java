package ch18.sec01_lambdaexprssion.EX03_RefOfInstanceMethod_Type1_1;

interface A{
	void abc();
	
}

class B{
	void bcd() {
		System.out.println("method");
	}
}
public class RefOfInstanceMethod_Type1_1 {

	public static void main(String[] args) {
		
		A a1=new A() {
			@Override
			public void abc() {
				B b=new B();
				b.bcd();
			}
		}; // 익명이너클래스 
		
		A a2=()->{
			B b=new B();
			b.bcd();
		}; // 익명이너클래스를 람다식으로 줄인것 

		
		B b=new B();
		A a3=b::bcd; // 람다식 활
		System.out.print("익명이너클래스를 사용 : "); 
		a1.abc();
		System.out.println();
		
		System.out.print("익명이너클래스를 람다식을 사용해 간소화 : "); 
		a2.abc();
		System.out.println();
		
		System.out.print("람다식 활용 : "); 
		a3.abc();
		System.out.println();
	}

}
