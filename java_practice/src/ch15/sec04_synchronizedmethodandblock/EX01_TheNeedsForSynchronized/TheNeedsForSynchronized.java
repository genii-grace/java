package ch15.sec04_synchronizedmethodandblock.EX01_TheNeedsForSynchronized;


class MyData{
	int data=3;
	
//	public void plusData() { // 일반메서드 
	public synchronized void plusData() { // 동기화 메서드 
		int mydata=data;
		try {Thread.sleep(2000);} catch(InterruptedException e) {}
		data=mydata+1;
	}// mydata에 data 값 가져오고 2초 후에 data에 mydata+1 한 값 대입 
}
class PlusThread extends Thread{
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData=myData;
	}
	
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName()+"실행결과: "+myData.data);
	}
}
public class TheNeedsForSynchronized {

	public static void main(String[] args) {
		
		MyData myData=new MyData();
		
		Thread plusThread1=new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();

		try {Thread.sleep(1000);} catch(InterruptedException e) {}
		
		Thread plusThread2=new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();

	}

}
