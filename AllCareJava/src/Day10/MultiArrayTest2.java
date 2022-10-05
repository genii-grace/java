package Day10;

public class MultiArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//가변배열 예제
		
		int[][] a = new int[5][];
		
		//System.out.println(a[3][2]); //a[3]의 크기가 선언되지 않았기 때문에 여기서는 오류남 
		
		a[3]=new int[5]; // a의 3번째줄에 5개를 할당 -> 0으로 초기화
		System.out.println(a[3][2]); //할당 이후 출력이므로 오류나지 않음 
		
	
		
		

	}

}
