package ch21.sec01_functioninterfaceinjavaAPI.EX02_SupplierFunctionalInterface;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class SupplierFunctionalInterface {

	public static void main(String[] args) {
		
//		익명이너클래스 표현
		Supplier <String> s = new Supplier<String>() {
			@Override
			public String get() {
				return "Supplier<T> 함수형 인터페이스 ";
			}
		};
		System.out.println(s.get());
		
//		람다식 표현
		Supplier <String> s1 = ()->"Supplier <T> 함수형 인터페이스";
		System.out.println(s1.get());
		
//		확장형 
		BooleanSupplier s2=()->false;
		IntSupplier s3=()->2+3;
		LongSupplier s4 = ()-> 10L;
		DoubleSupplier s5 = ()-> 5.8;
		System.out.println("Boolean : "+s2.getAsBoolean());
		System.out.println("Int : "+s3.getAsInt());
		System.out.println("Long : "+s4.getAsLong());
		System.out.println("Doulge : "+s5.getAsDouble());
	}

}
