package Day13;

public class CallByValueTest {
	
	
	static int abc(int a) {
		a=5;
		return a;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		
		abc(a); //함수만 호출 
		
		System.out.println(a);

	}

}
