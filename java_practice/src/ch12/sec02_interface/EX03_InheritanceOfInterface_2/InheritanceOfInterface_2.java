package ch12.sec02_interface.EX03_InheritanceOfInterface_2;

interface A{
	public abstract void abc();
}

interface B{
	void bcd(); // 컴파일러에서 public abstract 추가
}

class C implements A{
	public void abc() { // interface A를 상속하는 class C
	}
}

public class InheritanceOfInterface_2 {

	public static void main(String[] args) {


	}

}
