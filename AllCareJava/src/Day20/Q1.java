package Day20;

import java.util.Random;
import java.util.Scanner;

class People{
	//시민 5명 이 중 랜덤으로 마피아 1명 
	
	boolean type;
	
	void typeCheck() {
		if(this.type==true){
			System.out.println("제가 마피아 입니다.");
		}
		else {
			System.out.println("억울합니다 저는 시민입니다.");
		}
	}

}

class Police{
	//시민을 지정하는 변수를 선택함 
	Scanner sc = new Scanner(System.in);
	
	
	int choise() {
		System.out.print("마피아를 고르세요 : ");
		
		int num=sc.nextInt();
		
		return num;
	}
	
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//시민 다섯명 
		People[] p = new People[5];
		
		//경찰이 지목 
		 Police poli = new Police();
		 
		for(int i=0; i<p.length; i++) {
			p[i]=new People();
		}
		//마피아 선택 
		Random r = new Random();
		 p[r.nextInt(5)].type=true;
		
		for(int i=0; i<p.length; i++) {
			System.out.print(p[i].type+" ");
		}
		System.out.println();
		
		 
		 
		 while(true) {
			 int num=poli.choise();
			 if(p[num].type==true) {
				 p[num].typeCheck();
				 break;
			 }
			 else {
				 p[num].typeCheck();
			 }
		 
		 }
		 
		
		
	}

}
