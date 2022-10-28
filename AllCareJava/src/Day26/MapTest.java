package Day26;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가위, 바위, 보 게임 \n 1.가위 2.바위 3. 보 : ");
		int user = sc.nextInt()-1; // 0,1,2 이므로 1을 빼준다.
		
		Random r= new Random();
		int com = r.nextInt(3); //0~2
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(0, "가위");
		hm.put(1, "바위");
		hm.put(2, "보");
		
		/*
		 * !! 이렇게 사용 불가 !!
		 * for(int i=0; i<hm.size(); i++){
		 * hm.get(i);
		 * }
		 */
		
		//hashmap에 들어있는 내용을 출력해보기 
		Set<Integer> key = hm.keySet(); //1. 키꾸러미 set으로 추출 
		
		Iterator<Integer> i = key.iterator(); //2. ket iterator 변경 
		
		while(i.hasNext()) { //다음 값이 없을때까지 반복 
			Integer temp = i.next(); // 다음 키값을 temp에 저장 
			System.out.println(hm.get(temp)); // 키값으로 추출 
		}
		
		
		String value1 = hm.get(user); //유저가 선택한 값 추출 
		System.out.println("당신은 "+value1+"를 냈습니다.");
		
		String value2 = hm.get(com);
		System.out.println("컴퓨터는 "+value2+"를 냈습니다.");
		System.out.println("========================================");
		System.out.print("게임 결과 : ");
		
		if(user == com) {
			System.out.println("비겼습니다.");
		}
		else if(user==(com+1) %3) {
			System.out.println("당신이 이겼습니다.");
		}
		else {
			System.out.println("컴퓨터가 이겼습니다.");
		}
		
	}

}
