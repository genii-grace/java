package ch17.sec04_stackandqueue.EX01_StackMethod;

import java.util.Stack;

public class StackMethod {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		
		stack.push(2);
		stack.push(5);
		stack.push(3);
		stack.push(7);
		
		System.out.println(stack.toString());
		
		System.out.println(stack.peek());
		System.out.println(stack.size());
		
		System.out.println("7의 위치 : "+stack.search(7));
		System.out.println("5의 위치 : "+stack.search(5));
		System.out.println("9의 위치 : "+stack.search(9));
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.empty());
		System.out.println();
	}

}
