package ch05.sec02_string.EX03_SharingStringObject;

public class SharingStringObject {
	
	public static void main(String[] args) {
		
		String str1=new String("안녕");
		String str2="안녕";
		String str3="안녕";
		String str4=new String("안녕");
		
		System.out.println(str1==str2); // 출력할때는 스택메모리값 출력
		System.out.println(str2==str3);
		System.out.println(str3==str4);
		System.out.println(str4==str1);
	}

}
