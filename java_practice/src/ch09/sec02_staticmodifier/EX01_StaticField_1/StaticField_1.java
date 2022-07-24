package ch09.sec02_staticmodifier.EX01_StaticField_1;

class A{
	int m=3; // 인스턴스 필드 
	static int n=5; // 정적 필드 
}
public class StaticField_1 {

	public static void main(String[] args) {
//		인스턴스 필드 사용
		
		A a1= new A();
		System.out.println(a1.m);
		
//		정적 필드 사용
		
		System.out.println(A.n);

	}

}
