package ch05.sec02_string.EX05_MethodOfString_1;

import java.util.Arrays;

public class MethodsOfString {
	
	public static void main(String[] args) {
		
		String str1="Hello Java!"; 
		String str2="안녕하세요! 반갑습니다.";
		System.out.println(str1.length()); // 띄어쓰기 포함해서 카운
		System.out.println(str2.length()); // 띄어쓰기 포함해서 카운
		System.out.println();
		
		System.out.println(str1.charAt(1)); //인덱스 1번에 위치한 문자. 0부터 시
		System.out.println(str2.charAt(1)); // 인덱스 1번에 위치한 문자. 0부터 시
		System.out.println();
		
		System.out.println(str1.indexOf('a')); //a의 위치
		System.out.println(str1.lastIndexOf('a')); //리터럴로 작성하여 앞의a와 공
		System.out.println(str1.indexOf('a',8));
		System.out.println(str1.lastIndexOf('a',8));
		System.out.println(str1.indexOf("Java")); // java의 위치 j의 위치
		System.out.println(str1.lastIndexOf("Java"));
		System.out.println(str2.indexOf("하세요"));
		System.out.println(str2.lastIndexOf("하세요"));
		System.out.println(str1.indexOf("Bye")); // 없으면 -1 리
		System.out.println(str2.lastIndexOf("고맙습니다."));
		System.out.println();
		
		
		String str3=String.valueOf(2.3);
		String str4=String.valueOf(false);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println();
		
		
		String str5=str3.concat(str4);//문자열 연결 
		System.out.println(str5);
		System.out.println();
		
		String str6="안녕"+3;
		String str7="안녕".concat(String.valueOf(3));
		
		String str8="Hello Java!";
		String str9="안녕";
		
		byte[] array1=str8.getBytes();
		byte[] array2=str9.getBytes();
		System.out.println(Arrays.toString(array1)); //bytes 배열 출력 
		System.out.println(Arrays.toString(array2));
		System.out.println();
		
		char[] array3=str8.toCharArray();
		char[] array4=str9.toCharArray();
		System.out.println(Arrays.toString(array3));//char 배열 출력 
		System.out.println(Arrays.toString(array4));
		
	}

}
