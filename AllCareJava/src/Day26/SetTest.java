package Day26;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<Integer> odd = new HashSet<Integer>();
		HashSet<Integer> even = new HashSet<Integer>();
		
		for(int i=1; i<=5; i=i+2) {
			odd.add(i); // 1, 3, 5
			even.add(i+1); // 2, 4, 6
		}
		
		boolean setChanged = odd.add(5);
		//이미 odd에 5가 있으므로 중복이 불가함 
		System.out.println("odd에 5 추가 성공? : "+setChanged);
		
		setChanged = even.add(12);
		//even에 12가 없으므로 추가 가능 
		System.out.println("odd에 12 추가 성공? : "+setChanged);
		System.out.println("odd 집합 : "+odd);
		System.out.println("even 집합 : "+even);
		System.out.println("odd에서 가장 작은 값은 ? : "+Collections.min(odd));
		System.out.println("even에서 가장 큰 값은 ? : "+Collections.min(even));

		//set은 set자체로 탐색이 불가능하므로 iterator로 변환해줘야 함 
		Iterator<Integer> it = even.iterator();
		int sum=0;
		
		while(it.hasNext()) { //iterator의 다음값이 없을때까지 반복 
			sum += it.next(); //다음값을 계속 더해줌 
		}
		
		System.out.println("even 의 합 : "+ sum);
		
	}

}
