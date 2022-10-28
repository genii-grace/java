package Day26;

import java.util.LinkedList;

public class QueueTest {

	public static void main(String[] args) {

		//LinkedList 를 만듦 
		LinkedList<String> queue = new LinkedList<String>();
		
		//큐에 요소 추가 
		System.out.println("큐에 경기도 offer : "+queue.offer("경기도"));
		System.out.println("큐에 충청도 offer : "+queue.offer("충청도"));
		System.out.println("큐에 강원도 offer : "+queue.offer("강원도"));
		System.out.println("큐에 전라도 offer : "+queue.offer("전라도"));
		System.out.println("큐에 경상도 offer : "+queue.offer("경상도"));
		System.out.println("큐에 제주도 offer : "+queue.offer("제주도"));
		System.out.println("==========================================");
		
		//제주도의 위치를 찾음 //큐는 인덱스를 0부터 시작함 
		int n=queue.indexOf("제주도");
		if(n !=-1) {
			System.out.println("큐에서 숫자 제주도의 위치는 : "+n+"번째 입니다.");
		}
		else {
			System.out.println("큐에서 숫자 제주도의 위치는 없습니다.");
		}
		System.out.println("==========================================");
		
		//큐에서 요소 뽑기
		while(!queue.isEmpty()) {
			Object obj = queue.poll();
			System.out.println("큐에서 poll : "+obj);
		}
	}

}
