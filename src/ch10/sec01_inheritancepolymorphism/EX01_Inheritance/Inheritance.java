package ch10.sec01_inheritancepolymorphism.EX01_Inheritance;

class Human{
	
	String name;
	int age;
	void eat() {}
	void sleep() {}
}

class Student extends Human{
	int studentID;
	void goToSchool() {}
}

class Worker extends Human{
	int workerID;
	void goToWork() {}
}

public class Inheritance {

	public static void main(String[] args) {
		
//		human 객체 생성
		
		Human h=new Human();
		h.name="지니";
		h.age=30;
		h.eat();
		h.sleep();
		
//		student 객체 생성
		
		Student s=new Student();
		s.name="여미";
		s.age=32;
		s.eat();
		s.sleep();
		s.studentID=128;
		s.goToSchool();
		
//		Worker 객체 생성
		Worker w=new Worker();
		w.name="지수";
		w.age=27;
		w.workerID=128;
		w.eat();
		w.sleep();
		w.goToWork();
				
		
		System.out.println(h.name);
		System.out.println(w.name);
		System.out.println(s.name);

	}

}
