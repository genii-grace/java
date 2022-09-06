//LinkedList<E> 역시 문법구문은 ArrayList와 동일하므로
//생략한 후 ArrayList와의 성능차이만 진행한다.

package ch17.sec01_list.EX06.ArrayListVsLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {


		List<Integer> aList=new ArrayList<>();
		List<Integer> linkedList=new LinkedList();
		long startTime, endTime, aResult, lResult=0; //시간 변수 초기화 

		//		데이터 추가시간 비교 
//		ArrayList 데이터 추가 시간
		startTime=System.nanoTime();
		for(int i=0;i<100000;i++) {
			aList.add(0,i);
		}
		
		endTime=System.nanoTime();
		aResult=endTime-startTime;
		System.out.println("ArrayList 데이터 추가시간 = "+(endTime-startTime)+"ns");
	

//		LinkedList 데이터 추가 시간
		startTime=System.nanoTime();
		for(int i=0; i<100000; i++) {
			linkedList.add(0,i);
		}
		
		endTime=System.nanoTime();
		lResult=endTime-startTime;
		System.out.println("LinkedList 데이터 추가시간 = "+(endTime-startTime)+"ns");
		
//		데이터 추가시간 비교 
		if(aResult-lResult>0) {
			System.out.println("LinkedList가 더 빠릅니다.");
		}else {
			System.out.println("ArrayList가 더 빠릅니다.");
		}
		
		System.out.println();
		
//		데이터 검색시간 비교
//		ArrayList 데이터 검색시간 

		startTime=System.nanoTime();
		for(int i=0; i<100000;i++) {
			aList.get(i);
		}
		endTime=System.nanoTime();
		aResult=endTime-startTime;
		System.out.println("ArrayList 데이터 검색 시간 = "+(endTime-startTime)+"ns");
		
//		LinkedList 데이터 검색시간
		startTime=System.nanoTime();
		for(int i=0; i<100000; i++) {
			linkedList.get(i);
		}
		
		endTime=System.nanoTime();
		lResult=endTime-startTime;
		System.out.println("LinkedList 데이터 검색 시간 = "+(endTime-startTime)+"ns");
		
//		데이터 검색 시간 비교 
		if(aResult-lResult>0) {
			System.out.println("LinkedList가 더 빠릅니다.");
		}else {
			System.out.println("ArrayList가 더 빠릅니다.");
		}
		
		System.out.println();
		
//		데이터 제거 시간 비교
//		ArrayList 데이터 제거 시간
		startTime=System.nanoTime();
		for(int i=0; i<100000;i++) {
			aList.remove(0);
		}
		endTime=System.nanoTime();
		aResult=endTime-startTime;
		System.out.println("ArrayList 데이터 제거 시간 = "+(endTime-startTime)+"ns");
		
//		LinkedList 데이터 제거 시간
		startTime=System.nanoTime();
		for(int i=0; i<100000;i++) {
			linkedList.remove(0);
		}
		endTime=System.nanoTime();
		lResult=endTime-startTime;
		System.out.println("LinkedList 데이터 제거 시간 = "+(endTime-startTime)+"ns");

//		데이터 제거 시간 비교 
		if(aResult-lResult>0) {
			System.out.println("LinkedList가 더 빠릅니다.");
		}else {
			System.out.println("ArrayList가 더 빠릅니다.");
		}
		
		System.out.println();
	
	
	}
}

