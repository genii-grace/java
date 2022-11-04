package Day28;

class ThreadTest extends Thread{ // 쓰레드를 실행하려면 상속이 필수 
	public void run() { // 쓰레드의 run 함수 오버라이딩 
		for(int i=1; i<=10; i++) {
			System.out.println("재미있는 자바 : "+i);
		}
	}
}


public class ExThread1 {

	public static void main(String[] args) { //메인 쓰레드 1 
		// TODO Auto-generated method stub
		
		ThreadTest t = new ThreadTest();
		t.start(); // t로 쓰레드를 시작했지만 메인 쓰레드가 먼저 돌고 t 쓰레드가 돈다 
		for(int i=0; i<10; i++) {
			System.out.println("aaaaaaaa");
		}
		

	}

}
