package Day15;

class Car{ //색상,제조사,최고속력 
	String color;
	String made;
	int max;
	void drive() {
		System.out.println("차량 색상은 "+color+", 제조사는 "+made+", 최고속력은 "+max);
	}
	
}

class Auto{
	String color;
	String made;
	int max;
	void drive() {
		System.out.println("오토바이의 색상은 "+color+", 제조사는 "+made+", 최고속력은 "+max);
	}
}

class Cycle{//제조사,용도
	String made;
	String function;
	void ride() {
		System.out.println("자전거의 제조사는 "+made+", 용도는 "+function);
	}
	
}

class Person1{
	
	Car car1 ;
	Car car2;
	
}

class Person2{
	
	Cycle cycle1;
	Auto auto1;
	
}



public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car();
		car1.color="은색";
		car1.made="Ford";
		car1.max=220;
		
		Car car2 = new Car();
		car2.color="검정색";
		car2.made="BMW";
		car2.max=240;

		Car car3 = new Car();
		car3.color="하얀색";
		car3.made="삼성";
		car3.max=200;
		
		Car car4 = new Car();
		car4.color="형광색";
		car4.made="현대";
		car4.max=180;
		

		Cycle cycle1 = new Cycle();
		cycle1.made="삼천리";
		cycle1.function="산악용";
		
		Cycle cycle2=new Cycle();
		cycle2.made="자이언트";
		cycle2.function="접이식용";
		
		Auto auto1 = new Auto();
		auto1.made="대림";
		auto1.color="빨간색";
		auto1.max=180;
		
	
		Person1 ps1 = new Person1();
		ps1.car1 = car2;
		car2=null;
		
		ps1.car2= car4;
		car4=null;
		
		Person2 ps2 = new Person2();
		ps2.auto1 = auto1;
		auto1=null;
		
		ps2.cycle1=cycle1;
		cycle1=null;
		
		
		ps1.car1.drive();
		ps1.car2.drive();
		
		ps2.auto1.drive();
		ps2.cycle1.ride();
		
		
	}

}
