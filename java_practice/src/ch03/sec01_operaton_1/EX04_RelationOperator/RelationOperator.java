package ch03.sec01_operaton_1.EX04_RelationOperator;

public class RelationOperator {
	
	public static void main(String[] args) {
		
		System.out.println(5<2);
		System.out.println(5>2);
		System.out.println(5<5);
		System.out.println(5<=5);
		System.out.println(5>=5);
		System.out.println();
		
		
		int a=5;
		int b=2;
		int c=5;
		
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a==c);
		System.out.println(a!=c);
		System.out.println();
		
		String str1=new String("안녕");
		String str2=new String("안녕");
		
		System.out.println(str1==str2);
		System.out.println(str1!=str2);

		
		/* 등가비교는 스택메모리값을 비교하는데
		기본 자료형은 스택메모리에 입력한 정수값이 저장되지만
	 	참조 자료형은 스택메모리에 압력한 문자열이 저장된 번지수가 저장되어있어서
	 	글자수가 같고 같은 내용이 입력되더라도 저장되는 메모리가 다르므로
	 	등가비교시 같을수 없다 */
		
		
	}

}
