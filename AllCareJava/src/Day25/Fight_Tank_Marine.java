package Day25;

class Team1{ //tank, scv

	Tank t = new Tank();
	SCV s = new SCV();
	
	//Tank t = (Tank) new Unit("탱크",150,10);
	//SCV s = (SCV) new Unit("SCV", 60, 5);

	//탱크 피통 체크 
	void hpCheck(Unit u) {
		if(t!=null && t.hitPoint<=0) {
			System.out.println(u.name+" 사망 ");
			t=null; //사망하면 null 
		}
	}

	//게임종료 확인 
	boolean gameOverCheck(Unit u) {
		if(t!=null) {
			return false;
		}
		else {
			return true;
		}
	}
}

class Team2{ //marin

	//마린 4마리 
	Marine[] m = new Marine[4];

	//마린 생성
	Team2() {
		for(int i=0; i<m.length; i++) {
			m[i]=new Marine();
		}
	}
	int turn=0;

	//공격하는 마린 추출 
	Unit marineTurn() {
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

	//공격 당하는 마린 추출 
	Unit beAttackedMarine() {
		for(int i=0; i<m.length; i++) {
			if(m[i]!=null) {
				System.out.println("마린의 "+ i +"번째가 공격당합니다.");
				return m[i];
			}
		}
		return null;
	}	

	void hpCheck(Unit u) {
		for(int i=0; i<m.length; i++) {
			if(m[i]!=null && m[i].hitPoint<=0) {
				System.out.println(u.name+" 사망 ");
				m[i]=null; //사망하면 null 
			}
		}
	}

	//게임종료 체크
	boolean gameOverCheck(Unit u) {
		for(int i=0; i<m.length; i++) {
			if(m[i] !=null) {
				return false;
			}
		}
		return true;
	}
}

class Fight{
	//공격
	void attack (Unit u1, Unit u2) { //u1 공격 
		System.out.println(u1.name+" 공격 ");
		u2.hitPoint -= u1.attack;
		System.out.println(u2.name+" hp "+u2.hitPoint+" 남았습니다.");
	}
}

public class Fight_Tank_Marine {

	public static void main(String[] args) {

		Team1 t1 = new Team1();
		Team2 t2 = new Team2();
		Fight f = new Fight();

		Unit m;

		int turn =1; //team1, team2 턴 
		int t1Turn =0; //탱크&SCV 턴 

		int checkNum=0; //결과구분 

		while(true) {

			System.out.println("=======================================");
			System.out.println(turn++ +"번째 Fight! ");

			//team2 턴
			//공격할 마린 
			m=t2.marineTurn();
			if(m==null) { // 공격할 마린 없을때 
				checkNum=0; //탱크 승리 
				break;
			}
			//공격
			f.attack(m, t1.t);
			//탱크 확인
			t1.hpCheck(t1.t);
			if(t1.gameOverCheck(t1.t)) { //탱크 죽으면 
				checkNum=1; //마린 승리
				break;
			}

			System.out.println("=======================================");
			System.out.println(turn++ +"번째 Fight! ");

			//team1 턴
			//탱크 Or SCV 
			if(t1Turn%2 ==0) {//탱크
				//공격
				m=t2.beAttackedMarine();
				f.attack(t1.t, m);
				t1Turn++;
				//피 확인 
				t2.hpCheck(m);
				if(t2.gameOverCheck(m)) {
					checkNum=0;
					break;
				}
			}
			else {//SCV
				// +) 탱크 피통 확인 추가되어야 함
				t1.s.repair(t1.t);
				System.out.println("탱크 수리! hp : "+t1.t.hitPoint);
				t1Turn++;
			}
		}
		//결과 
		if(checkNum==0) { // 탱크승리 
			System.out.println("*******************************************");
			System.out.println("승리 : 탱크");
			System.out.println("*******************************************");
		}// 마린승리 
		else {
			System.out.println("*******************************************");
			System.out.println("승리 : 마린");
			System.out.println("*******************************************");
		}
	}
}
