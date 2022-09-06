package ch16.sec01_theneedforgeneric.EX01_ProblemsBeforeGeneric;

class Apple{}
class Goods1{
	private Apple apple =new Apple();
	public Apple getApple() {
		return apple;
	}
	public void setApple(Apple apple) {
		this.apple=apple;
	}
}

class Pencil{}
class Goods2{
	private Pencil pen =new Pencil();
	public Pencil getPencil() {
		return pen;
	}
	public void setPencil(Pencil pen) {
		this.pen=pen;
	}
}

public class ProblemsBeforeGeneric {

	public static void main(String[] args) {
		
		Goods1 goods1=new Goods1();
		goods1.setApple(new Apple()); // Apple 타입만 입력가능 
		Apple apple =goods1.getApple(); 
		
		Goods2 goods2=new Goods2();
		goods2.setPencil(new Pencil());
		Pencil pen=goods2.getPencil();
		


	}

}
