package Day16;

import java.util.Scanner;

/*
 * 문방구 : 
 * 		주황색 연필 / 초록색 연필 / 노란색 연필 / 파란색 연필 
 * 		회색 지우개 / 빨간 지우개	
 * 		주황펜 / 초록펜 / 노랑펜 / 파란펜 
 * 
 * 학생1 : 
 * 		필통 , 색연필2개 지우개1개 펜2개
 *
 * 학생2 : 
 *		필통 , 색연필2개 지우개1개 펜2개 
 *
 * 학생1 먼저 구매하고 학생2 구매 
 * 원하는 물건 없으면 다시 고르게 함
 * 없는 색을 고르면 다시 고르게 함
 *
 */

class Shop{

	//문방구에 색연필, 지우개, 펜 나열하기 
	ColorPencil[] CPlist = new ColorPencil[4];
	Eraser[] Elist = new Eraser[2];
	Pen[] Plist = new Pen[4];


	Shop() {
		String[] color = {"주황색","초록색","노란색","파란색"};
		String[] ecolor = {"회색","빨간색"};

		for(int i=0; i<CPlist.length; i++) {
			CPlist[i]= new ColorPencil(color[i]);
			Plist[i]= new Pen(color[i]);
		}

		for(int i=0; i<Elist.length; i++) {
			Elist[i]= new Eraser (ecolor[i]);
		}
	}


}

class ColorPencil{

	String color;

	ColorPencil(String color){
		this.color=color;
	}

}

class Eraser{

	String color;
	Eraser(String color){
		this.color=color;
	}

}

class Pen{

	String color;
	Pen(String color){
		this.color=color;
	}

}

class Student{ //학생은 필통을 한개씩 가짐 

	String name;
	Philtong p;

	Student(String name){
		this.name=name;
		p = new Philtong(); //학생은 필통을 가지고 있음 
	}

}

class Philtong{ //필통은 색연필2개, 지우개, 펜2개 담을 수 있다 

	ColorPencil cpc1;
	ColorPencil cpc2;
	Eraser e;
	Pen cp1;
	Pen cp2;
}


public class HW2 {
	
	//static boolean buy(Shop m, String color, Student a) {
		
		//for(int i=0;)
		
	//}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Shop m = new Shop();

		Student a = new Student("A학생");
		Student b = new Student("B학생");

		while(true) {
			// 1. A학생
			while(true) {
				System.out.print(a.name+" 색연필 색 고르기 : ");
				String color=sc.next();
				
				if(color.equals("주황색")||color.equals("초록색")||color.equals("노란색")||color.equals("파란색")) { //색연필 정상선택 
					
				
				}
				else { //범위 벗어낫을 때
					System.out.println("잘못된 입력입니다.");
					
				}
				
				}
			
			// 2. B학생 
		}
		
		
	}

}
