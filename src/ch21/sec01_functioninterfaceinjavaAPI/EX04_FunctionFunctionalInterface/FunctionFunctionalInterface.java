package ch21.sec01_functioninterfaceinjavaAPI.EX04_FunctionFunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class FunctionFunctionalInterface {

	public static void main(String[] args) {

//		익명이너클래스 표현
		
		Function<String, Integer> f=new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		System.out.println("안녕 -> int : "+f.apply("안녕"));
		
//		람다식 표현
		Function<String, Integer> f1 = str-> str.length();
		System.out.println("반가워 -> Int : "+f1.apply("반가워"));
		System.out.println();
		
//		확장형 입력 T가 고정
		IntFunction<Double> f2 = num -> (double)num;
		LongFunction <String> f3 = num -> String.valueOf(num);
		DoubleFunction <Integer> f4 = num -> (int)num;
		BiFunction <String, Integer, String> f5 = (name, age) -> "이름은 "+ name +", 나이는 "+ age;
		System.out.println("Int->Double : "+f2.apply(10));
		System.out.println("Long->String : "+f3.apply(20L));
		System.out.println("Double->Int : "+f4.apply(30.5));
		System.out.println("String, Int->String : "+f5.apply("홍길동", 16));
		System.out.println();
		
//		확장형 출력 R이 고정
		ToIntFunction<String> f6 = str -> str.length();
		ToLongFunction<Double> f7 = num -> num.longValue();
		ToDoubleFunction<Integer> f8 = num -> num/100.0 ;
		System.out.println("String->Int : "+f6.applyAsInt("반갑습니다"));
		System.out.println("Double->Long : "+f7.applyAsLong(54.234));
		System.out.println("Int->Double : "+f8.applyAsDouble(250));
		
		
	}

}
