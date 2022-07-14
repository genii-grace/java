package ch03.sec01_operator_1.EX05_LogicalOperator;

public class LogicalOperator {
	
	public static void main(String[] args) {
		
//		논리연산자
		System.out.println(true && true); //true
		System.out.println(true && false); //false
		System.out.println(true && (5<3)); //false
		System.out.println((5<=5) && (7>2)); // true
		System.out.println((5<=5) && (7<2)); // false
		System.out.println();
		
		System.out.println(true||true); // true
		System.out.println(true||false); //true
		System.out.println(false||(5<3)); // false
		System.out.println((5<=5)||(7>2)); //true
		System.out.println((5<=5)||(7<2)); // true
		System.out.println();
		
		System.out.println(true^true); //false
		System.out.println(true^false); // true
		System.out.println(false^(5<3)); //false
		System.out.println((5<=5)^(7>2)); // false
		System.out.println((5<=5)^(7<2)); // true
		System.out.println();
		
		System.out.println(!true); // false
		System.out.println(!false); //true
		System.out.println(false||!(5<3)); // true
		System.out.println((5<=5)||!(7>2)); // true
		System.out.println((5<=5)||!(7<2)); // true
		System.out.println();
		System.out.println();
		
		/* 논리연산자로 실행시 쇼트서킷으로 ||을 진행하는 경우 뒷쪽 연산은 진행하지 않고 넘어간다.
		 쇼트서킷이 비트연산자와의 비교되는 차이점인데
		 증감연산자를 사용할 때에는 수행되지 않을수 있으므로 주의하여야 한다.
		 */
		
		int value1=3;
		System.out.println(false && ++value1>6); //false : 이미 &&에서 false가 선행되어 뒷쪽 연산은 진행되지 않는다.
		System.out.println(value1); //따라서 값은 3이된다.
		
		int value2=3;
		System.out.println(false & ++value2>6); // false : 비트연산자에서는 뒷부분도 실행되므로 밸류2값이 바뀐다.
		System.out.println(value2);
		
		int value3=3;
		System.out.println(true||++value3>6); //true : 부분만 진행된다.
		System.out.println(value3); // 따라서 값은 3
		
		System.out.println(true||value3++>6); //true : 부분만 진행된다.
		System.out.println(value3); // 따라서 값은 3
		
		int value4=3;
		System.out.println(true|++value4>6); //true
		System.out.println(value4); //비트연산이 뒷쪽까지 진행되므로 값은 4
		
		System.out.println(true|value4++>6); //true
		System.out.println(value4); //비트연산이 뒷쪽까지 진행되므로 값은 5
	}

}
