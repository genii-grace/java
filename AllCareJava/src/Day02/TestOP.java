package Day02;

public class TestOP {

	public static void main(String[] args) {
		
//		산술 
//		나머지연산
		System.out.println(394892%3);
		
//		증감연산자 
		int a = 10;
		System.out.println(a++); // 10
		// a=a+1; //11
		System.out.println(++a); // a=(a+1)+1; 12
		
		a=10;
		a++; // 11
		System.out.println(a); // 11
		System.out.println(++a); // 12
		
//		관계 
		int b = 10;
		int c = 12;
		int d = 10;
		
		System.out.println(b==c); //f
		System.out.println(b!=c); //t
		System.out.println(b>=c); //f
		System.out.println(b<=c); //t
		System.out.println(c<d); //f
		System.out.println();
		
//		논리
		System.out.println(5>3&&4==7||3!=7); // t
		
//		단축
		int e =10;
		int f= 5;
		e+=f; // e=15
		System.out.println(e); // 15
		e-=f; // e=10
		System.out.println(e); // 10
		
//		삼항
		int x = e==10? 1:0;
		System.out.println(x); //1
	}

}
