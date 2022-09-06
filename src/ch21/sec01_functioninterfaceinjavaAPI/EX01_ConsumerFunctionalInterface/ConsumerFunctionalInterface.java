package ch21.sec01_functioninterfaceinjavaAPI.EX01_ConsumerFunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerFunctionalInterface {

	public static void main(String[] args) {
		
//		익명이너클래스 표현
		Consumer<String> c= new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
			
//		람다식 표현
		Consumer<String> c1=str->System.out.println(str);
		c1.accept("Consumer<T> 함수형 인터페이스");
		
//		확장형 Consumer
		IntConsumer c2 = num->System.out.println("int = "+num);
		LongConsumer c3 = num->System.out.println("long = "+num);
		DoubleConsumer c4 = num->System.out.println("Double = "+num);
		BiConsumer<String, Integer> c5 = (name, age) -> System.out.println("이름 : "+name+", 나이 : "+age);
		
		c2.accept(5);
		c3.accept(5L);
		c4.accept(7.8);
		c5.accept("홍길동", 16);
		
	}

}
