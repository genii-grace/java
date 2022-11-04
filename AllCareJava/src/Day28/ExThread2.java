package Day28;

class ThreadTest1 extends Thread{
	public ThreadTest1(String str) {
		setName(str); // 쓰레드의 이름을 지정할 수 있다 .
	}
	
	public void run() {
		for(int i=1; i<= 10; i++) {
			System.out.println(i+ getName()); // 지정한 쓰레드의 이름을 불러온다 .
		}
		System.out.println("끝 "+getName());
	}
}

public class ExThread2 {

	public static void main(String[] args) { //메인 쓰레드 1
		// TODO Auto-generated method stub
		
		ThreadTest1 t1=new ThreadTest1(" : 배우기 쉬운 자바 "); //쓰레드 2 
		ThreadTest1 t2 = new ThreadTest1(" : 배우기 어려운 자바 "); //쓰레드 3 
		
		t1.start();
		t2.start();
		
		
		System.out.println("바이! ");
		
		

	}

}
