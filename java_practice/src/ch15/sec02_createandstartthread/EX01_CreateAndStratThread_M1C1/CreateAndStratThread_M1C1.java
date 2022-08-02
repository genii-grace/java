package ch15.sec02_createandstartthread.EX01_CreateAndStratThread_M1C1;

class SMIFileThread extends Thread{
	@Override
	public void run() {
		String[] strArray= {"원","투","쓰리","포","파이브"};
		try {Thread.sleep(10);} catch(InterruptedException e) {}
	
		for(int i=0; i<strArray.length;i++) {
			System.out.println("- (자막번호) "+strArray[i]);
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}
	}
	
}
public class CreateAndStratThread_M1C1 {

	public static void main(String[] args) {

		Thread smiFileThread=new SMIFileThread();
		smiFileThread.start();
		
		
		int[] intArray= {1,2,3,4,5};
		
		for(int i=0; i<intArray.length;i++) {
			System.out.print("(비디오프레임) "+intArray[i]+" ");
			try {Thread.sleep(200);} catch(InterruptedException e) {}
		}

	}

}
