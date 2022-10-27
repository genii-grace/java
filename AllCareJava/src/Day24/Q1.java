package Day24;

import java.util.Random;

abstract class Animal{
	
	String color;
	abstract void print();
}

class Dog extends Animal{
	
	Dog(String color){
		super.color=color;
	}
	
	@Override
	void print() {
		System.out.println("나는 "+color+" 강아지 입니다.");
	}
}

class Cat extends Animal{
	

	Cat(String color){
		super.color=color;
	}
	
	@Override
	void print() {
		System.out.println("나는 "+color+" 고양이 입니다.");
	}
}

class Mcat extends Animal{
	

	Mcat(String color){
		super.color=color;
	}

	@Override
	void print() {
		System.out.println("나는 "+color+" 미어캣 입니다.");
	}
}

class Panda extends Animal{
	

	Panda(String color){
		super.color=color;
	}
	
	@Override
	void print() {
		System.out.println("나는 "+color+ " 판다 입니다.");
	}
}



public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		String[] color = {"빨간색","주황색","노란색","초록색","파란색","남색","보라색"};
		
		Animal[] house = new Animal[10];
		
		
		
		for(int i=0; i<house.length; i++) {
			int num = r.nextInt(4);
			
			if(num == 0) {
				
				house[i]=new Dog(color[r.nextInt(7)]);
				
			}
			else if(num==1) {
				
				house[i]=new Cat(color[r.nextInt(7)]);
				
			}
			else if(num==2) {
				
				house[i]=new Mcat(color[r.nextInt(7)]);
				
			}
			else {
				
				house[i]=new Panda(color[r.nextInt(7)]);
				
			}
			
			
		}
		
		for(int i=0; i<house.length; i++) {
			house[i].print();
		}
		
		
	}
}
