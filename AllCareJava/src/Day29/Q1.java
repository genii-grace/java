package Day29;

import java.util.Random;

class Gift{
	
	String resultName;

	int[] randomGift = new int[100];

	Random r = new Random();
	
	int i= r.nextInt(100);

	synchronized int getGift() {

		randomGift[i] = 1;

		return randomGift[r.nextInt(100)];

	}

}

class Customer extends Thread{

	String name;

	int get;
	

	Customer(String name){
		
		this.name=name;
		
	}

	public void run() {

		Gift g = new Gift();
		
		while(true) {
			get = g.getGift();
			
			if(get==0) {
				g.resultName = null;
			}

			else {
				g.resultName = this.name;
				break;
			}
		}
	}


}


public class Q1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*
		 * 3명의 사람
		 * 100개 경품 중 1개만 랜덤 선물, 나머지는 꽝 
		 * 선물 주기 : 임계영역 
		 * 선물 받는사람 생기면 프로그램 종료
		 * 당첨자 출력
		 */

		Gift gift = new Gift();

		Customer c1 = new Customer("1번 사람");
		Customer c2 = new Customer("2번 사람");
		Customer c3 = new Customer("3번 사람");
		
		c1.start();
		c2.start();
		c3.start();
		
		c1.join();
		c2.join();
		c3.join();
		
		System.out.println("선물받은 사람 : "+gift.resultName);


	}

}
