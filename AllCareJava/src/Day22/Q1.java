package Day22;

import java.util.Scanner;

class Computer extends Product{
	String menu;
	String cpu;
	int price;

	Computer(String menu, String cpu, int price){
		this.menu = menu;
		this.cpu = cpu;
		this.price = price;
	}

	void use() {
		System.out.println("제조사가 "+menu+"인"+cpu+" 컴퓨터를 사용한다.");
	}
}

class AirCorn extends Product{
	String menu;
	String type;
	int price;

	AirCorn(String menu, String type, int price){
		this.menu = menu;
		this.type = type;
		this.price = price;
	}

	void use() {
		System.out.println("제조사가 "+menu+"인"+type+ "에어컨을 사용한다.");
	}
}

class Ref extends Product{
	String menu;
	String type;
	String size;
	int price;

	Ref(String menu, String type, String size, int price){
		this.menu = menu;
		this.type = type;
		this.size = size;
		this.price = price;
	}

	void use() {
		System.out.println("제조사가 "+menu+"인"+type+"형"+size+ "냉장고가 식품을 관리한다.");
	}
}

class AirCleaner extends Product{
	String menu;
	int price;

	AirCleaner(String menu, int price){
		this.menu = menu;
		this.price= price;
	}

	void use() {
		System.out.println("제조사가 "+menu+"인"+"공기청정기가 공기를 깨끗하게 한다.");
	}
}

class Mart{
	Computer[] c = new Computer[10];
	AirCorn[] a = new AirCorn[10];
	Ref[] r = new Ref[10];
	AirCleaner[] ac = new AirCleaner[10];

	int index = -1;


	Mart() {
		for(int i = 0;i<10;i++) {
			if(i<5) { // 0~4
				c[i] = new Computer("삼성", "i7", 200);
				a[i] = new AirCorn("삼성", "벽걸이", 100);
				r[i] = new Ref("삼성", "양문", "600L", 200);
				ac[i] = new AirCleaner("LG", 80);
			}
			else { // 5~9
				c[i] = new Computer("LG", "i5", 150);
				a[i] = new AirCorn("LG", "스탠드", 250);
				r[i] = new Ref("LG", "4도어", "800L", 350);
				ac[i] = new AirCleaner("다이슨", 60);
			}
		}
	}

	Computer sendComputer(int start, int end) {
		for(int i =start;i<end;i++) {
			if(c[i] != null) {
				index = i;
				return c[i];

			}
		}
		return null;
	}

	AirCorn sendAirCorn(int start, int end) {
		for(int i =start;i<end;i++) {
			if(a[i] != null) {
				index = i;
				return a[i];
			}
		}
		return null;
	}

	Ref sendRef(int start, int end) {
		for(int i =start;i<end;i++) {
			if(r[i] != null) {
				index = i;
				return r[i];
			}
		}
		return null;
	}

	AirCleaner sendAirCleaner(int start, int end) {
		for(int i =start;i<end;i++) {
			if(ac[i] != null) {
				index = i;
				return ac[i];
			}
		}
		return null;
	}

	void changeNullComputer() {
		c[index] = null;
	}
	void changeNullAirCorn() {
		a[index] = null;
	}
	void changeNullRef() {
		r[index] = null;
	}
	void changeNullAirCleaner() {
		ac[index] = null;
	}
}

class Human{
	Product[] p = new Product[10];
	int money;

	void recive(Product p) {
		for(int i =0;i<this.p.length;i++) {
			if(this.p[i] == null) {
				this.p[i] = p;
				break;
			}
		}
	}


	void allPrint() {
		for(int i = 0;i<10;i++) {
			if(p[i] !=null) {
				if(p[i] instanceof Computer) {
					((Computer)p[i]).use();
				}

				else if(p[i] instanceof AirCorn) {
					((AirCorn)p[i]).use();
				}
				else if(p[i] instanceof Ref) {
					((Ref)p[i]).use();
				}
				else {
					((AirCleaner)p[i]).use();
				}

			}
		}
	}

}

