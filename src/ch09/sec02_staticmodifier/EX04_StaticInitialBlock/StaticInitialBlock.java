package ch09.sec02_staticmodifier.EX04_StaticInitialBlock;

class A{
	int a;
	static int b;

	static {
		b=5;
		System.out.println("클래스 A가 로딩됐습니다.");
	} // static field는 static 초기화 블록에서 초기화함.

 	A(){
 		a=3;
 	} //instance field 는 생성자에서 초기화함.
}
public class StaticInitialBlock {

	public static void main(String[] args) {

		System.out.println(A.b);
		
		A a=new A();
		
		System.out.println(a.a);

	}

}
