package ch18.sec01_lambdaexprssion.EX09_RefOfClassConstructor_1;

interface A{
	B abc();
}

class B{
	B(){
		System.out.println("1st Constructor");
	}
	
	B(int k){
		System.out.println("2nd Constructor");
	}
}

public class RefOfClassConstructor_1 {

	public static void main(String[] args) {

		A a1=new A() {
			@Override
			public B abc() {
				return new B();
			}
		};
		
		A a2=()->new B();
		
		A a3=B::new;
		
		a1.abc();
		a2.abc();
		a3.abc();
		

	}

}
