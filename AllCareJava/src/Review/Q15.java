package Review;

import java.util.Random;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();

		int[] num = new int[3];

		num[0]= r.nextInt(9)+1;


		for(int i=1; i<num.length; i++) {
			num[i]=r.nextInt(9)+1;
			for(int j=1; j<num.length; j++) {
				while(num[j]==num[j-1]) {
					num[j]=r.nextInt(9)+1;
				}
			}
			if(num[0]==num[2]) {
				num[2]=r.nextInt(9)+1;
			}
		}

		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}


	}

}
