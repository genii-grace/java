package ch05.sec01_array.EX05_ReadArrayData;

import java.util.Arrays;

public class ReadArrayData {
	public static void main(String[] args) {
		int[] array=new int[] {3,4,5,6,7};
		
		System.out.println(array.length); // 배열의 길이
		System.out.println();
		
		System.out.println(array[0]+" ");
		System.out.println(array[1]+" ");
		System.out.println(array[2]+" ");
		System.out.println(array[3]+" ");
		System.out.println(array[4]+" ");
		System.out.println();
		
		
		for(int i=0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		 
		
		for(int k: array) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(array));
		
		
	}
	

}
