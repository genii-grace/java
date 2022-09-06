package ch18.sec01_lambdaexprssion.EX04_RefOfInstanceMethod_Type1_2;

interface A{
	void abc(int k);
}

public class RefOfInstanceMethod_Type1_2 {

	public static void main(String[] args) {
		
		A a1=new A() {
			@Override
			public void abc(int k) {
				System.out.println("익명이너클래스 사용 : "+k);
			}
		}; // 익명이너클래스
		
		A a2=(int k)->{
			System.out.println("람다식 표현 : "+k);
		};// 람다식 표

		A a3 = System.out::println; // 인스턴스메서드 참조 
		
		a1.abc(3);
		a2.abc(3);
		System.out.print("인스턴스 메서드참조 : ");
		a3.abc(3);

	}

}
