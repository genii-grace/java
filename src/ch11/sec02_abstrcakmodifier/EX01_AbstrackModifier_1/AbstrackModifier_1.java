package ch11.sec02_abstrcakmodifier.EX01_AbstrackModifier_1;

/*
class Animal{
	void cry() {}
}
아무 기능이 없는, 호출만을 위한 메서드는 추상메서드로 작성
*/

abstract class Animal{
	abstract void cry();
}

class Cat extends Animal{
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
}

public class AbstrackModifier_1 {

	public static void main(String[] args) {

		Animal animal1=new Cat();
		Animal animal2=new Dog();
		
		animal1.cry();
		animal2.cry();
		

	}

}
