// 자동타입 변환과 수동 타입변환

package ch02.sec02_primarydatatype.EX05_TypeCasting_2;

public class Typecasting_2 {
	
	public static void main(String[] args) {
//		자동타입변환
		
		float value1 = 3; // 업캐스팅 
		long value2 = 5; // 업캐스팅 
		double value3 = 7; // 업캐스팅 
		byte value4 = 9;
		short value5 = 11;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println();
		
//		수동타입변환
		
		byte value6 = (byte)128; //다운캐스팅 
		int value7 = (int)3.5; // 다운캐스팅 
		float value8 = (float)7.5; // 다운캐스팅 
		
		System.out.println(value6); 
// 작은범위의 자료형으로 캐스팅할 경우 반대끝부터 시작하는 서큘러 구조를 보임 
		System.out.println(value7);
		System.out.println(value8);
		System.out.println();

		}
	}


