package ch03.sec01_operator_1.EX06_AssignmentOperator;

public class AssignmentOperator {
	
	public static void main(String[] args) {
		
		int value1 = 3;
		value1 = value1+3;
		System.out.println(value1);
		System.out.println();
		
		int value2;
		value2=5;
		System.out.println(value2 +=2); //7
		
		value2=5;
		System.out.println(value2 -=2); //3
		
		value2=5;
		System.out.println(value2*=2); //10
		
		value2=5;
		System.out.println(value2/=2); //2
		
		value2=5;
		System.out.println(value2%=2); //1
		
		value2=5;
		System.out.println(value2|=2); //7
		
		value2=5;
		System.out.println(value2<<=2);//20
		
		value2=5;
		System.out.println(value2>>=2); //1
		
		value2=5;
		System.out.println(value2>>>=2); //1
		
	}

}
