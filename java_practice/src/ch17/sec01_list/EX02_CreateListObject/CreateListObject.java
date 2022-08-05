package ch17.sec_list.EX02_CreateListObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {

	public static void main(String[] args) {

		List<Integer> aList1=new ArrayList<>(); // capacity 기본 10 
		List<Integer> aList2=new ArrayList<>(30); // capacity 30 
		List<Integer> aList3=new Vector<>();
		List<Integer> aList4=new Vector<>(30);
		List<Integer> aList5=new LinkedList<>(); //LinkedList 는 저장용량 지정 불가
		
		List<Integer> aList7=Arrays.asList(1,2,3,4); //리스트의 배열화
		List<String> aList8=Arrays.asList("hi","hello");
		aList7.set(1, 7); // 인덱스1을 7로 교체
//		aList7.add(5); // Arrays.asList 로 배열화 한 후 추가는 불가능함 
		aList8.set(0, "Thanks");
//		aList8.remove(0); // Arrays.asList로 배열화 한 후 삭제는 불가능함
		
		System.out.println(aList7);
		System.out.println(aList8);

	}

}
