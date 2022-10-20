package Day19;

import java.util.Random;

class PocketMon{
	//포켓몬 특징 
	String name;
	String color;
	String size;

	PocketMon(){
	
		String[] m = {"피카츄","라이츄","파이리","꼬북이"};
		String[] c = {"빨간색","노란색","초록색","파란색"};
		String[] s = {"대","중","소","미니"};
		
		Random r = new Random();
		this.name=m[r.nextInt(m.length)];
		this.color=c[r.nextInt(c.length)];
		this.size=s[r.nextInt(s.length)];

	}

	//포켓몬 특징 출력 
	void pocketMonCheck(){
		System.out.println(color+" "+name+"이고, 크기는 "+size+" 입니다.");
	}
}

class PocketBall{

	int num;
	PocketMon pm;

	PocketBall(int num, PocketMon pm){
		this.num=num;
		this.pm=pm;
	}
}

class Oh{

	
	Random r = new Random();
	PocketMon pm = new PocketMon();
	PocketBall[] pb= new PocketBall[3];

	void pocketmon() {
		for(int i=0; i<pb.length; i++) {
			pb[i] = new PocketBall(r.nextInt(3), new PocketMon());
		}
	}
}

class Jiwoo{
	
	PocketBall pb;
	
}

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 포켓몬도 랜덤(중복 허용) 
		 * 지우가 랜덤 포켓볼 1,2,3 개중에 하나 선택 
		 * 지우 포켓볼에 선택한 포켓몬 받기  
		 * 
		 * 지우가 받은 포켓몬 출력 
		 */
		Random r = new Random();
		Oh oh = new Oh();
		Jiwoo jw = new Jiwoo();
		
		oh.pocketmon();
		
		int num=r.nextInt(3);
		jw.pb = oh.pb[num];
		oh.pb[num]=null;
		
		jw.pb.pm.pocketMonCheck();
		

	}

}
