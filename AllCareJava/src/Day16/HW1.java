package Day16;

import java.util.Random;

class Ju {
	Random r = new Random();
	
	String name;
	
	/*
	 * 강사님 피드백 : 
	 * 객체지향의 측면에서는 랜덤값만 만들어주고 
	 * 합값은 메인문에서 발생하는것이 정석
	 */
	int hap; //main
	int num; //main 
	
	Ju(String name){
		
		this.name=name;
		
	}
	
	int juHap() {
		
		num=r.nextInt(6)+1;
		hap += num; //main
		
		System.out.println(name+" - 랜덤수 : "+num+", 합 : "+hap); //main
		
		return hap;
	}
	
	void result() { //main 
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
