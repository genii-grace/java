package ch15.sec02_createandstartthread.EX02_CreateAndThread_M1C2;

class SMIFileThread extends Thread{ // 자막 Thread 
	@Override
	public void run() { // Thread 클래스의 run 오버라이딩 
		
		String[] strArray= {"one","two","three","four","five"};
		try {Thread.sleep(10);} catch(InterruptedException e) {}
		
		for (int i=0;i<strArray.length;i++) {
			System.out.println(" - (자막번호) "+strArray[i]);
			try{Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}
}

class VideoFileThread extends Thread{ // 비디오 Thread
	@Override
	public void run() { // Thread 클래스의 run 오버라이딩 
		
		int[] intArray= {1,2,3,4,5};
		
		for(int i=0;i<intArray.length;i++) {
			System.out.print("(비디오프레임) "+intArray[i]);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
		
	}
}
public class CreateAndThread_M1C2 {

	public static void main(String[] args) {

		Thread smiFileTread=new SMIFileThread(); // 객체생성 
		smiFileTread.start(); // 쓰레드 호출 

		
		Thread videoFileTread=new VideoFileThread();
		videoFileTread.start();
	}

}
