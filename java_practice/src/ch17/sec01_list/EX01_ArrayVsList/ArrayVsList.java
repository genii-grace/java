package ch17.sce01_list.EX01_ArrayVsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsList {

	public static void main(String[] args) {


		String[] array=new String[] {"a","b","c","d","e","f","g"};
		System.out.println(array.length); //배열의 길이 
		array[2]=null; // c를 null 로 대체 
		array[5]=null; // f를 null 로 대체 
		System.out.println(array.length); // c와 f 를 null로 대체 해도 전체 길이는 변하지 않음 
		System.out.println(Arrays.toString(array));
		System.out.println();
		
		List<String> aList=new ArrayList<>(); //String 타입 
		System.out.println(aList.size()); // 데이터 개수, 객체 생성했을 당시는 데이터갯수 0
		aList.add("a");
		aList.add("b");
		aList.add("c");
		aList.add("d");
		aList.add("e");
		aList.add("f");
		aList.add("g");
		System.out.println(aList.size()); // 데이터 7개 추가하였으므로 7
		aList.remove("c");
		aList.remove("f");
		System.out.println(aList.size()); // c/f 제거했으므로 5개 나옴 
		System.out.println(aList);//5
	}

}
