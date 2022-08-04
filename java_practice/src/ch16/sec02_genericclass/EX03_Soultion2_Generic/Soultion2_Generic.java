package ch16.sec02_genericclass.EX03_Soultion2_Generic;

class Apple{}
class Pencil{}

class Goods<T>{
	private T t;
	public T get(){
		return t;
	}
	public void set(T t) {
		this.t=t;
	}
}

public class Soultion2_Generic {

	public static void main(String[] args) {

		Goods<Apple> goods1=new Goods<>();
		goods1.set(new Apple());
		Apple apple=goods1.get();



		Goods<Pencil> goods2=new Goods<>();
		goods2.set(new Pencil());
		Pencil pen=goods2.get();
	}

}
