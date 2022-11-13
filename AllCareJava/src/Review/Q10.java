package Review;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1.");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("2.");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("3.");
		for(int i=1; i<=5; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print(" ");
				}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		System.out.println();
		
		System.out.println("4.");
		for(int i=1; i<=5; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("5.");
		for(int i=1; i<=3; i++) {
			for(int j=2; j>=i; j--) {
				System.out.print(" ");
			}
			
			for(int j=1; j<2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=2; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}

			for(int j=3; j>2*i-2; j--) {
				System.out.print("*");
			}System.out.println();
		}System.out.println();
		
		
		
	}

}
