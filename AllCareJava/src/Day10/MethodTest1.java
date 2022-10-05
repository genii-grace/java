package Day10;

import java.util.Scanner;

public class MethodTest1 {

	static int d=10;
	static int add(int a, int b) {
		d=20;
		System.out.println("abc");
		return a+b;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		d=50;
		int c;
		int a= add(5,3); // 8 
		System.out.println(8); //8 
		System.out.print(add(5,3)); //8
		System.out.println();
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		add(sc.nextInt(),5);
		
		
	}

}
