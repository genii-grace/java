package Day18;

public class OverloadingTest {
	
	static void add (int a, int b) {
		System.out.println(a+b);
	}
	
	static void add(double a, double b) {
		System.out.println(a+b);
	}
	
	static void add (double a, int b) {
		System.out.println(a+b);
	}
	
	static void add (int a, double b) {
		System.out.println(a+b);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add(5, 10); //15
		add(0.5, 0.7); // 1.2
		add(1, 0.7); //1.7
		add(5.6, 7); //12.6
		
	}

}
