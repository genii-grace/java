package Day08;

public class Etc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array=new int[5][5];
		
		int count =1;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				array[i][j]=count++;
			}
		}
	}

}
