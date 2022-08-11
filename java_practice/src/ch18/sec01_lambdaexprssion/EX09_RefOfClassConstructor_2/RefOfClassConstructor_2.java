package ch18.sec01_lambdaexprssion.EX09_RefOfClassConstructor_2;


interface A{
	B abc(int k);
}

class B{
	B(){
		System.out.println("1st Constructor");
	}
	
	B(int k){
		System.out.println("2nd Constructor");
	}
}

public class RefOfClassConstructor_2 {

	public static void main(String[] args) {

		A a1=new A() {
			@Override
			public B abc(int k) {
				return new B(3);
			}
		};
		
		A a2=(int k)->new B(3);
		
		A a3=B::new;
		
		a1.abc(3);
		a2.abc(3);
		a3.abc(3);
		

	}

}
