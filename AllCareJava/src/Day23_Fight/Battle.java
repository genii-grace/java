package Day23_Fight;

import java.util.Random;

class Battle {

	Burf bf = new Burf();
	Random r = new Random();
	
	//랜덤 버프고르기 
	int randomFunction () {
		
		return r.nextInt(3)+1;
	}
	
	
	//버프 적용 
	void addBurf(Unit u, int i) {
		if(i==1) {//공격력 
			
			u.attack += bf.burfFunction(u, i);
			
			
		}
		else if(i==2) { //힐 
			
			u.hp += bf.burfFunction(u, i);
			
		}
		else { //디버프 
			
			u.hp -= bf.burfFunction(u, i);
			
		}
	}
	
	//공격 
	void attack (Unit u1, Unit u2) { //u1 공격자 u2 피해자
		
		System.out.println(u1.name+"의 공격! (hp : "+u1.hp+", attack : "+u1.attack+")");
		u2.hp -= u1.attack;
		System.out.println(u2.name+"의 체력이 "+u2.hp+" 만큼 남았습니다.\n");
		
	}
	
	//hp 체크
	Unit hpCheck (Unit u) {
		if(u != null && u.hp <=0) {
			System.out.println("=======================================");
			System.out.println(u.name+"이(가) 사망하였습니다.");
			u=null;
			return u;
		}
		return u;
	}
	
	//게임종료 체크
	boolean gameOverCheck (Unit u) {
		if(u != null) {
			return true;
		}
		else {
			return false;
		}
	}

}