class Product{

}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mart m = new Mart();
		Human[] h = new Human[3];
		Scanner sc = new Scanner(System.in);

		for(int i = 0;i<h.length;i++) {
			h[i] = new Human();
			System.out.print((i+1)+"번째 소비자 : ");
			h[i].money=sc.nextInt();
		}

		while(h[0].money >= 60 || h[1].money >= 60 || h[2].money >=60) {
			for(int i = 0;i<h.length;i++) {
				System.out.println((i+1)+"번째 소비자 남은 금액 : "+h[i].money);
				if(h[i].money>=60) {
					System.out.print((i+1)+"번재 소비자 상품을 선택해 주세요.1. 컴퓨터 2. 에어콘 3. 냉장고 4. 공기청정기");
					int num = sc.nextInt();
					if(num == 1) {
						System.out.print("1. 삼성 2. LG");
						int num1 = sc.nextInt();
						if(num1 == 1) {
							//200원 이상
							if(h[i].money >= 200) {
								Computer c = m.sendComputer(0, 5);
								if(c == null) {
									System.out.println("물건이 모두 팔렸습니다.");
								}
								else {
									h[i].money -= c.price;
									h[i].recive(c);
									m.changeNullComputer();
								}
							}
							else {
								System.out.println("돈이 부족합니다.");
							}
						}
						else if(num1 == 2) {
							//150원 이상
							if(h[i].money >= 150) {
								Computer c = m.sendComputer(5, 10);
								if(c == null) {
									System.out.println("물건이 모두 팔렸습니다.");
								}
								else {
									h[i].money -= c.price;
									h[i].recive(c);
									m.changeNullComputer();
								}
							}
							else {
								System.out.println("돈이 부족합니다.");
							}
						}
						else {
							System.out.println("잘못된 입력입니다.");
						}
					}
					else if(num == 2) {
						System.out.print("1. 삼성 2. LG");
						int num1 = sc.nextInt();
						if(num1 == 1) {
							//100원 이상
							if(h[i].money >= 100) {
								AirCorn a = m.sendAirCorn(0, 5);
								if(a == null) {
									System.out.println("물건이 모두 팔렸습니다.");
								}
								else {
									h[i].money -= a.price;
									h[i].recive(a);
									m.changeNullAirCorn();
								}
							}
							else {
								System.out.println("돈이 부족합니다.");
							}
						}
						else if(num1 == 2) {
							//250원 이상
							if(h[i].money >= 250) {
								AirCorn a = m.sendAirCorn(5, 10);
								if(a == null) {
									System.out.println("물건이 모두 팔렸습니다.");
								}
								else {
									h[i].money -= a.price;
									h[i].recive(a);
									m.changeNullAirCorn();
								}
							}
							else {
								System.out.println("돈이 부족합니다.");
							}
						}
						else {
							System.out.println("잘못된 입력입니다.");
						}
					}
					else if(num == 3) {
						System.out.print("1. 삼성 2. LG");
						int num1 = sc.nextInt();
						if(num1 == 1) {
							//200
							if(h[i].money >=200) {
								Ref r = m.sendRef(0, 5);
								if(r == null) {
									System.out.println("물건이 다팔렸습니다.");
								}
								else {
									h[i].money -= r.price;
									h[i].recive(r);
									m.changeNullRef();
								}
							}
							else {
								System.out.println("돈이 부족합니다.");
							}
						}
						else if(num1 == 2) {
							//350
							if(h[i].money >=350) {
								Ref r = m.sendRef(5, 10);
								if(r == null) {
									System.out.println("물건이 다팔렸습니다.");
								}
								else {
									h[i].money -= r.price;
									h[i].recive(r);
									m.changeNullRef();
								}
							}
							else {
								System.out.println("돈이 부족합니다.");
							}
						}
						else {
							System.out.println("잘못된 입력입니다.");
						}
					}
					else if(num == 4) {
						System.out.print("1. LG 2. 다이슨");
						int num1 = sc.nextInt();
						if(num1 == 1) {
							//80
							if(h[i].money >=80) {
								AirCleaner ac = m.sendAirCleaner(0, 5);
								if(ac == null) {
									System.out.println("물건이 다 팔렸습니다.");
								}
								else {
									h[i].money -= ac.price;
									h[i].recive(ac);
									m.changeNullAirCleaner();
								}
							}
							else {
								System.out.println("돈이 부족합니다.");
							}
						}
						else if(num1 == 2) {
							//60
							if(h[i].money >=60) {
								AirCleaner ac = m.sendAirCleaner(5, 10);
								if(ac == null) {
									System.out.println("물건이 다 팔렸습니다.");
								}
								else {
									h[i].money -= ac.price;
									h[i].recive(ac);
									m.changeNullAirCleaner();
								}
							}
							else {
								System.out.println("돈이 부족합니다.");
							}
						}
						else {
							System.out.println("잘못된 입력입니다.");
						}
					}
					else {
						System.out.println("잘못된 입력입니다.");
					}
				}
			}
		}

		for(int i = 0;i<h.length;i++) {
			System.out.println((i+1)+"번째 소비자 구매 상품");
			h[i].allPrint();
		}
	}
}