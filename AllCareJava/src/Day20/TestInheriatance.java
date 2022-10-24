package Day20;


class C{

	
	C(){
		System.out.println("C 생성 ");
	}
	
	void abc() {
		
	}
}

class D extends C{
	
	D(){
		System.out.println("D 생성 ");
	}
	
}

public class TestInheriatance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		D d = new D();
		//자식클래스를 생성하면 부모클래스가 먼저 생성됨
		//그 후 자식클래스 객체 생성됨 
	}

}
