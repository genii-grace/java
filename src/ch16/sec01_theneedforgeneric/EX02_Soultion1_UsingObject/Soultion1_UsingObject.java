package ch16.sec01_theneedforgeneric.EX02_Soultion1_UsingObject;


class Apple{}
class Pencil{}

class Goods{
	private Object obj =new Object();
	public Object getObject() {
		return obj;
	}
	public void setObject(Object obj) {
		this.obj=obj;
	}
}


public class Soultion1_UsingObject {

	public static void main(String[] args) {
		
		Goods goods1=new Goods();
		goods1.setObject(new Apple()); //Apple 타입으로 입력 
		Apple apple=(Apple)goods1.getObject();//Object를 Apple 로 다운캐스팅 
		
		Goods goods2=new Goods();
		goods2.setObject(new Pencil());
		Pencil pen=(Pencil)goods2.getObject();

	}

}
