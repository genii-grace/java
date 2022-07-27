package ch10.sec05_superkeywordsupermethod.EX02_SuperKeyword_2;

class A{
	void abc() {
		System.out.println("abc() of class A");
	}
}

class B extends A{
	void abc() {
		System.out.println("abc() of class B");
	}
	
	void bcd() {
		super.abc();// 자식 class에서 부모class의 abc 메소드 불러오
	} 
}
public class SuperKeyword_2 {

	public static void main(String[] args) {
		
		B bb=new B();
		
		bb.bcd();


	}

}
