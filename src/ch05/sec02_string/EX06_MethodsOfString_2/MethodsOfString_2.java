package ch05.sec02_string.EX06_MethodsOfString_2;

import java.util.Arrays;

public class MethodsOfString_2 {
	public static void main(String[] args) {
		String str1="Java Study";
		
		System.out.println(str1.toLowerCase()); //전부 소문자 
		System.out.println(str1.toUpperCase());// 전부 대문자 
		
		System.out.println(str1.replace("Study","공부")); //스터디를 공부로 
		
		System.out.println(str1.substring(0,5)); //0부터 4까지 포함한 문자열 객체 생
		
		String[] strArray="abc/def-ghi jkl".split("/|-| "); // |는 구분기호 
		System.out.println(Arrays.toString(strArray)); //배열로 출력 
		
		System.out.println("    abc    ".trim()); //앞뒤 공백 제거 
		
		
		System.out.println();
		
		String str2=new String("Java");
		String str3=new String("Java");
		String str4=new String("java");
		
		System.out.println(str2==str3);
		System.out.println(str3==str4);
		System.out.println(str4==str2);
		
		System.out.println(str2.equals(str3)); //실제 데이터 비교 
		System.out.println(str2.equals(str4)); //
		System.out.println(str3.equalsIgnoreCase(str4));
		
		
		
	}

}
