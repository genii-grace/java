package ch05.sec01_array.EX09_ReadArrayData_2D;

public class ReadArrayData_2D {
	
	public static void main(String[] args) {
		
		int[][] array1=new int[][] {{1,2},{3,4,5}};
		System.out.println(array1.length);
		System.out.println(array1[0].length);
		System.out.println(array1[1].length);
		
		
		for(int i=0; i<array1.length;i++) {
			for(int j=0; j<array1[i].length;j++) {
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int[] array: array1) {
			for(int k:array) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}

}
