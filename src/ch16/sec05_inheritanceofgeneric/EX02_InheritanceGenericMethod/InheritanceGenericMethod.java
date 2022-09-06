package ch16.sec05_inheritanceofgeneric.EX02_InheritanceGenericMethod;

class Parent{
	<T extends Number> void print(T t) {
		System.out.println(t);
	}
}

class Child extends Parent{
	
}


public class InheritanceGenericMethod {

	public static void main(String[] args) {


		Parent p=new Parent();
		p.<Integer>print(10);
		p.print(2.5); //2.5를 보고 Double이 유추되므로 생략
		
		Child c=new Child();
		c.<Double>print(5.8);
		c.print(100);
		
	}

}
