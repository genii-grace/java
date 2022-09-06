package ch12.sec02_interface.EX02_InheritanceOfInterface_1;

interface A{}
interface B{}

class C implements A{
	
} // interface A를 상속받는 class C

class D implements A,B{
	
} // interface A,B를 다중상속받는 class D

class E extends C implements A,B{ 
	
} // class C와 interface A,B 를 다중상속받는 class E

public class InheritanceOfInterface_1 {

	public static void main(String[] args) {


	}

}
