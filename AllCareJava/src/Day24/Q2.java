package Day24;

import java.util.Random;
import java.util.Scanner;

abstract class Product{

	String brand;
	String type;
	
	abstract void print();

}

class Computer extends Product{

	Computer(String brand){
		super.type="컴퓨터";
		super.brand=brand;
	}
	void print() {
		System.out.println(type+", "+brand);
	}
}

class AirCorn extends Product{

	AirCorn(String brand){
		super.type="에어컨";
		super.brand=brand;
	}
	void print() {
		System.out.println(type+", "+brand);
	}
}

class Ref extends Product{
	Ref(String brand){
		super.type="냉장고";
		super.brand=brand;
	}
	void print() {
		System.out.println(type+", "+brand);
	}

}

class AirCleaner extends Product{

	AirCleaner(String brand){
		super.type="공기청정기";
		super.brand=brand;
	}
	void print() {
		System.out.println(type+", "+brand);
	}
}

class Mart{

	Product[] p = new Product[40];
	Random r = new Random();
	Mart(){
		for(int i=0; i<p.length; i++) {
			int num = r.nextInt(4);
			if(num==0) { //컴퓨터
				num=r.nextInt(2);
				if(num==0) { // 삼성 
					p[i]= new Computer("삼성");
				}
				else { //엘지 
					p[i]= new Computer("엘지");
				}

			}
			else if(num==1) {//에어컨
				num=r.nextInt(2);
				if(num==0) { // 삼성 
					p[i]= new AirCorn("삼성");
				}
				else { //엘지 
					p[i]= new AirCorn("엘지");
				}

			}
			else if(num==2) {//냉장고 
				num=r.nextInt(2);
				if(num==0) { // 삼성 
					p[i]= new Ref("삼성");
				}
				else { //엘지 
					p[i]= new Ref("엘지");
				}

			}
			else if(num==3) {//공기청정기
				num=r.nextInt(2);
				if(num==0) { // 삼성 
					p[i]= new AirCleaner("삼성");
				}
				else { //다이슨
					p[i]= new AirCleaner("다이슨");
				}

			}
		}
	}

}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mart m = new Mart();

		for(int i=0; i<m.p.length; i++) {
			System.out.println((i+1)+" : "+m.p[i].type+" "+m.p[i].brand);
		}

		System.out.println("============================");
		Scanner sc = new Scanner(System.in);
		System.out.print("제품 입력 : ");
		String type = sc.next();
		System.out.print("제조사 입력 : ");
		String brand = sc.next();
		
		int count=-1;

		for(int i=0; i<m.p.length; i++) {
			if(m.p[i].type.equals(type) && m.p[i].brand.equals(brand)) {
				count=i;
				break;
				}
			}

		
		if(count>=0) {
			System.out.println("찾는 제품은 "+(count+1)+"번에 있습니다.");
		}
		else {
			System.out.println("찾는 제품이 없습니다. ");
		}
	}

}
