// float와 double의 정밀도 비

package ch02.sec02_primarydatatype.EX01_FloatVsDouble;

public class FloatVsDouble {
	
	public static void main(String[] args) {
//		float의 정밀도 : 대략 소수 7자리
		float f1 = 1.1234561f;
		System.out.println(f1); // 정상출력 
		
		float f2 = 1.12345671f;
		System.out.println(f2); // 소수자리 7자리 이후는 오차 발생 
		
		
//		double의 정밀도 : 대략 소수 15자리
		double d1 = 1.123456789012341;
		System.out.println(d1); // 정상출력 
		
		double d2 = 1.1234567890123451;
		System.out.println(d2); // 소수자리 15자리 이후는 오차 발생 
		
	}

}
