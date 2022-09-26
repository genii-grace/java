package Day04;

public class BreakTeat {

	public static void main(String[] args) {
		
		
		int a=0;
		/*
		while(true) {
			while(true) {
				System.out.println("a: "+a);
				if(a==10) {
					break;
				}
				a++;
			}
		}
		*/
		
		while(true) {
			switch(a) {
			case 0:
				System.out.print(a);
				break;
			default:
				System.out.println("값이 없습니다.");
			}
			break;
		}
	}

}
