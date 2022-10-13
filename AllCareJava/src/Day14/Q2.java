package Day14;

class Dog{
	String[] info = new String[2];
	
	void cry() {
		System.out.println(info[0]+"색의 "+info[1]+" 강아지가 짖는다.");
	}
}

class Cat{
	String[] info = new String[2];
	
	void cry() {
		System.out.println(info[0]+"색의 "+info[1]+" 고양이가 야옹한다.");
	}
}

class Bird{
	String[] info = new String[2];
	
	void fly() {
		System.out.println(info[0]+"색의 "+info[1]+" 새가 날아다닌다.");
	}
}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog1 = new Dog();
		dog1.info[0]="하얀";
		dog1.info[1]="1kg";
		dog1.cry();
		
		Dog dog2 = new Dog();
		dog2.info[0]="검은";
		dog2.info[1]="2kg";
		dog2.cry();
		
		Cat cat1 = new Cat();
		cat1.info[0]="갈";
		cat1.info[1]="1kg";
		cat1.cry();
		
		Cat cat2 = new Cat();
		cat1.info[0]="회";
		cat1.info[1]="2kg";
		cat1.cry();
		
		Bird bird = new Bird();
		bird.info[0]="노란";
		bird.info[1]="500g";
		bird.fly();

	}

}
