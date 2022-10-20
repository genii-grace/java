package Day18;

import java.util.Scanner;

class Computer{

	String brand;
	String cpu;
	int price;

	Computer(String brand, String cpu, int price){

		this.brand = brand;
		this.cpu = cpu;
		this.price = price;

	}

	void function() {
		System.out.println("제조사가 "+brand+" 인 "+cpu+" 컴퓨터를 사용한다.");
	}

}

class AirCorn{

	String brand;
	String type;
	int price;

	AirCorn(String brand, String type, int price){

		this.brand=brand;
		this.type=type;
		this.price=price;
	}

	void function() {
		System.out.println("제조사가 "+brand+" 인 "+type+" 에어컨을 사용한다.");
	}

}

class AirCleaner{

	String brand;
	int price;

	AirCleaner(String brand, int price){
		this.brand=brand;
		this.price=price;
	}

	void function() {
		System.out.println("제조사가 "+brand+" 인 공기청정기가 공기를 깨끗하게 한다.");
	}

}

class Ref{

	String brand;
	String type;
	String size;
	int price;

	Ref(String brand, String type, String size, int price){
		this.brand = brand;
		this.type=type;
		this.size=size;
		this.price=price;
	}

	void function() {
		System.out.println("제조사가 "+brand+" 인 "+type+" 형 "+size+" 냉장고가 식품을 관리한다.");
	}
}
class Market{

	int stock;
	//마트에 제품 공간 마련하기 
	Computer[] com = new Computer[10];
	AirCorn[] ac = new AirCorn[10];
	AirCleaner[] acn = new AirCleaner[10];
	Ref[] r = new Ref[10];

	void market() { // 마켓 공간에 제품 진열하기 

		/*
		 * 강사님 피드백 : for(int i=0; i<10; i++) 로 하고
		 * if(i<5) 로 분기 넣어서 돌려도 됨 
		 */
		for(int i=0; i<5; i++) {
			com[i]=new Computer("삼성","i7",200);
			ac[i]=new AirCorn("삼성","벽걸이",100);
			acn[i]=new AirCleaner("다이슨",60);
			r[i]=new Ref("삼성","양문","600L",200);
		}

		for(int i=5; i<10; i++) {
			com[i]=new Computer("엘지","i5",150);
			ac[i]=new AirCorn("엘지","스탠드",250);
			acn[i]=new AirCleaner("엘지",80);
			r[i]=new Ref("엘지","4도어","800L",350);
		}
	}

	boolean comStock(int num) {
		if(num==1) {//삼성 0~4
			for(int i=0; i<5; i++) {
				if(this.com[i]!=null) {
					this.stock=i;
					return true;
				}
			}
			return false;
		}
		else { //엘지 5~9
			for(int i=5; i<10; i++) {
				if(this.com[i]!=null) {
					this.stock=i;
					return true;
				}
			}
			return false;
		}
	}

	boolean acStock(int num) {
		if(num==1) {//삼성 0~4
			for(int i=0; i<5; i++) {
				if(this.ac[i]!=null) {
					this.stock=i;
					return true;
				}
			}
			return false;
		}
		else { //엘지 5~9
			for(int i=5; i<10; i++) {
				if(this.ac[i]!=null) {
					this.stock=i;
					return true;
				}
			}
			return false;
		}
	}

	boolean acnStock(int num) {
		if(num==1) {//삼성 0~4
			for(int i=0; i<5; i++) {
				if(this.acn[i]!=null) {
					this.stock=i;
					return true;
				}
			}
			return false;
		}
		else { //엘지 5~9
			for(int i=5; i<10; i++) {
				if(this.acn[i]!=null) {
					this.stock=i;
					return true;
				}
			}
			return false;
		}
	}

	boolean rStock(int num) {
		if(num==1) {//삼성 0~4
			for(int i=0; i<5; i++) {
				if(this.r[i]!=null) {
					this.stock=i;
					return true;
				}
			}
			return false;
		}
		else { //엘지 5~9
			for(int i=5; i<10; i++) {
				if(this.r[i]!=null) {
					this.stock=i;
					return true;
				}
			}
			return false;
		}
	}
}

class Client{

	String name;
	int money;

	Client(String name, int money){
		this.name=name;
		this.money=money;
	}

	Computer[] com = new Computer[10];
	AirCorn[] ac = new AirCorn[10];
	AirCleaner[] acn = new AirCleaner[10];
	Ref[] r = new Ref[10];

	boolean moneyCheck(int product) {
		if(product<this.money) {
			return true;
		}
		else if(product==this.money) {
			return true;
		}
		else {
			return false;
		}
	}

	void moneyPrint() {
		System.out.println(name+"이 가진 금액은 총 "+money+"입니다.");
	}
	
	void productCheck() {
		for(int i=0; i<10;i++) {
			if(com[i]!=null) {
				com[i].function();
			}
			if(ac[i]!=null) {
				ac[i].function();
			}
			if(acn[i]!=null) {
				acn[i].function();
			}
			if(r[i]!=null) {
				r[i].function();
			}
		}
	}
}

