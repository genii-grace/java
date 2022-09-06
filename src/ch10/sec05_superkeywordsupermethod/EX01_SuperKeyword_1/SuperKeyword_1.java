package ch10.sec05_superkeywordsupermethod.EX01_SuperKeyword_1;

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
		abc(); // this.abc(); 
	}
	
}
public class SuperKeyword_1 {

	public static void main(String[] args) {

		B bb=new B();
		
		bb.bcd();

	}

}
