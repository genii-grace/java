package Day21;

import java.util.Random;

/*
 * 원숭이 문제
 * 원숭이 5마리 (1.빨간원숭 2.노란원숭 3.파란원숭 4.초록원숭 5.검정원숭) 
 * 상자를 가질수 있음
 * 횟수 랜덤, 좌우 랜덤수 받아서 상자 이동
 * 상자가 움직일 때마다 원숭이의 상자 유무 상태를 출력 
 */

class Monkey{

	String color;
	Box b;

	Monkey(String color){
		this.color=color;
	}

	void print() {
		if(this.b==null) {
			System.out.println(color+"원숭이는 박스를 가지고있지 않습니다.");
		}
		else {
			System.out.println(color+"원숭이가 박스를 가지고 있습니다.");
		}
	}

}

class Box{

}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] c = {"빨간","노란","파란","초록","검정"};

		Monkey[] m = new Monkey[5];
		for(int i=0; i<m.length; i++) {
			m[i]= new Monkey(c[i]);
		}

		Box b=new Box();
		m[0].b=b;

		Random r = new Random();
		int count =r.nextInt(5)+1;
		int move =r.nextInt(2);
		int index=0;

		System.out.println("count : "+count+", move : "+move);
		if(move==1) {//우측이동 (index ++)

			if(count==5) {
				m[0].b=b;
			}
			else {
				for(int i=0; i<=count; i++) {
					index=count;
				}
				m[index].b=m[0].b;
				m[0].b=null;
			}

			for(int i=0; i<m.length;i++) {
				m[i].print();
			}		
		}
		else {//좌측이동 (index --)	
			if(count==5) {
				m[0].b=b;
			}
			else {
				m[4].b=m[0].b;
				m[0].b=null;
				
				index=5;
				
				for(int i=1; i<count; i++) {
					index=count;
					index--;
					
				}
				m[index].b=m[0].b;
				m[0].b=null;
			

				}
			for(int i=0; i<m.length;i++) {
				m[i].print();
			}

			
			}
		}

	}






