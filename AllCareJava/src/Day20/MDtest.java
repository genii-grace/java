package Day20;

class A{
	
	public int a; //모두 사용가능 
	private int b; // 나만 
	protected int c; //상속받은 것만 
	int d; 
	
	void setB(int b) { //b저장 
		this.b=b;
	}
	
	int getB() { //b가져옴 
		return b;
	}
}

class B extends A{
	
	void recive() {
		a=20;
		//b=30;
		c=40;
		d=50;
		
	}
}

public class MDtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a =new A();
		a.setB(10);
		System.out.println(a.getB());
		
	}

}
