package ch13.sec03_localinnerclass.EX01_AccessMemberAndLocalVariable;

class A{
	int a=3; // field a
	void abc(){ // method abc
		int b=5; // 지역변수 b
		
		class B{// 이너클래스 B
			void bcd(){ //이너클래스 method bcd()
				System.out.println(a); 
				System.out.println(b); 
				
				a=5;
//				b=7; // 지역변수를 이너클래스에서 사용한 경우 static 으로 변경되어 값을 변경할 수 없다.
			}
		}
		
		B bb=new B();
		bb.bcd();
	}
}
public class AccessMemberAndLocalVariable {

	public static void main(String[] args) {

		A a=new A();
		
		a.abc();
		
	}

}
