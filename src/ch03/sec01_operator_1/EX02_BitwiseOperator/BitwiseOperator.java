// 다양한 진법의 표현과 비트 연산자

package ch03.sec01_operator_1.EX02_BitwiseOperator;

public class BitwiseOperator {
	
	public static void main(String[] args) {
//		자바 메서드로 진법변환
		
		int data=13;
		
//		10진수 값을 2/8/16진수로 변환 
		System.out.println(Integer.toBinaryString(data));
		System.out.println(Integer.toOctalString(data));
		System.out.println(Integer.toHexString(data));
		System.out.println();
		
//		2/8/16진수를 10진수로 변환 
		System.out.println(Integer.parseInt("1101",2));
		System.out.println(Integer.parseInt("15",8));
		System.out.println(Integer.parseInt("0D",16));
		System.out.println();
		
//		다양한 진법 표현 
		System.out.println(13);
		System.out.println(0b1101);
		System.out.println(0x0D);
		System.out.println();
		
//		비트연산자
		
//		@AND 비트 연산자
		System.out.println(3&10);
		System.out.println(0b0011&0b1010);
		System.out.println(0x03&0x0A);
		System.out.println();
		
//		@OR 비트 연산자
		System.out.println(3|10);
		System.out.println(0b0011|0b1010);
		System.out.println(0x03|0x0A);
		System.out.println();
		
//		@XOR 비트 연산자
		System.out.println(3^10);
		System.out.println(0b0011^0b1010);
		System.out.println(0x03^0x0A);
		
//		@NOT 비트 연산자
		System.out.println(~3);
		System.out.println(~0b0011);
		System.out.println(~0x03);
		
		
	}

}
