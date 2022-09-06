package ch11.sec01_finalmodifier.EX02_FinalModifier_2;

class A{
	void abc() {}
	final void bcd() {}
}

class B extends A{
	void abc() {}
//	void bcd() {} //final method는 오버라이딩 불가
}

final class C{}
//class D extends C{} //final class는 상속 불가 

public class FinalModifier_2 {

	public static void main(String[] args) {

	}

}
