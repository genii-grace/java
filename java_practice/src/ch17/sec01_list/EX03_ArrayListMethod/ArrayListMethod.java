package ch17.sec01_list.EX03_ArrayListMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod {

	public static void main(String[] args) {

		List<Integer> aList1=new ArrayList<Integer>();
		
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		System.out.println("aList1의 원소 : "+aList1.toString());
		
		aList1.add(1,6);
		System.out.println("aList1 1인덱스 수정 :"+aList1.toString());
		System.out.println();
		
		List<Integer> aList2=new ArrayList<>();
		aList2.add(1);
		aList2.add(2);
		aList2.addAll(aList1);
		System.out.println("aList2의 원소 :"+aList2);
		System.out.println();
		
		List<Integer> aList3=new ArrayList<>();
		aList3.add(1);
		aList3.add(2);
		aList3.addAll(1, aList3);
		System.out.println("aList3 인덱스1에 리스트 추가 :"+aList3);
		
		aList3.set(1, 5);
		aList3.set(3, 6);
		System.out.println("aList3 인덱스 1,3 수정 :"+aList3);
		System.out.println();
		
		aList3.remove(1);
		System.out.println("aList3의 인덱스1 삭제 :"+aList3);
		
		aList3.remove(new Integer(2));
		System.out.println("aList3 원소 중 2와 같은 수 삭제 :"+aList3);
		
		aList3.clear();
		System.out.println("aList3 원소 삭제 :"+aList3);
		System.out.println();

		System.out.println("aList3은 비어있습니까? :"+aList3.isEmpty());
		System.out.println("aList3의 크기는 ? "+aList3.size());

		aList3.add(1);
		aList3.add(2);
		aList3.add(3);
		System.out.println("aList3의 원소리스트 :"+aList3);
		System.out.println("aList3에 원소추가 후 사이즈 :"+aList3.size());

		System.out.println("0번째원소 읽기 : "+aList3.get(0));
		System.out.println("1번째원소 읽기 : "+aList3.get(1));
		System.out.println("2번째원소 읽기 : "+aList3.get(2));
		
		for(int i=0;i<aList3.size();i++) 
			System.out.println("for문을 이용한 출력 : "+i+"번째 "+aList3.get(i));

		
		Object[] obj = aList3.toArray();
		System.out.println(Arrays.toString(obj));
		
		Integer[] integer1=aList3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer1));
		
		Integer[] integer2=aList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
		}
	}


