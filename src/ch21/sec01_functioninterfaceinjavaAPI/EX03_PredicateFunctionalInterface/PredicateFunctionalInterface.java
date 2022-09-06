package ch21.sec01_functioninterfaceinjavaAPI.EX03_PredicateFunctionalInterface;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {

	public static void main(String[] args) {
		
//		익명이너클래스
		Predicate <String> p =new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return (t.length()>0)? true:false;
			}
		};
		System.out.println("안녕 length >0 ? : "+p.test("안녕"));
		
//		람다식 표현
		Predicate <String> p1 = str-> (str.length()>0)? true:false;
		System.out.println("안녕 > 0? : "+p1.test("안녕"));
		
//		확장형
		IntPredicate p2 = num->num%2==0?true:false;
		LongPredicate p3 = num->num>100?true:false;
		DoublePredicate p4 = num->(num>0)?true:false;
		BiPredicate<String, String> p5 = (str1, str2) -> str1.equals(str2);
		
		System.out.println("2 %2==0? : "+p2.test(2));
		System.out.println("85L >100? : "+p3.test(85L));
		System.out.println("-5.8 > 0? : "+p4.test(-5.8));
		System.out.println("안녕, 방가 equlas? : "+p5.test("안녕","방가"));
	}

}
