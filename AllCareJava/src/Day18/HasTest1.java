package Day18;

class B{
	
}

class C{
	
	B[] b=new B[5]; // has관계 : 가지고 있음 
}

class D{
	B make(B[] b) {
		b[2] = new B(); // 기능속에 정의될 뿐 가진게 아님 
		
		return b[2];
	}
}

class E{
	D[][]d = new D[3][3];
	
	D[] send(D[][] d, int i, int j) {
		
		d[i][j]=new D();
		return d[i];
	}
	
}

public class HasTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c=new C();
		D d = new D();
		
		D[][] d1= new D[3][3];
		
		B b=d.make(c.b);
		
		E e = new E();
		
		e.send(d1, 0, 2);
		
	}

}
