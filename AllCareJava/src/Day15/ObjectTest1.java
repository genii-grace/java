package Day15;


class A{
	
	B b=new B();
	
	D makeD() {
		D d = new D();
		return d;
	}
	
	B makeB() {
		return b;
	}
	
	
}

class B{
	
	int b;
	
	
}

class D{
	
	int d;
	

}


public class ObjectTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		D d1 = a.makeD();
		D d2 = a.makeD();
		
		d1.d = 10;
		
		System.out.println(d1.d);
		System.out.println(d2.d);
		
		B b1 = a.makeB();
		B b2 = a.makeB();
		
		b1.b=20;
		
		System.out.println(b1.b);
		System.out.println(b2.b);
		System.out.println(a.b.b);
		

	}

}
