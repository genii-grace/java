package Day28;
class AA{
	synchronized void plus(int i) {
		for(int j = 0;j<5;j++) {
			System.out.println(j*i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class B extends Thread{
	AA a;
	int i ;
	B(AA a, int i){
		this.a = a;
		this.i = i;
	}
	public void run() {
		a.plus(i);
	}
}
public class ExThread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a = new AA(); 
		B b1 = new B(a,3);
		B b2 = new B(a,7);
		b1.start();
		b2.start();
	}

}
