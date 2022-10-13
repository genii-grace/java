package Day14;

public class MethodTest1 {
	
	
	static int abc(int a) {
		if(a==0) {
			return 0;
		}
		else {
			return abc(a-1)+a;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 재귀함수 
		System.out.println(abc(5));
		
	}

}
