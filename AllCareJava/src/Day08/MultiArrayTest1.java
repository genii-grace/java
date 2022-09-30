package Day08;

public class MultiArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=1;
		//2차원 배열
		int[][] a = new int[5][5];
		for(int i=0; i<a.length; i++) { //행 돌리기 
			for(int j=0; j<a[i].length; j++) { //열 돌리기 
				a[i][j]=count++;
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
