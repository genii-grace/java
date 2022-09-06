package ch16.sec02_genericclass.EX01_SingleGenericArgument;

class MyClass<T>{ // 제너럴 클래스 
	private T t;
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t=t;
	}
}


public class SingleGenericArgument {

	public static void main(String[] args) {

		MyClass<String> mc1=new MyClass<String>(); //제너럴 클래스를 Sting 타입 객체로 지정
		mc1.set("Hi");
		System.out.println(mc1.get());
		
		MyClass<Integer> mc2=new MyClass<Integer>();
		mc2.set(10);
		System.out.println(mc2.get());
	}

}
