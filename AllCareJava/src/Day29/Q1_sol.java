package Day29;

import java.util.Random;

class Gift1{
	
	
}

class GiftBox{
	Gift1[] g= new Gift1[100];
	
	GiftBox() {
		Random r = new Random();
		int num = r.nextInt(100);
		g[num]=new Gift1();
		System.out.println("선물의 위치 : "+num);
		
	}
	
	synchronized Gift1 sendGift(int index) {
		if(index<=99) {
			return g[index];
		}
		
		else {
			return null;
		}
	}
}

class Joiner extends Thread{

	static int index = 0;
	
	GiftBox b;
	
	Gift1 g = null;
	
	Joiner(GiftBox b, String s){
		
		this.b=b;
		setName(s);
		
	}
	
	public void run() {
		
		
		
	}
	
}


public class Q1_sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
