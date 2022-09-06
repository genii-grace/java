package ch07.sec01_field.EX02_InitialValueOfFieldAndLocalVariable;

class A{
	boolean m1; // 부울대수 필드 
	int m2; // 정수 필드 
	double m3; // 실수 필드 
	String m4; // 참조변수 필드 
	
	void printFieldValue() {
		System.out.println(m1); 
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	
	void printLocalVariable() {
		int k; // 지역변수이므로 초기화 해야함 
//		System.out.println(k); 지역변수 k 를 초기화하지않아 오류남 
	}
}

public class InitialValueOfFieldAndLocalVariable {

	public static void main(String[] args) {
		
		A a=new A();
		
		a.printFieldValue(); // 필드는 초기화 하지않아도 초기값이 있
		
	}
	
}
