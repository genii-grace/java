package ch07.sec05_thismethod.EX01_ThisMethod_1;

class A{
	A(){
		System.out.println("첫번째 생성자");
	}
	
	A(int a){
	this(); // 클래스 내에 다른 생성자 부름 
	System.out.println("두번째 생성자");
	}
}
public class ThisMethod {
	
	public static void main(String[] args) {
		
		A a1=new A();
		System.out.println();
		
		A a2=new A(3);
	}

}
