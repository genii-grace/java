package ch17.sec02_set.EX03_LinkedHashSetMethod;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMethod {

	public static void main(String[] args) {

		Set<String> linkedSet1=new LinkedHashSet<>();
		
		linkedSet1.add("a");
		linkedSet1.add("b");
		linkedSet1.add("a"); // 중복 불가 
		System.out.println(linkedSet1.toString());
		
		Set<String> linkedSet2=new LinkedHashSet<>();
		linkedSet2.add("b");
		linkedSet2.add("c");
		linkedSet2.addAll(linkedSet1); // 중복 불가, 순서 가능 
		System.out.println(linkedSet2.toString());
		
		linkedSet2.remove("b");
		System.out.println(linkedSet2.toString());
		
		linkedSet2.clear();
		System.out.println(linkedSet2.toString());
		
		System.out.println("linkedSet2는 비어있습니까? : "+linkedSet2.isEmpty());
		
		Set<String> linkedSet3=new LinkedHashSet<>();
		
		linkedSet3.add("a");
		linkedSet3.add("c");
		linkedSet3.add("b");
		
//		원소가 있는지 확인 
		System.out.println("linkedSet3에 c 가 있습니까? : "+linkedSet3.contains("c"));
		System.out.println("linkedSet3에 f가 있습니까? : "+linkedSet3.contains("f"));

		System.out.println("linkedSet3의 사이즈는 ? : "+linkedSet3.size());
		
		System.out.print("linkedSet3의 원소 꺼내기 : ");
		Iterator<String> iterator=linkedSet3.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+",");
		}
		System.out.println();
		
		Object[] objArray=linkedSet3.toArray();
		System.out.println(Arrays.toString(objArray));
		
		String[] strArray1=linkedSet3.toArray(new String[0]);
		System.out.println(Arrays.toString(strArray1));
		
		String[] strArray2=linkedSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));
		
			
			
		
	}

}
