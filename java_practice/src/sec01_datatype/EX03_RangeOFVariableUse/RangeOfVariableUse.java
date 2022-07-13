//변수의 생존기간 

package sec01_datatype.EX03_RangeOFVariableUse;

public class RangeOfVariableUse {
	
	public static void main(String[] args) {
		int value1 = 3; // 변수 value1 이 생성되는 시점
		{
			int value2 = 5; // 변수 value2 가 생성되는 시점
			
			System.out.println(value1);
			System.out.println(value2);
			
		} // 변수 value2 가 사라지는 시점
	
		System.out.println(value1);
		// System.out.println(value2); // 오류, 이미 변수가 사라짐
		
	} // 변수 value1 이 사라지는 시점 
	

}
