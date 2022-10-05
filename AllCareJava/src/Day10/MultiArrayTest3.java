package Day10;

public class MultiArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][][] b = new int[2][2][2]; 
		
		int x=1;
		
		for(int i=0; i<b.length; i++){
			for(int j=0; j<b[i].length; j++){
				for(int k=0; k<b[i][j].length; k++){
						b[i][j][k]=x;
						x++;
						System.out.print(b[i][j][k]+"\t");
					}
				System.out.println();
			}
		}System.out.println();
		
		
		
		
		
		
		
	}

}
