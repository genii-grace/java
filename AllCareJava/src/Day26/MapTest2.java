package Day26;

import java.util.HashMap;

class C{
	int k;
}

class D{
	String str;
	D(){
		System.out.println("D의 객체");
	}
}


public class MapTest2 {

	public static void main(String[] args) {

		HashMap<C, D> map = new HashMap<C, D>();
		
		C c = new C(); //변수 c도 c객체를 바라봄 
		C c1 = new C();
		
		map.put(c, new D()); 
		//key에 C객체를 바라보는 참조자료형을 넣음, key인 c 도 c객체를 바라보면서 d객체를 가져올수 있음 
		//value에 D객체를 생성하여 넣음
		
		map.get(c1);
		//c1은 key값으로 설정하여 값을 넣은적이 없으므로 null
		
		map.get(c);
		//c를 키값으로 호출하면 D의 객체가 나옴 

	}

}
