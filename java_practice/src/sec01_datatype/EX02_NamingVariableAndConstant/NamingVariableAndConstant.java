// 변수와 상수명 짓기

package sec01_datatype.EX02_NamingVariableAndConstant;

public class NamingVariableAndConstant {
	
	public static void main(String[] args) {
		
//		변수선언
		boolean aBcD; // 대문자는 새로운 단어 앞글자에 사용권장
		byte 가나다; // 한글로 작성가능하나 권장하지 않음
		short _abcd; 
		char $ab_cd; // 특수문자는 $와_만 가능
	//  int 3abcd; 숫자는 이름 맨앞에 올 수 없음
		long abcd3;
	//  float int; 자바 예약어는 사용할 수 없음 
		double main;
	//  int my Work; 스페이스, 특수키는 사용할 수 없음 
		String myClassName;
		int ABC; // 전부 대문자로 작성하는 것은 권장하지 않음
		
		
//		상수선언
		final double PI; // 상수변수는 전제 대문자로 표기
		final int MY_DATA; // 단어 구분할때는 _사용
		final float myData; // 소문자 사용 권장하지 않
	}

}
