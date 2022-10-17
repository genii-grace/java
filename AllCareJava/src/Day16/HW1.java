package Day16;

import java.util.Random;

class Ju {
	Random r = new Random();
	
	String name;
	int hap;
	int num;
	
	Ju(String name){
		
		this.name=name;
		
	}
	
	int juHap() {
		
		num=r.nextInt(6)+1;
		hap += num;
		
		System.out.println(name+" - 랜덤수 : "+num+", 합 : "+hap);
		
		return hap;
	}
	
	void result() {
		System.out.println("\n먼저 50이상 되는 주사위는 "+name+" 입니다.");
	}
}

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ju blue = new Ju("파란주사위");
		Ju red = new Ju("빨간주사위");
		
		while(blue.juHap()<50&&red.juHap()<50) {
			System.out.println();
		}
		
		if(blue.juHap()>=50) {
			
			blue.result();
			
		}
		
		else {
			red.result();
		}

	}

}
