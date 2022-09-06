package sec01_accessmodifier.EX01_AccessModifierOfMember.pack1;

public class B {
	
	public void print() {
		A a=new A();
		
		System.out.print(a.a+" ");
		System.out.print(a.b+" ");
		System.out.print(a.c+" ");
//		System.out.print(a.d+" "); 선언된 a의 클래스안에서만 가능하다. 같은 패키지의 b 에서도 사용이 불가 
		
		System.out.println();
	}

}
