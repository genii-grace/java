package ch17.prectice;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Prectice {

	public static void main(String[] args) {

		List<Integer> list1 =new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println(list1);
		List<Integer> list2=Arrays.asList(1,2);
//		list2.add(3); asList로 객체생성시 데이터 길이 변경 불가 
		System.out.println(list2);

	}

}
