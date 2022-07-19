package ch07.sec01_field.EX01_FieldComponent;

class A{ // 클래스 A 선언 
	int m=3; // 필드 m에 3 입력 
	int n=4; // 필드 n에  입력 
	
	void work1() { // work1 메소드생성 :k값을 출력하고 work2에 연결 
		int k=5; // 지역변수 k에 5 입력 
		System.out.println(k); 
		work2(3); // work2 에 3 전
	}
	
	void work2(int i) { // work2 메소드 생성:입력매개변수를 i로 
		int j=4; // 지역변수 j 에 4 입력 
		System.out.println(i+j); //i와 j 를 더하여 출력 
	}
}
public class FieldComponent {
	
	public static void main(String[] args) {
		
		A a=new A(); // 참조변수 a 로 하고 A클래스로 객체 생성 
		
		System.out.println(a.m); // m필드 값을 읽어오자 
		
		System.out.println(a.n);// n필드 값을 읽어오
		
		a.work1(); // work1 메소드를 실행하자.
		
	}

}
