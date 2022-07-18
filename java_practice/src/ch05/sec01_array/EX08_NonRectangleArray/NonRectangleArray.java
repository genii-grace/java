package ch05.sec01_array.EX08_NonRectangleArray;

public class NonRectangleArray {
	
	public static void main(String[] args) {
		
		int[][] array1=new int[2][];
		array1[0]=new int[2];
		array1[0][0]=1;
		array1[0][1]=2;
		array1[1]=new int[3];
		array1[1][0]=3;
		array1[1][1]=4;
		array1[1][2]=5;
		
		for(int i=0; i<array1.length;i++){
			for(int j=0; j<array1[i].length;j++) {
				System.out.print(array1[i][j]+" ");
			}
		System.out.println();
		}
		System.out.println();
		
		
		int[][] array2=new int[2][];
		array2[0]=new int[] {1,2};
		array2[1]=new int[] {3,4,5};
		
		for(int i=0; i<array1.length;i++){
			for(int j=0; j<array1[i].length;j++) {
				System.out.print(array1[i][j]+" ");
			}
		System.out.println();
		}
		System.out.println();
		
		
		
	}

}
