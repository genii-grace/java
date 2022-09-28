package Day06;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[5];
		int b[] = new int[5];
		int[] kor = new int[100];
		
		for(int i=0; i<100; i++) {
			kor[i]=i+1;
		}
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
		
		int c=10;
		int d=20;
		int e=30;
		int f=40;
		int g=50;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
	}

}
