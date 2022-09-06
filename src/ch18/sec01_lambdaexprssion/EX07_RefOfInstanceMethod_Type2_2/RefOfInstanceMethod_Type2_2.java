package ch18.sec01_lambdaexprssion.EX07_RefOfInstanceMethod_Type2_2;

interface A{
	int abc(String str);
}

public class RefOfInstanceMethod_Type2_2 {

	public static void main(String[] args) {

		A a1=new A() {
			@Override
			public int abc(String str) {
				return str.length();
			}
		}; // 익명이너클래스 
		
		A a2=(String str)->str.length();
		// 람다식 활용
		
		A a3=String::length;
		//자바 인스턴스 메서드 참조
		System.out.println(a1.abc("안녕"));
		System.out.println(a2.abc("안녕"));
		System.out.println(a3.abc("안녕"));
	}

}
