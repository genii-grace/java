package ch17.sec02_set.EX01_HashSetMethod;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetMethod {

	public static void main(String[] args) {
		
		Set<String> hSet1=new HashSet<>();
		
		hSet1.add("a");
		hSet1.add("b");
		hSet1.add("a"); // 중복저장 불가 
		System.out.println(hSet1.toString());

		Set<String> hSet2=new HashSet<>();
		hSet2.add("b"); // 중복저장 불가 
		hSet2.add("c");
		hSet2.addAll(hSet1);
		System.out.println(hSet2.toString());
		
		hSet2.remove("b");
		System.out.println(hSet2.toString());
		
		hSet2.clear();
		System.out.println(hSet2.toString());
		
		System.out.println("hSet2는 비어있습니까? :"+hSet2.isEmpty());

		Set<String> hSet3=new HashSet<>();
		hSet3.add("a");
		hSet3.add("b");
		hSet3.add("c");
		System.out.println(hSet3.contains("b")); // b 가 있는지 확인 
		System.out.println(hSet3.contains("f"));
		
		System.out.println(hSet3.size());
		
		Iterator<String> iterator =hSet3.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+",");
		}
		
		Object[] objArray=hSet3.toArray();
		System.out.println(Arrays.toString(objArray));
		
		String[] strArray1=hSet3.toArray(new String[0]);
		System.out.println(Arrays.toString(strArray1));
		
		String[] strArray2=hSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));
	}

}
