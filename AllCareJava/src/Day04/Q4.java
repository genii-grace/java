package Day04;



public class Q4 {

	public static void main(String[] args) {
		//별찍기

		System.out.println("1.");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("2.");
		for(int i=0; i<5; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print("*");
			}System.out.println();
		}

		System.out.println("3.");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i+j<4) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}System.out.println();
		}

		System.out.println("4.");
		for(int i=0; i<5; i++) {
			for(int k=0; k<(5-i); k++) {
				System.out.print(" ");
			}
			for(int j=0; j<(2*i+1); j++) {
				System.out.print("*");
			}System.out.println();
		}
		System.out.println("5.");
		for(int i=0; i<5; i++) {
			for(int k=0; k<(5-i); k++) {
				System.out.print(" ");
			}
			for(int j=0; j<(2*i+1); j++) {
				System.out.print("*");
			}System.out.println();
			}
		for(int i=5; i>0; i--) {
			for(int k=0; i+k-2<5; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<(2*i-3); j++) {
				System.out.print("*");
			}System.out.println();
		}
		




	}
	
}






/*
i=0; j=0; *
i=0; j=1; **
 ***
 ****
 *****



 *****
 *****
 *****
 *****
 *****


 *
 **
 ***
 ****
 *****

 *
 **
 ***
 ****
 *****


 */