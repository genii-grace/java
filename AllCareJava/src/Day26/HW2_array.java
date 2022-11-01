package Day26;

import java.util.ArrayList;
import java.util.Scanner;

public class HW2_array {

	public static void main(String[] args) {
		String[] mem = new String[4];
		
		ArrayList<String[]> numbook = new ArrayList<String[]>();
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("==================================================");
			System.out.println("메뉴를 선택하세요. \n 1.추가 2.삭제 3.전체출력 4.검색 5.종료");
			int select = sc.nextInt();
			System.out.println("==================================================");
			if(select==1) { //추가
				System.out.println("이름, 전화번호, 주소, 나이");
				for(int i=0; i<mem.length; i++) {
					mem[i]=sc.next();
				}
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
					//numbook.get(i).print();
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
