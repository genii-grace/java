package Day13;

public class CallByReferenceTest {

	static void abc(int[] a) {
		
		a[0]=10;
		a[1]=20;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a=new int[3];
		abc(a);
		
		System.out.println(a[0]+","+a[1]+","+a[2]);
		
	}

}
