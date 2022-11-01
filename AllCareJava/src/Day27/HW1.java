package Day27;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//전화번호부 만들기

class Member{
	String name;
	String num;
	String add;


	Member(String name, String num, String add){
		this.name=name;
		this.num=num;
		this.add=add;

		
		System.out.println("입력이 완료되었습니다.");
		System.out.println("[ "+this.name+", "+this.num+", "+this.add+" ]");
	}
	
	void print() {
		System.out.println("[ "+this.name+", "+this.num+", "+this.add+" ]");
	}
	
}

public class HW1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ArrayList<Member> numbook = new ArrayList<Member>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("파일명을 입력하세요 : ");
		String s= sc.next();
		FileWriter fw = new FileWriter(s);
		BufferedWriter bw = new BufferedWriter(fw);
		System.out.println(s+" 파일이 생성되었습니다.");
		
	
		while(true) {
			System.out.println("==================================================");
			System.out.println("메뉴를 선택하세요. \n 1.추가 2.삭제 3.전체출력 4.검색 5.종료");
			int select = sc.nextInt();
			System.out.println("==================================================");
			
			if(select==1) { //추가
			
				System.out.print("이름 : ");
				String name = sc.next();
				
				System.out.print("번호 : ");
				String num = sc.next();
				
				System.out.print("주소 : ");
				String add = sc.next();
				
				Member m = new Member(name,num,add);
				numbook.add(m);
				
				String source = null;
				
				for(int i=0; i<numbook.size();i++) {
					source = numbook.get(i).name+"/t"+numbook.get(i).num+"/t"+numbook.get(i).add;
					System.out.println(source);
				}
				
				char input[] = new char[source.length()];
				source.getChars(0,  source.length(),input, 0);
				
				fw.write(input);
				
				
			}
			else if(select==2) {// 삭제
				System.out.println("삭제할 이름을 입력하세요 : ");
			//	String input = sc.next();
				
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