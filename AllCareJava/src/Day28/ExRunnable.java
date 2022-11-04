package Day28;

class RunnableTest implements Runnable{
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("재미있는 자바 : "+i);
		}
	}
}



public class ExRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunnableTest r = new RunnableTest();
		Thread t = new Thread(r);
		t.start();
		
		
	}

}
