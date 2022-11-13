package Review;

import java.util.Random;

public class Q12 {

	static char randomChar(Random r) {
		return (char)(65+r.nextInt(26));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		String str="";
		
		for(int i=0; i<10; i++) {
			char chr=randomChar(r);
			System.out.print(chr+" ");
			str += chr;
		}
		System.out.println();
		System.out.print(str);
	}

}
