package ch07.sec05_thismethod.EX02_ThisMethod_2;

class A{
	int m1,m2,m3,m4; // 필드 생성
	A(){
		m1=1;
		m2=2;
		m3=3;
		m4=4;
	} // 필드 초기화
	
	A(int a){
		this();
		m1=a;
	}
	
	A(int a, int b){
		this(a);
		m2=b;
	}
	
	void print() {
		System.out.print(m1+" ");
		System.out.print(m2+" ");
		System.out.print(m3+" ");
		System.out.print(m4+" ");
		System.out.println();
	}
}
public class ThisMethod {
	
	public static void main(String[] args) {
		
		A a1=new A();
		A a2=new A(10);
		A a3=new A(10,20);
		
		a1.print();
		a2.print();
		a3.print();
		System.out.println();
	}

}
