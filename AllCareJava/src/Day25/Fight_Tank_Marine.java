package Day25;

class Team1{ //tank, scv
	
	int turn=0;
	
	Tank t = new Tank();
	SCV s = new SCV();
	
	

	
	boolean gameOverCheck(Unit u) {
		if(u != null) {
			return true; //안죽음 
		}
		else {
			return false; //죽음 
		}
	}
	
	
}

class Team2{ //marin
	
	//마린 4마리 
	Marine[] m = new Marine[4];
	
	Team2() {
		
		for(int i=0; i<m.length; i++) {
			m[i]=new Marine();
		}
		
	}
	int turn=0;
	
	//공격하는 애 
	Unit marineAttack() {
		if(m[0] != null || m[1]!=null || m[2]!=null || m[3] != null) {
			while(m[turn % 4] == null) {
				turn++;
			}
			System.out.println("마린의 "+turn % 4 +"번째가 공격");
			return m[turn++ % 4];
		}
		else {
			return null;
		}
		
	}
	//공격 당하는 애 
	Unit beAttackMarine() {
		for(int i=0; i<m.length; i++) {
			if(m[i]!=null) {
				return m[i];
			}
		}
		return null;
		
	}	
	
	//마린 다 죽었는지 체크
	
	boolean gameOverCheck(Unit u) {
		for(int i=0; i<m.length; i++) {
			if(m[i] !=null) {
				return true;
			}
			
		}
		return false;
	}
	
}

class Fight{
	//공격
	
	void attack (Unit u1, Unit u2) { //u1 공격 
		System.out.println(u1.name+" 공격 ");
		u2.hp -= u1.hitPoint;
		System.out.println(u2.name+" hp "+u2.MAX_HP+" 남았습니다.");
	}
	
	//피 체크
	
	Unit hpCheck(Unit u) {
		if(u!=null && u.MAX_HP<=0) {
			System.out.println(u.name+" 사망 ");
			u=null; //사망하면 null 
		}
		return u;// 아니면 그대로 
	}

	
}

public class Fight_Tank_Marine {
	
	static void print() {
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Team1 t1 = new Team1();
		Team2 t2 = new Team2();
		Fight f = new Fight();
		
		
		int turn=1;
		boolean check = true;
		
	
		
		while(check) {
			
			System.out.println("=======================================");
			System.out.println(turn++ +"번째 Fight! ");
			System.out.println("=======================================");

			//탱크 공격
			Unit m = t2.beAttackMarine();
			f.attack(t1.t, m);
			
			check = t2.gameOverCheck(f.hpCheck(m));
			if(check == false) {
				System.out.println();
				System.out.println("******************************");
				System.out.println("승리 : 탱크");
				System.out.println("******************************");
				continue;
			}
			
			Thread.sleep(1000);
			
			//마린 공격
			System.out.println("=======================================");
			System.out.println(turn++ +"번째 Fight! ");
			System.out.println("=======================================");
			m=t2.marineAttack();
			f.attack(m, t1.t);
			
			check=t1.gameOverCheck(t1.t);
			if(check == false) {
				System.out.println();
				System.out.println("******************************");
				System.out.println("승리 : 마린");
				System.out.println("******************************");
				break;
			}
			
			
		}
		
		
	}

}
