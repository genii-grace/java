package Review;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//id, pw 설정
		String id = "korea";
		String pw = "1234";
		
		//id, pw 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("ID를 입력하세요 : ");
		String userId = sc.next();
		
		System.out.print("PW를 입력하세요 : ");
		String userPw = sc.next();
		
		//동일하면 환영합니다 id 님
		if(userId.equals(id)&&userPw.equals(pw)) {
			System.out.println("환영합니다! "+userId+"님");
		}
		//id가 틀린경우 
		else if(!userId.equals(id)&&userPw.equals(pw)) {
			System.out.println("ID가 올바르지 않습니다.");
		}
		
		//pw가 틀린경우
		else if(userId.equals(id)&&!userPw.equals(pw)) {
			System.out.println("PW가 올바르지 않습니다.");
		}
		
		//둘 다 틀린경
		else {
			System.out.println("ID와 PW가 올바르지 않습니다.");
		}

	}

}
