package Day28;

public class ExDoubleThread1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ThreadTest1 t1 = new ThreadTest1(" : 배우기 쉬운 자바 ");
		ThreadTest1 t2 = new ThreadTest1(" : 배우기 어려운 자바");

		System.out.println("************스레드 시작 전 ***********");
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println("************스레드 종료 후 ***********");

		/*
		 * join 하게 되면 
		 * 메인쓰레드 실행 후 다른 쓰레드가 완료될 때까지 메인이 기다려준 후 끝남 
		 */
	}

}
