package ch19.sec01_fileandcharset.EX03_EUCKRvsMS949;

import java.io.UnsupportedEncodingException;

public class EUCKRvsMS949 {

	public static void main(String[] args) throws UnsupportedEncodingException {

		byte[] b1="a".getBytes("EUC-KR");
		System.out.println("a를 EUC-KR로 바이트배열 변환함 : "+b1.length);
		
		byte[] b2="a".getBytes("MS949");
		System.out.println("a를 MS949로 바이트배열 변환함 : "+b2.length);
		
		System.out.println("영문은 모두 1byte");
		System.out.println();
		
		System.out.println("바이트로 쪼갠 b1을 EUC-KR 로 문자열 변환 : "+new String(b1, "EUC-KR"));
		System.out.println("바이트로 쪼갠 b2를 MS949 로 문자열 변환 : "+new String(b2, "MS949"));
		System.out.println();
		
		byte[] b3="가".getBytes("EUC-KR");
		System.out.println("가 를 EUC-KR로 바이트배열 변환함 : "+b3.length);
		
		byte[] b4="가".getBytes("MS949");
		System.out.println("가 를 MS949로 바이트배열 변환함 : "+b4.length);
		
		System.out.println("한글은 모두 2byte");
		System.out.println();
		
		System.out.println("바이트로 쪼갠 b3을 EUC-KR 로 문자열 변환 : "+new String(b3, "EUC-KR"));
		System.out.println("바이트로 쪼갠 b4를 MS949 로 문자열 변환 : "+new String(b4, "MS949"));
		System.out.println();
		
		byte[] b5="뷁".getBytes("EUC-KR");
		System.out.println("뷁 을 EUC-KR로 바이트배열 변환함 : "+b5.length);
		
		byte[] b6="뷁".getBytes("MS949");
		System.out.println("뷁 을 MS949로 바이트배열 변환함 : "+b6.length);
		
		System.out.println("맞춤법에 맞지 않는 단어는 EUC-KR에서 인식하지 못함 ");
		System.out.println();
		
		System.out.println("바이트로 쪼갠 b5을 EUC-KR 로 문자열 변환 : "+new String(b5, "EUC-KR"));
		System.out.println("바이트로 쪼갠 b6를 MS949 로 문자열 변환 : "+new String(b6, "MS949"));
		System.out.println();

	}

}
