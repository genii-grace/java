package ch15.sec02_createandstartthread.EX03_CreateAndStartThread_M2C1;

class SMIFileRunnable implements Runnable { // Runnable interface 구현 
	@Override
	public void run() { // run() 구현 
		String[] strArray= {"하나","둘","셋","넷","다섯"};
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		
		for(int i=0; i<strArray.length;i++) {
			System.out.println(" - (자막) "+strArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

public class CreateAndStartThread_M2C1 {

	public static void main(String[] args) {

		Runnable smiFileRunnable = new SMIFileRunnable(); // 객체생성
		Thread thread=new Thread(smiFileRunnable); // thread 객체에 전달
		thread.start(); // 스레드 시작
		
		int[] intArray= {1,2,3,4,5}; // 비디오 파일 
		
		for(int i=0;i<intArray.length;i++) {
			System.out.print("(비디오) "+intArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
			// 비디오 스레드  메인에 들어가있는 구문으로 따로 start 하지않아도 실행됨 
		}

	}

}
