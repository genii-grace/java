package ch07.sec02_method.EX02_InternalCallMethod;

public class InternalCallMethod {
	
	public static void main(String[] args) {
		
		print(); // 동일 클래스 내의 메서드 호출 
		
		int a=twice(3);
		System.out.println(a);
		
		double b=sum(a, 5.8);
		System.out.println(b);
		
	}
	
	public static void print() {
		System.out.println("Hi");
	}
	
	public static int twice(int k) {
		return k*2;
	}
	
	public static double sum(int m, double n) {
		return m+n;
	}

}
