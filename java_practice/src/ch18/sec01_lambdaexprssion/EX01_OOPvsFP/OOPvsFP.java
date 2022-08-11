package ch18.sec01_lambdaexprssion.EX01_OOPvsFP;

interface A{
	void abc();
}

class B implements A{
	@Override
	public void abc() {
		System.out.println("method contents 1");
	}
}
public class OOPvsFP {

	public static void main(String[] args) {
		
		A a1=new B();
		a1.abc(); // 자식클래스로 구현하여 객체 생성 
		
		A a2=new A(){
		@Override
		public void abc() {
			System.out.println("method contents 2");					
			}

		}; // 익명이너클래스 사용 
		
		a2.abc();
		
		A a3=()->{System.out.println("method contents 3");};
		a3.abc(); // 람다식 
		

	}	
}
