package Day02;

public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문자열 비교 
		String a ="abc"; //사실상 a는 문자열 abc가 저장된 메모리 주소를 가지고 있음 
		
		if ( a == "abc") { // == 기본자료형만 가능하지만 자바버전이 올라간 후 통용되는중 
			System.out.println("값이 같습니다.");
		}
		
		if ( a.equals("abc")) { // 문자열 비교는 equals 를 사용한다.
			System.out.println("문자열 값이 동일합니다.");
		}

	}

}
