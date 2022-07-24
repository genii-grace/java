package sec01_accessmodifier.EX01_AccessModifierOfMember.pack1;

public class A {
	
	public int a=1; // 모든 패키지, 모든 클래스 가능 
	protected int b=2; // 같은 패키지, 모든 클래스, 다른패키지의 자식클래스 가
	int c=3; // 동일패키지 모든 클래스 
	private int d=4; // 동일클래스에서만 
	
	public void print() {
		System.out.print(a+" ");
		System.out.print(b+" ");
		System.out.print(c+" ");
		System.out.print(d+" "); 
		
		System.out.println();
	}

}
