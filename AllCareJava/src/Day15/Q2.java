package Day15;

import java.util.Random;

class Player{


	int num;
	int run;
	String name;

	Player(int num, String name){
		this.num=num;
		this.name=name;
	}

	int run() {
		Random r = new Random();

		int randomPlayer = r.nextInt(4)+1;

		if(randomPlayer==this.num) {
			
			run += 0;

			System.out.println(num+"라인 "+name+ " 전진거리 "+run+" 이슈발생");

			return run;

		}

		else{ 
			run += r.nextInt(10)+1;

			System.out.println(num+"라인 "+name+ " 전진거리 "+run);

			return run;
		}
	}
}



public class Q2 {

	public static void main(String[] args) {

		//선수객체 생성 
		Player P1 = new Player(1,"한국");
		Player P2 = new Player(2,"중국");
		Player P3 = new Player(3,"미국");
		Player P4 = new Player(4,"러시아");

		//달리기 시작 
		while(P1.run()<100 && P2.run()<100 && P3.run() <100 && P4.run()<100){
			System.out.println("=====================");
			P1.run();
			P2.run();
			P3.run();
			P4.run();
			System.out.println("=====================");
		}
		
		// 단일If로 일일히 다 값을 비교해야함 

	}

}
