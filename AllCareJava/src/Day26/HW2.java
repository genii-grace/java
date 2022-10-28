package Day26;

import java.util.ArrayList;
import java.util.Scanner;

//전화번호부 만들기

class Member{
	String name;
	String num;
	String add;
	String age;

	Member(String name, String num, String add, String age){
		this.name=name;
		this.num=num;
		this.add=add;
		this.age=age;
		
		System.out.println("입력이 완료되었습니다.");
		System.out.println("[ "+this.name+", "+this.num+", "+this.add+", "+this.age+" ]");
	}
	
	void print() {
		System.out.println("[ "+this.name+", "+this.num+", "+this.add+", "+this.age+" ]");
	}
	
}

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Member> numbook = new ArrayList<Member>();
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("==================================================");
			System.out.println("메뉴를 선택하세요. \n 1.추가 2.삭제 3.전체출력 4.검색 5.종료");
			int select = sc.nextInt();
			System.out.println("==================================================");
			if(select==1) { //추가
				System.out.println("이름, 전화번호, 주소, 나이");
				numbook.add(new Member(sc.next(), sc.next(), sc.next(),sc.next()));
			}
			else if(select==2) {// 삭제
				System.out.println("삭제할 이름을 입력하세요 : ");
				String input = sc.next();
				for(int i=0; i<numbook.size(); i++) {
					//if(numbook.i)
					/*
					 * 여기서 멈춰버림 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
					 */
				}
				int inputIndex = numbook.indexOf(input);
				numbook.remove(inputIndex);

				//남아있는 현재상태 출력
				for(int i=0; i<numbook.size(); i++) {
					numbook.get(i).print();
				}
			}
			else if(select==3) {//전체출력 

			}
			else if(select==4) {// 검색 

			}
			else if(select==5) {//종료 
				System.out.println("종료됩니다.");
				break;

			}
			else {
				System.out.println("잘못된 입력입니다.");
			}

		}



	}

}
