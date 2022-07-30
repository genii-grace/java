package ch12.sec02_interface.EX08.StaticMethod;


interface A{
	static void abc() {
		System.out.println("abc() is static method of interface A");
	}
}
public class StaticMethod {

	public static void main(String[] args) {


		A.abc();
	}

}
