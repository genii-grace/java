package Day20;

import java.util.Random;

class Animal{

	private String type;
	private String color;


	void setType(String type) { 
		this.type=type;
	}
	/*
	 * 강사님 피드백 : 
	 * set을 만들지 않으려면 
	 * Animal(String type, String color){
	 *	this.type=type;
	 *	this.color=color;
	 * }
	 * 
	 * 이후에 자식 생성자에서 동일한 형태로 생성자를 설정하고
	 * super(type, color) 로 부모생성자 호출하여 값을 세팅함.
	 * 
	 */

	String getType() { 
		return type;
	}

	void setColor(String color) { 
		this.color=color;
	}

	String getColor() { 
		return color;
	}
}

class Dog extends Animal{

	void cry() {
		System.out.println(getColor()+"의 "+getType()+"은(는) 짖는다");

	}

}

class Cat extends Animal{

	void cry() {
		System.out.println(getColor()+"의 "+getType()+"은(는) 야옹한다");
	}
}

class Bird extends Animal{

	void fly(){
		System.out.println(getColor()+"의 "+getType()+"은(는) 날아다닌다");

	}
}

class Zoo{
	Random r= new Random();

	String[] doglist = {"말티즈","요크셔테리어","포메라니안","시바","웰시코기"};
	String[] catlist = {"먼치킨","스핑크스","뱅갈","샴","폴드"};
	String[] birdlist = {"앵무새","참새","닭","까마귀","비둘기"};
	String[] colorlist = {"갈색","검은색","흰색","노란색","점박이"};

	Dog[] dog = new Dog[3];
	Cat[] cat = new Cat[2];
	Bird bird = new Bird();

	Zoo(){
		for(int i=0; i<dog.length; i++) {
			dog[i]=new Dog();
			dog[i].setColor(colorlist[r.nextInt(colorlist.length)]);
			dog[i].setType(doglist[r.nextInt(doglist.length)]);
		}

		for(int i=0; i<cat.length; i++) {
			cat[i]=new Cat();
			cat[i].setColor(colorlist[r.nextInt(colorlist.length)]);
			cat[i].setType(catlist[r.nextInt(catlist.length)]);
		}

		bird.setType(birdlist[r.nextInt(birdlist.length)]);
		bird.setColor(colorlist[r.nextInt(colorlist.length)]);


	}

}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Zoo zoo = new Zoo();

		int dogR=r.nextInt(3);
		int catR=r.nextInt(2);

		zoo.dog[dogR].cry();
		zoo.cat[catR].cry();
		zoo.bird.fly();

	}

}
