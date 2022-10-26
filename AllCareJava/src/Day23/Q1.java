package Day23;

class Gong{
	
	int m;
	int t;
	
	void print() {
		System.out.println("나는 공룡이다.");
	}
	
}

class Tirano extends Gong{
	
	String name;
	
	Tirano(String name, int m, int t){
		this.name =name;
		this.m=m;
		this.t=t;
	}
	@Override
	void print() {
		System.out.println("나는 키 "+super.m+"m 몸무게 "+super.t+"톤인 "+ this.name+" 이다.");
	}
	
}

class Trikera extends Gong{
String name;
	
	Trikera(String name, int m, int t){
		this.name =name;
		this.m=m;
		this.t=t;
	}
	@Override
	void print() {
		System.out.println("나는 키 "+super.m+"m 몸무게 "+super.t+"톤인 "+ this.name+" 이다.");
	}
	
}

class Bukyung extends Gong{
String name;
	
	Bukyung(String name, int m, int t){
		this.name =name;
		this.m=m;
		this.t=t;
	}
	@Override
	void print() {
		System.out.println("나는 키 "+super.m+"m 몸무게 "+super.t+"톤인 "+ this.name+" 이다.");
	}
	
}

public class Q1 {
	
	static void say(Gong g) {
		g.print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gong trn = new Tirano("티라노사우르스", 2, 1);
		Gong trk = new Trikera("트리케라톱스", 3,2);
		Gong bu = new Bukyung("부경사우르스", 5,3);
		
		
		say(trn);
		say(trk);
		say(bu);

	}

}
