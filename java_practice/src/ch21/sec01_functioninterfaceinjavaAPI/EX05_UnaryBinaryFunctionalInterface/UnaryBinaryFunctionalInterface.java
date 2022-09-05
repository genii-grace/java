package ch21.sec01_functioninterfaceinjavaAPI.EX05_UnaryBinaryFunctionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryFunctionalInterface {

	public static void main(String[] args) {

//		익명이너클래스
		UnaryOperator<Integer> uo =new UnaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t) {
				return t*2;
			}
		};
		System.out.println(uo.apply(5));
		
//		람다식 표현
		UnaryOperator<Integer> uo1 = t->t*2;
		System.out.println(uo1.apply(10));
		
//		확장형 표현
		IntUnaryOperator uo2 = num -> num*10;
		LongUnaryOperator uo3 = num -> num+20L;
		DoubleUnaryOperator uo4 = num -> num*10.0;
		System.out.println(uo2.applyAsInt(3));
		System.out.println(uo3.applyAsLong(20L));
		System.out.println(uo4.applyAsDouble(30.5));
		System.out.println();
		
//		익명이너클래스
		
		BinaryOperator<String> bo =new BinaryOperator<String>() {
			@Override
			public String apply(String t, String u) {
				return t+u;
			}
		};
		System.out.println(bo.apply("안녕", "하세요"));
		
//		람다식 표현
		BinaryOperator<String> bo1 = (str1, str2) -> str1+str2;
		System.out.println(bo1.apply("반갑", "습니다"));
		
//		확장형 표현
		IntBinaryOperator bo2 = (num1, num2) -> num1+num2;
		LongBinaryOperator bo3 = (num1, num2) -> num1*num2;
		DoubleBinaryOperator bo4 = (num1, num2) -> num1/num2;
		System.out.println("Int Binary : "+bo2.applyAsInt(10,20));
		System.out.println(bo3.applyAsLong(20L, 10L));
		System.out.println(bo4.applyAsDouble(40.2, 12.0));
		
		
	}

}