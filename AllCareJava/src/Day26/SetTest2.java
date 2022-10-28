package Day26;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<A> set = new HashSet<A>();
		//class A는 패키지 내에 있음
		
		A a1 = new A(7,8);
		
		set.add(new A(5, 6));
		set.add(new A(3, 4)); //8의 위치 변경을 위한 추가 
		//set.add(new A(7, 8));
		set.add(a1);
		
		//set에서 탐색 세팅 
		Iterator<A> it = set.iterator();
		int num = 1;
		
		//set에서 탐색
		while(it.hasNext()) {
			A a = it.next();
			if(a==a1) { // a와 a1이 같은걸(new A(7,8)) 바라보는 시점
			//if(a.a == 8 || a.b ==8) {
				System.out.println(num+"번째에 있습니다.");	
			}
			num++;
		}
		
	}

}
