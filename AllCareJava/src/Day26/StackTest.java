package Day26;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//스택 만들기 
		Stack<String> stack = new Stack<String>();
		
		//스택에 요소 집어넣기 
		System.out.println("스택에 push : "+stack.push("경기도"));
		System.out.println("스택에 push : "+stack.push("충청도"));
		System.out.println("스택에 push : "+stack.push("강원도"));
		System.out.println("스택에 push : "+stack.push("전라도"));
		System.out.println("스택에 push : "+stack.push("경상도"));
		System.out.println("스택에 push : "+stack.push("제주도"));
		System.out.println("===================================");
		
		//요소 찾기 
		int n=stack.search("제주도");
		if ( n!= -1) { //없으면 -1 리턴, 있으면 자리 인덱스 리턴(인덱스 1부터 시작)
			System.out.println("제주도의 위치는 "+n+"번째 입니다.");
		}
		else{
			System.out.println("제주도는 없습니다.");
		}
		System.out.println("===================================");
		while(!stack.empty()) { //스택이 비어질때 까지 
			String obj = stack.pop(); // 요소 꺼내기 
			System.out.println("스택에서 pop : "+obj); // 꺼낸 요소 출력하기
		}
	}

}
