package Day26;

import java.util.ArrayList;

class A{
	int a;
	int b;
	
	A(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	void print() {
		System.out.println("a : "+a+", b : "+b);
	}
}

public class ListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<A> list = new ArrayList<A>();
		// 제네릭 자리에 클래스 입력 
		// 리스트만 생성됨 
		
		for(int i=0; i<10; i++) {
			list.add(new A(i, i+1));
			//ArrayList에 클래스 객체 생성후 넣어줘야 함 
			// i = a, i+1 = b
		}
		
		for(int i=0; i<list.size(); i++) {
			list.get(i).print();
			//list.get(i) : 리스트 내 클래스 객체를 호출
			//.print() : 클래스의 메서드를 호출 
		}
	}

}
