package ch18.sec01_lambdaexprssion.EX08_RefOfArrayConstructor;


interface A{
	int[] abc(int len);
}
public class RefOfArrayConstructor {

	public static void main(String[] args) {
		
		A a1=new A() {
			@Override
			public int[] abc(int len) {
				return new int[len];
			}
		};
		
		A a2=(int len)->new int[len];
		
		
		A a3=(int len)->{
			return new int[len];
		};
		
		A a4=int[]::new;
		
		int[] array1=a1.abc(3);
		System.out.println(array1.length);
		
		int[] array2=a2.abc(3);
		System.out.println(array2.length);
		
		int[] array3=a3.abc(3);
		System.out.println(array3.length);
		
		int[] array4=a4.abc(3);
		System.out.println(array4.length);


	}

}
