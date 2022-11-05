package Day27;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
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
		
		
		/*
		 * 파일이 없으면 파일을 만들고
		 * 파일이 있으면 파일을 가져와서 이어쓰기 
		 * 분기 필요 
		
		
		File f = new File(s);
		//읽어오기 
		FileReader fr;
		BufferedReader bf = null;
		
		if(f.exists()) { //파일이 외부에 있음 
			numbook.clear();
			
			fr= new FileReader(s);
			bf = new BufferedReader(fr);
			String line;
			String[] splitLine = null;
			
			while((line=bf.readLine())!= null) {
				//탭기준으로 스플릿해서 배열에 넣어주기 
			}
			
		}
		 */
		
		System.out.println(s+" 파일이 생성되었습니다.");

		//이어쓰기
		FileWriter fw1 = new	FileWriter(s,true);
		BufferedWriter bw1 = new BufferedWriter(fw1);

		//덮어쓰기
		FileWriter fw2;
		BufferedWriter bw2 = null;
		
		//읽어오기 
		FileReader fr;
		BufferedReader bf = null;

		
		//기본 구분메뉴 세팅 
		numbook.add(new Member("이름","번호","주소"));
		bw1.write("이름\t번호\t주소\n");
		bw1.flush();

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

				//ArrayList에 객체 추가 
				numbook.add(new Member(name,num,add));
				System.out.println(name+"이/가 추가되었습니다.");

				//파일에 입력받은 내용 쓰기 
				bw1.write(name+"\t"+num+"\t"+add+"\n");
				bw1.flush();
			}

			else if(select==2) {// 삭제
				System.out.println("삭제할 이름을 입력하세요 : ");
				String input = sc.next();
				/*
				 * 삭제할 내용이 없는 경우도 분기 필요 
				 */
				//ArrayList에서 삭제
				for(int i=0; i<numbook.size();i++) {
					if(numbook.get(i).name.equals(input)) {
						System.out.println(numbook.get(i).name+"이/가 삭제되었습니다.");
						numbook.remove(i);
					}
				}
				//덮어쓰기
				fw2 = new FileWriter(s,false);
				bw2 = new BufferedWriter(fw2);

				//새로운 내용으로 파일에 덮어쓰기 
				for(int i=0; i<numbook.size(); i++) {
					bw2.write(numbook.get(i).name+"\t"+numbook.get(i).num+"\t"+numbook.get(i).add+"\n");
					bw2.flush();
				}
			}

			else if(select==3) {//전체출력 
				fr = new FileReader(s);
				bf = new BufferedReader(fr);

				String check;
				//읽어올 내용이 없을 때(-1)까지 반복 
				while( (check=bf.readLine()) != null) {
					System.out.print(check+"\n");
					
				}
			}
			else if(select==4) {// 검색 

				boolean check = false;
				//인덱스를 -1 로 정의한 이후에 true/false 를 -1 또는 다른 값으로 분기 가능
				
				int index =0;
				System.out.println("검색할 이름을 입력하세요");
				String input = sc.next();

				for(int i=0; i<numbook.size(); i++) {
					if(numbook.get(i).name.equals(input)) {
						check=true;
						index=i;
						break;
					}
				}

				if(check==true) {
					System.out.print("검색결과 : ");
					numbook.get(index).print();
				}
				else {
					System.out.println("검색 결과가 없습니다.");
				}

			}
			else if(select==5) {//종료 
				System.out.println("프로그램이 종료됩니다.");
				break;

			}
			else {
				System.out.println("잘못된 입력입니다.");
			}

		}
		bw1.close();
		bw2.close();
		bf.close();
	}
}