class BuySystem{

	/*
	 *  마켓에서 사고파는게 실행되므로 
	 *  마켓 내 메서드로 작성 
	 */

	void comBuy(Client c, Market m, int product){
		System.out.println("구매완료");
		for(int i=0;i<c.com.length; i++) {
			if(c.com[i]==null) {
				c.com[i]=m.com[m.stock];
				m.com[m.stock]=null;
				c.money-=product;
				break;
			}
		}
	}

	void acBuy(Client c, Market m, int product){
		System.out.println("구매완료");
		for(int i=0;i<c.com.length; i++) {
			if(c.ac[i]==null) {
				c.ac[i]=m.ac[m.stock];
				m.ac[m.stock]=null;
				c.money-=product;
				break;
			}
		}
	}

	void acnBuy(Client c, Market m, int product){
		System.out.println("구매완료");
		for(int i=0;i<c.com.length; i++) {
			if(c.acn[i]==null) {
				c.acn[i]=m.acn[m.stock];
				m.acn[m.stock]=null;
				c.money-=product;
				break;
			}
		}
	}

	void rBuy(Client c, Market m, int product){
		System.out.println("구매완료");
		for(int i=0;i<c.com.length; i++) {
			if(c.r[i]==null) {
				c.r[i]=m.r[m.stock];
				m.r[m.stock]=null;
				c.money-=product;
				break;
			}
		}
	}
	void buycontroller(Client c, Market m) {
		Scanner sc = new Scanner(System.in);
		System.out.println(c.name+" 상품을 선택하세요. \n1.컴퓨터 2.에어컨 3.냉장고 4.공기청정기 ");
		int num=sc.nextInt();
		//컴퓨터
		if(num==1) { 
			System.out.println("제조사 및 사양을 선택해 주세요. \n1.삼성(i7) 2.엘지(i5)");
			num=sc.nextInt();
			//컴퓨터 - 삼성 
			if(num==1) {
				//재고 체크
				//재고 있음 
				if(m.comStock(num)) {
					//가격 체크
					if(c.moneyCheck(m.com[m.stock].price)) {
						//구매
						comBuy(c, m, m.com[m.stock].price);
						//System.out.println(c.name+"이 가진 금액은 총 "+c.money+"입니다.");
						c.moneyPrint();
					}
					//잔액 부족 
					else {
						System.out.println("현재 보유 : "+c.money+". 잔액이 부족하여 구매가 어렵습니다.");
					}
				}
				//재고 부족 
				else {
					System.out.println("재고가 없습니다.");
				}
			}
			//컴퓨터 - 엘지 
			else if(num==2) {
				//재고 체크
				//재고 있음 
				if(m.comStock(num)) {
					//가격 체크
					if(c.moneyCheck(m.com[m.stock].price)) {
						//구매 
						comBuy(c, m, m.com[m.stock].price); 
						//System.out.println(c.name+"이 가진 금액은 총 "+c.money+"입니다.");
						c.moneyPrint();
					}
					//잔액 부족 
					else {
						System.out.println("현재 보유 : "+c.money+". 잔액이 부족하여 구매가 어렵습니다.");
					}
				}
				//재고 부족 
				else {
					System.out.println("재고가 없습니다.");
				}
			}
			//컴퓨터 - 선택오류 
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		else if(num==2) {//에어컨
			System.out.println("제조사 및 사양을 선택해 주세요. \n1.삼성-벽걸이 2.엘지-스탠드");
			num=sc.nextInt();
			//에어컨 - 삼성 
			if(num==1) {
				//재고 체크
				//재고 있음 
				if(m.acStock(num)) {
					//가격 체크
					if(c.moneyCheck(m.ac[m.stock].price)) {
						//구매
						acBuy(c, m, m.ac[m.stock].price);
						//System.out.println(c.name+"이 가진 금액은 총 "+c.money+"입니다.");
						c.moneyPrint();
					}
					//잔액 부족 
					else {
						System.out.println("현재 보유 : "+c.money+". 잔액이 부족하여 구매가 어렵습니다.");
					}
				}
				//재고 부족 
				else {
					System.out.println("재고가 없습니다.");
				}
			}
			//에어컨 - 엘지 
			else if(num==2) {
				//재고 체크
				//재고 있음 
				if(m.acStock(num)) {
					//가격 체크
					if(c.moneyCheck(m.ac[m.stock].price)) {
						//구매 
						acBuy(c, m, m.ac[m.stock].price); 
						//System.out.println(c.name+"이 가진 금액은 총 "+c.money+"입니다.");
						c.moneyPrint();
					}
					//잔액 부족 
					else {
						System.out.println("현재 보유 : "+c.money+". 잔액이 부족하여 구매가 어렵습니다.");
					}
				}
				//재고 부족 
				else {
					System.out.println("재고가 없습니다.");
				}
			}
			//컴퓨터 - 선택오류 
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		else if(num==3) { //냉장고 
			System.out.println("제조사 및 사양을 선택해 주세요. \n1.삼성-양문형 2.엘지-4도어");
			num=sc.nextInt();
			//냉장고 - 삼성 
			if(num==1) {
				//재고 체크
				//재고 있음 
				if(m.rStock(num)) {
					//가격 체크
					if(c.moneyCheck(m.r[m.stock].price)) {
						//구매
						rBuy(c, m, m.r[m.stock].price);
						//System.out.println(c.name+"이 가진 금액은 총 "+c.money+"입니다.");
						c.moneyPrint();
					}
					//잔액 부족 
					else {
						System.out.println("현재 보유 : "+c.money+". 잔액이 부족하여 구매가 어렵습니다.");
					}
				}
				//재고 부족 
				else {
					System.out.println("재고가 없습니다.");
				}
			}
			//냉장고 - 엘지 
			else if(num==2) {
				//재고 체크
				//재고 있음 
				if(m.rStock(num)) {
					//가격 체크
					if(c.moneyCheck(m.r[m.stock].price)) {
						//구매 
						rBuy(c, m, m.r[m.stock].price); 
						//System.out.println(c.name+"이 가진 금액은 총 "+c.money+"입니다.");
						c.moneyPrint();
					}
					//잔액 부족 
					else {
						System.out.println("현재 보유 : "+c.money+". 잔액이 부족하여 구매가 어렵습니다.");
					}
				}
				//재고 부족 
				else {
					System.out.println("재고가 없습니다.");
				}
			}
			//냉장고 - 선택오류 
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		else if(num==4) {//공기청정기 
			System.out.println("제조사 및 사양을 선택해 주세요. \n1.다이슨 2.엘지");
			num=sc.nextInt();
			//공청기 - 삼성 
			if(num==1) {
				//재고 체크
				//재고 있음 
				if(m.acnStock(num)) {
					//가격 체크
					if(c.moneyCheck(m.acn[m.stock].price)) {
						//구매
						acnBuy(c, m, m.acn[m.stock].price);
						//System.out.println(c.name+"이 가진 금액은 총 "+c.money+"입니다.");
						c.moneyPrint();
					}
					//잔액 부족 
					else {
						System.out.println("현재 보유 : "+c.money+". 잔액이 부족하여 구매가 어렵습니다.");
					}
				}
				//재고 부족 
				else {
					System.out.println("재고가 없습니다.");
				}
			}
			//냉장고 - 엘지 
			else if(num==2) {
				//재고 체크
				//재고 있음 
				if(m.acnStock(num)) {
					//가격 체크
					if(c.moneyCheck(m.acn[m.stock].price)) {
						//구매 
						acnBuy(c, m, m.acn[m.stock].price); 
						//System.out.println(c.name+"이 가진 금액은 총 "+c.money+"입니다.");
						c.moneyPrint();
					}
					//잔액 부족 
					else {
						System.out.println("현재 보유 : "+c.money+". 잔액이 부족하여 구매가 어렵습니다.");
					}
				}
				//재고 부족 
				else {
					System.out.println("재고가 없습니다.");
				}
			}
			//냉장고 - 선택오류 
			else {
				System.out.println("잘못된 입력입니다.");
			}	
		}
		else {
			System.out.println("잘못된 입력입니다. ");
		}
	}
}

public class HW1_market {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//마트 진열
		Market m = new Market();
		m.market();

		//손님 입장 : 금액을 순서대로 입력받아 손님 객체 생성
		// 60원 이상 입력하는 조건 넣어야 함 
		Scanner sc = new Scanner(System.in);

		System.out.print("1번 손님 금액입력 : ");
		Client c1 = new Client("1번 손님",sc.nextInt());

		System.out.print("2번 손님 금액입력 : ");
		Client c2 = new Client("2번 손님",sc.nextInt());

		System.out.print("3번 손님 금액입력 : ");
		Client c3 = new Client("3번 손님",sc.nextInt());

		BuySystem bs = new BuySystem();
		//물건구매 하기 
		//모든 손님 가진돈이 60미만이면 구매 종료 
		while(true) { 

			/*
			 * 강사님 피드백 : 손님도 배열로 넣어서 for문 
			 */
			//최소금액인지 확인 
			if(c1.money>=60) {
				bs.buycontroller(c1, m);

			}
			else if(c2.money>=60) {
				bs.buycontroller(c2,m);

			}
			else if(c3.money>=60) {
				bs.buycontroller(c3,m);
			}
			else {
				System.out.println("구매를 종료합니다.");
				break;
			}
		}
		//구매한 물건 기능 출력
		System.out.println("1번손님 : ");
		c1.productCheck();
		System.out.println();

		System.out.println("2번손님 : ");
		c2.productCheck();
		System.out.println();

		System.out.println("3번손님 : ");
		c3.productCheck();
		System.out.println();
	}

}
