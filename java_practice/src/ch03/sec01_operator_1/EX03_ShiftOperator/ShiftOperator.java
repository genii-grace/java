package ch03.sec01_operator_1.EX03_ShiftOperator;

public class ShiftOperator {
	
	public static void main(String[] args) {
		
//		산술시프트
//		@<<
		System.out.println(3<<1); // 3X2 
		System.out.println(-3<<1); // -3X2
		System.out.println(3<<2); // 3X4
		System.out.println(-3<<2); // -3X4
		// left shift는 곱셈과 같다. 값이 커진다. 양수와 음수 동일하게 계산된다
		
//		@>>
		System.out.println(5>>1); // 5/2 :int int 계산이므로 소수점 값은 나오지 않는다.
		System.out.println(-5>>1); // -5/2 : 음수이므로 5/2 한 후 +1 하고 부호를 붙여준다.
		System.out.println(5>>2); // 5/4
		System.out.println(-5>>2); // -5/4 
		
//		논리시프트
		System.out.println(3>>>1); //3의 이진수는 000..0011 한칸 밀어내므로 000..001 이된다.
		System.out.println(-3>>>31); 
		/* -3의 이진수는 111...1101 이다.
		int는 32bit이므로 31비트를 밀어내면 1만 남는다.  */
	}

}
