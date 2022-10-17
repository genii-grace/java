package Day16;

class Animal{
	
	String name;
	String food;
	
	Animal(String name, String food){
		this.name=name;
		this.food=food;
	}
	
	void print() {	
			System.out.println(name+" - "+food);
			
	}
	
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal list[] = new Animal[4];
		list[0] = new Animal("원숭이","바나나");
		list[1] = new Animal("개","뼈다귀");
		list[2] = new Animal("닭","모이");
		list[3] = new Animal("돼지","여물");
		
		/* 강사님코드
		 
		 * String[] at={"원숭이","개","닭","돼지"};
		 * String[] ft={"바나나","뼈다귀","모이","여물"};
		 
		 * 배열 객체를 만들고 각각 매개변수를 배열로 받아서 넣음 
		 
		 * for(int i=0; i<list.length; i++){
		 * list[i]=new Animal(at[i],ft[i]);
		 * }
		 */
	
		for(int i=0; i<list.length;i++) {
			list[i].print();
		}
		
		String temp = list[3].food;
		for(int i=3; i>0; i--) {
			list[i].food=list[i-1].food;
			
		}
		list[0].food=temp;
		
		System.out.println();
		

		for(int i=0; i<list.length;i++) {
			list[i].print();
		}
		
	}

}
