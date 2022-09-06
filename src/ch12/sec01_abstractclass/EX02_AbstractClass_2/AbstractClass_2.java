package ch12.sec01_abstractclass.EX02_AbstractClass_2;

abstract class A{
	abstract void abc();
}

public class AbstractClass_2 {

	public static void main(String[] args) {

		A a1=new A() { // 익명이너클래스 방법 
			void abc() {
				System.out.println("방법 2. 익명 이너클래스 방법으로 객체 생성 ");
				
			}
		}; // 잊지말기 ; 

		A a2=new A() { // 객체 생성할 때마다 오버라이딩해줘야 함 
		void abc() {
			System.out.println("방법 2. 익명 이너클래스 방법으로 객체 생성 ");
		}
	};
	
	a1.abc();
	a2.abc();
	
	}
}
