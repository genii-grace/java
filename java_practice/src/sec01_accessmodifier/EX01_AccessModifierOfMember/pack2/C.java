package sec01_accessmodifier.EX01_AccessModifierOfMember.pack2;

import sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.A;

public class C {
	
	public void print() {
		
		A a=new A();
		
		System.out.print(a.a+" ");
//		System.out.print(a.b+" "); 동일패키지 이거나 다른 패키지의 자식클래스 에서만 가능하니 불가 
//		System.out.print(a.c+" "); 동일패키지에서만 가능하기 때문에 다른 패키지인 c에서 불가 
//		System.out.print(a.d+" "); 선언된 a의 클래스안에서만 가능하다. 다른 패키지인c에서 불가  
		
		System.out.println();
	}

}
