package Day23_Fight;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Knight n = new Knight();
		Villain v = new Villain();

		Battle b = new Battle();

		int turn =1;

		boolean check = true;

		while(check){
			//턴 소개
			System.out.println("=======================================");
			System.out.println(turn++ +"번째 Fight! ");
			System.out.println("=======================================");

			//기사 버프
			b.addBurf(n, b.randomFunction());
			//기사 공격 
			b.attack(n, v);
			//빌런 피통체크 

			check=b.gameOverCheck(b.hpCheck(v));

			if(check==false) {
				System.out.println();
				System.out.println("******************************");
				System.out.println("승리 : 기사");
				System.out.println("******************************");
				continue;
			}
			System.out.println("=======================================");

			//턴 소개
			System.out.println(turn++ +"번째 Fight! ");
			System.out.println("=======================================");

			//빌런 버프
			b.addBurf(v, b.randomFunction());

			//빌런 공격
			b.attack(v, n);

			//기사 피통체크 

			check=b.gameOverCheck(b.hpCheck(n));
			
			if(check==false) {
				System.out.println();
				System.out.println("******************************");
				System.out.println("승리 : 빌런");
				System.out.println("******************************");
				break;
			}

		}


	}

}
