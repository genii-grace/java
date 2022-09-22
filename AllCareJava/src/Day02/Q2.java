package Day02;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//입력받은 id와 pw 를 선언해둔 정보와 비교하여 출력하기
		// 일치하면  환영합니다.
		// id 가 틀린경우 : 아이디가 올바르지않습니다.
		// pw 가 틀린경우 : pw 가 올바르지 않습니다.
		// 둘다 틀린 경우 : 둘다 올바르지 않습니다.
		
		// id, pw 선언 
		String id = "korea";
		String pw = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		// 입력받은 id, pw 저장하기 
		System.out.print("id 입력 : ");
		String scid = sc.next();
		
		System.out.print("pw 입력 : ");
		String scpw = sc.next();
		
		// 설정값과 입력받은 값 비교
		
		//id, pw 동일 
		if(id.equals(scid) && pw.equals(scpw)) {
			System.out.println("환영합니다. "+id+"님");
		}
		
		//id, pw 모두 다를때 
		else if(!(id.equals(scid)) && !(pw.equals(scpw))) {
				System.out.println("id와 pw가 올바르지 않습니다.");
			}

		// 둘중에 하나가 다를때 
		else {
			if(id.equals(scid)) {
				System.out.println("pw가 올바르지 않습니다.");
			}
			else {
			System.out.println("id가 올바르지 않습니다.");
			}
		}
		
		

	}

}
