package Day28;

class A{
	synchronized void plus(int i) {
		for(int j=0; i<5; j++) {
			System.out.println(j*i);
			try {
				Thread.sleep(400); //실행하고 재워놓으면서 순서 정리 
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread{
	A a;
	int i;
	
	B(A a, int i){
		this.a =a;
		this.i=i;
	}
	
	public void run() {
	a.plus(i);
	}
}


public class ExThread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		
		//b1 과 b2 가 a를 동시에 바라보고 있음 
		B b1 = new B(a,3);
		B b2 = new B(a,7);
		b1.start();
		b2.start();
		
		
		
		
	}

}
