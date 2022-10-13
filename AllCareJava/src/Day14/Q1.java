package Day14;

class Pc{ //붕어빵 툴 
	String color; //붕어빵 속성 
	void print() {
		System.out.println("쓰는 기능은 "+color+"색 연필로 적습니다."); //붕어빵 기능 
	}
	
}

class Er{
	String made;
	void print() {
		System.out.println("지우개를 "+made+" 제품으로 지웁니다.");
	}
	
}

class Pen{
	String made;
	String color;
	//String[] info = new String[2]; 배열로 잡아도 됨 
	void print() {
		System.out.println("펜을 "+made+" 제품의 "+color+"색으로 씁니다.");
	}
	
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Pc redPc = new Pc(); 
		redPc.color="빨강"; 
		redPc.print();
		
		Pc bluePc = new Pc();
		bluePc.color="파랑";
		bluePc.print();
		
		Pc orgPc = new Pc();
		orgPc.color="주황";
		orgPc.print();
		
		Pc yelPc = new Pc();
		yelPc.color="노란";
		yelPc.print();
		
		Er jamEr = new Er();
		jamEr.made="잠자리";
		jamEr.print();
		
		Er moningEr = new Er();
		moningEr.made="모닝글로리";
		moningEr.print();
		
		Pen pen1 = new Pen();
		pen1.made="모나미";
		pen1.color="검정";
		pen1.print();
		
		Pen pen2 = new Pen();
		pen2.made="제트스트림";
		pen2.color="초록";
		pen2.print();
		
		Pen pen3 = new Pen();
		pen3.made="워터맨";
		pen3.color="베이비블루";
		pen3.print();
		
		
		
		

	}

}
