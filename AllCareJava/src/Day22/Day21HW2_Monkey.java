package Day22;

public class Day21HW2_Monkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 강사님 피드백 : 
		 *  박스 클래스 만들어둔 후 객체로만 사용
		 *  
		 *  원숭이 속성을 private 로 묶음
		 * 	Soure -> Generate Getter, Setter 메뉴가 있음
		 * 
		 * 박스!=null : 박스 가지고있음
		 * 박스==null : 박스 가지고 있음
		 * 
		 * move 클래스 안에 원숭이 배열 만듦
		 * move 생성자 안에 원숭이 배열 및 원숭이 객체 만들어줌 
		 * 
		 * 겟, 셋을 세팅해두고
		 * 우측 이동시 : 
		 * monkey[i+1].setBox(monkey[i].getBox());
		 * monkey[i].setBox(null);
		 * 
		 * 좌측 이동시 : 
		 * 인덱스 4번짜리는 먼저 인덱스 0번으로 옮김 
		 * monkey[4].setBox(monkey[0].getBox());
		 * monkey[0].setBox(null);
		 * 
		 * num=4;
		 * for(int i=1; i<count; i++){
		 * monkey[num-1].setBox(monkey[num].getBox());
		 * monkey[num].setBox(null);
		 * num--;
		 */
	}

}
