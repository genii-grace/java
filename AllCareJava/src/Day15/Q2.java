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

		run += r.nextInt(10)+1;
		System.out.println(num+"라인 "+name+ " 선수 전진거리 "+run);

		return run;

	}

}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player P1 = new Player(1,"한국");
		Player P2 = new Player(2,"중국");
		Player P3 = new Player(3,"미국");
		Player P4 = new Player(4,"러시아");
		
		//int[] result=new int[4];
		
		//result[0]=P1.run();
		//result[1]=P2.run();
		//result[2]=P3.run();
		//result[3]=P4.run();
		
		
		while(P1.run()<100 && P2.run()<100 && P3.run() <100 && P4.run()<100){
		//while(result[0]<100 && result[1]<100 && result[2]<100 && result[3]<100) {
			System.out.println("=====================");
			P1.run();
			P2.run();
			P3.run();
			P4.run();
			System.out.println("=====================");
		}
		

	}

}
