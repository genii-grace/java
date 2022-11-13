package Day28;

class Account {
	
	int hap;
	
	
	synchronized int plus() {
			
		
		hap+=1000;
		
		
		/*
		try {
			Thread.sleep(10); //실행하고 재워놓으면서 순서 정리 
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		*/
		return hap;
	}
	
}

class Customer extends Thread{
	String name;
	int count; //성금자 별로 몇번 냈는지 확인 
	
	Account a;
	
	Customer(Account a, String name, int count){
		this.a=a;
		this.name=name;
		this.count=count;
	}
	
	public void run() {

		int hap =0;
		while(hap<500000) {
		hap=a.plus();
		System.out.println(this.name+" : "+count+++"번째");
		
		}
		
	}
}

public class HW {

	public static void main(String[] args) throws InterruptedException {
		
		Account a = new Account();

		Customer c1 = new Customer(a,"1번째 성금자",1);
		Customer c2 = new Customer(a,"2번째 성금자",1);
		Customer c3 = new Customer(a,"3번째 성금자",1);
		Customer c4 = new Customer(a,"4번째 성금자",1);
		Customer c5 = new Customer(a,"5번째 성금자",1);
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		
		c1.join();
		c2.join();
		c3.join();
		c4.join();
		c5.join();
	
		System.out.println("성금 합 : "+a.hap);
	}
}
