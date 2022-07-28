package ch11.sec01_finalmodifier.EX01_FinalModifier_1;

class A1{
	int a=3;
	final int b=5;
	
	A1(){
	 a=4;
//	 b=8; final 필드는 최초 선언 이후 추가 대입/변경 불가
	}
}

class A2{
	int a;
	final int b;
	
	A2(){
		a=3;
		b=5;
	}
}

class A3{
	int a=3;
	final int b=5;
	
	A3(){
		a=5;
//		b=5; final 필드가 이미 선언되었으므로 동일값을 재대입하는 것도 불가함 
	}
}

class B{
	void bcd() {
		int a=3;
		final int b=5;
		a=7;
//		b=9; final 지역변수는 최초값 대입 후 변경/추가대입 불가 
		
		System.out.println(a+","+b);
	}
}
public class FinalModifier_1 {

	public static void main(String[] args) {

		A1 a1=new A1();
		A2 a2=new A2();
		A3 a3=new A3();
		
		a1.a=11;
		a2.a=21;
		a3.a=31;
		
		B b=new B();
		
		System.out.println(a1.a+","+a2.a+","+a3.a);
		System.out.println();
		b.bcd();
	}

}
