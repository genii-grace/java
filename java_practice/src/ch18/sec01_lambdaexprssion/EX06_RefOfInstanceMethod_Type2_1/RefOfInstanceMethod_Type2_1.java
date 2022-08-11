package ch18.sec01_lambdaexprssion.EX06_RefOfInstanceMethod_Type2_1;


interface A{
	void abc(B b, int k);
}

class B{
	void bcd(int k) {
		System.out.println(k);
	}
}

public class RefOfInstanceMethod_Type2_1 {

	public static void main(String[] args) {
		
		A a1=new A() {
			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};//익명이너클래스 
		
		A a2=(B b, int k)->{b.bcd(k);};
		//람다식 표현
		
		A a3=B::bcd;
		// 직접 정의한 인스턴스 메서드 참조
		a1.abc(new B(),3);
		a2.abc(new B(), 3);
		a3.abc(new B(), 3);


	}

}
