package Day22;

//유닛생성

class Unit{

	String name;
	int price;
	int hp;
	int attack;
	int defense;
	String target;
	double speed;
	String characteristic;


	Unit(String name, int price, int hp, int attack, int defense, String target, double speed, String characteristic){
		this.name=name;
		this.price=price;
		this.hp=hp;
		this.attack=attack;
		this.defense=defense;
		this.target=target;
		this.speed=speed;
		this.characteristic=characteristic;
	}

}

class Juggling extends Unit{

	Juggling() {
		super("저글링",50,35,5,0,"지상",2.612,"지상,소형,생체");
	}

	void print() {
		System.out.println(super.name+"의 생산비용은 미네랄 "+super.price+", 체력 "+super.hp+" 공격력 "+super.attack+" 방어력 "+super.defense+" 공격대상 "+super.target+" 이동속도 "+super.speed+" 유닛 특성 "+super.characteristic+" 입니다.");
		System.out.println("--------------------------------------------");
	}

}

class Hydra extends Unit{

	Hydra() {
		super("히드라",100,80,10,0,"지상, 공중", 1.741,"지상,중형, 생체");
	}

	void print() {
		System.out.println(super.name+"의 생산비용은 미네랄 "+super.price+", 체력 "+super.hp+" 공격력 "+super.attack+" 방어력 "+super.defense+" 공격대상 "+super.target+" 이동속도 "+super.speed+" 유닛 특성 "+super.characteristic+" 입니다.");
		System.out.println("--------------------------------------------");
	}

}

class Marine extends Unit{

	Marine() {
		super("마린",50, 50, 6, 0, "지상, 공중", 1.875, "지상,소형,생체");
	}

	void print() {
		System.out.println(super.name+"의 생산비용은 미네랄 "+super.price+", 체력 "+super.hp+" 공격력 "+super.attack+" 방어력 "+super.defense+" 공격대상 "+super.target+" 이동속도 "+super.speed+" 유닛 특성 "+super.characteristic+" 입니다.");
		System.out.println("--------------------------------------------");
	}	

}

//진영 생성

class Jug{
	Juggling j;
	Hydra h;

	int turn=0;

	//저그 공격할 유닛 생성
	Unit attactJug () {
	
		if(turn%2 == 0) {
			return j;
		}
		else {
			return h;
		
		}
	}
	
	//피통 체크
	Unit hpCheck(Unit u) {
		if(u.hp>0) {
			return u;
		}
		else {
			turn++;
			return null;
		}
	}

	//저그 공격당할 유닛 생성 
	Unit defenseJug() {
		if(j.hp>0) {
			return j;
		}
		else if(h.hp>0) {
			return h;
		}
		else {
			return null;
		}
	}

}


class Terran{

	Marine[] m = new Marine[3];

	Terran() {
		for(int i=0; i<m.length; i++) {
			m[i]= new Marine();
		}
	}

	int turn =0;

	//테란 공격할 유닛 생성
	Marine attactMarine() {
		if(turn % 3 ==0) {
			return m[0];
		}
		
		else if(turn % 3 ==1) {
			return m[1];
		}
		
		else if(turn % 2==2) {
			return m[2];
		}
		else {
			return null;
		}
	}
	
	//테란 공격당할 유닛 생성
	

}

public class HW1_Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



	}
}



