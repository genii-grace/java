package ch14.sec01_typeofexception.EX02_UncheckedException;

class A{}
class B extends A{}

public class UncheckedException {

	public static void main(String[] args) {

		
		System.out.println(3/0); // ArithmeticException 발생
		
		A a=new A();
		B b=(B)a; // ClassCastException 발생 // A 는 부모클래스, B는 자식클래스
		
		int[] array= {1,2,3};
		System.out.println(array[3]); // ArrayIndexOutOfBoundException 발생 //array[2] 가 마지막 인덱스임
		
		int num=Integer.parseInt("10!"); // NumberFormatException 발생 // !문제 
		
		
		String str = null;
		System.out.println(str.charAt(2)); //NullPointerException 발생 // str은 null 상

	}

}
