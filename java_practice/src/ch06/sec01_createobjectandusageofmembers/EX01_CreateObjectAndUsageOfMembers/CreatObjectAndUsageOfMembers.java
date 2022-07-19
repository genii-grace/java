package ch06.sec01_createobjectandusageofmembers.EX01_CreateObjectAndUsageOfMembers;

class A{
	int m=3;
	void print() {
		System.out.println("객체 생성 및 활용 ");
	}
}

public class CreatObjectAndUsageOfMembers {
	
	public static void main(String[] args) {
		
		A a=new A(); // A클래스로 객체를 생성하고 참조변수는 a로 한다.
		
		a.m=5; // A클래스의 m 필드에 5를 입력한다.
		System.out.println(a.m); //A클래스의 m 필드를 읽어온다.
		
		a.print(); // A클래스의 print method를 가져와서 실행한다.
	}
	
	
}
