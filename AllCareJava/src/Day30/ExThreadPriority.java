package Day30;

class PriorityTest extends Thread{
	public PriorityTest(String str) {
		setName(str);
	}

	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i+getName()+"우선순위 : "+getPriority());
		}
	}
}

public class ExThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityTest t1 = new PriorityTest(" : 첫번째 스레드");
		PriorityTest t2 = new PriorityTest(" : 두번째 스레드");
		PriorityTest t3 = new PriorityTest(" : 세번째 스레드");

		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);

		t1.start();
		t2.start();
		t3.start();

	}

}
