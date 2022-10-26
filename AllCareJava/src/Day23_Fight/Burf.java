package Day23_Fight;

import java.util.Random;

class Burf {

	int function;

	int burfFunction(Unit u, int i) {
		Random r = new Random();
		System.out.print("버프 : ");
		if(i==1) {//공격력
			function = (r.nextInt(100)+50);
			System.out.println("공격력 버프로 "+u.name+"의 공격력이 "+function+" 증가했습니다.");
		}
		else if(i==2) {//힐
			function = (r.nextInt(300)+1);
			System.out.println("힐 버프로 "+u.name+"의 체력이 "+function+" 증가했습니다.");
		}
		else {//디버프 
			function = (r.nextInt(200)+100);
			System.out.println("공격력 디버프로 "+u.name+"의 체력이 "+function+" 감소했습니다.");
		}
		return function;
	}

}
