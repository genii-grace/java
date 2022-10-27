package Day25;

interface Repairable{}


class Unit{
	String name;
	int attack;
	int hitPoint;
	final int MAX_HP;

	Unit(String name, int hp, int attack){
		this.name=name;
		MAX_HP=hp;
		this.attack= attack;
	}
}

class GroundUnit extends Unit{
	GroundUnit(String name, int hp, int attack){
		super(name,hp,attack);
	}
}

class AirUnit extends Unit{
	AirUnit(String name, int hp, int attack){
		super(name, hp,attack);
	}
}

class Tank extends GroundUnit implements Repairable{
	Tank(){
		super("Tank", 150, 10);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}

class SCV extends GroundUnit implements Repairable{
	SCV(){
		super("SCV", 60,5);
		hitPoint = MAX_HP;
	}
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			if(u!=null && u.MAX_HP != u.hitPoint) {
				u.hitPoint+= 1;
				
			}
			
		}
	}
}

class Marine extends GroundUnit implements Heal{
	Marine(){
		super("Marine", 40,6);
		hitPoint = MAX_HP;
	}
	
}

interface Heal{}

class Medic extends GroundUnit implements Heal{
	
	Medic(){
		super("Medic", 80,0);
		hitPoint=MAX_HP;
	}
	
	void hill (Heal h) {
		if(h instanceof Unit) {
			Unit u = (Unit)h;
			if(u!=null && u.MAX_HP != u.hitPoint) {
				u.hitPoint += 1;
			}
			
		}
		
	}
	
}

public class TestAbstract {

}
