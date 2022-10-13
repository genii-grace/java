package Day14;

class A{
	int a;
	void print() {
		System.out.println("a는 "+a+"입니다.");
	}
}

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		a.print();
		a.a=10;
		a.print();
		
		A b = new A();
		b.print();
	}

}
