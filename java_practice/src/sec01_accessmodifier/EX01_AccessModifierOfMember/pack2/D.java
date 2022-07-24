package sec01_accessmodifier.EX01_AccessModifierOfMember.pack2;

import sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.A;

public class D extends A {
	
	public void print() {
		
		System.out.print(a+" "); //A의 자식클래스라서a.a 이렇게 객체로 읽어오지 않아도 됨 
		System.out.print(b+" ");
//		System.out.print(c+" "); 같은 패키지 가 아니라서 안됨 
//		System.out.print(d+" "); 같은 패키지/같은 클래스 아니라서 안됨 
		
		System.out.println();
	}

}
