package ch07.sec04_thiskeyyword.EX01_ThisKeyword_1;

class A{
	int m; //필드 m
	int n; //필드 n
	void init(int a, int b) { // 메서드 init
		int c; // 지역변수 c
		c=3;
		this.m=a; // 클래스 안에서 필드를 불러옴 
		this.n=b;// 클래스 안에서 필드를 불러옴 
	}
	
	void work() {
		this.init(2, 3); //클래스 안에서 메서드에서 다른 메서드를 불러옴 
	}
}
public class ThisKeyword {
	
	public static void main(String[] args) {
		
		A a=new A(); // 클래스 A를 객체로 생성 
		
		a.work();
		System.out.println(a.m);
		System.out.println(a.n);
	}

}
