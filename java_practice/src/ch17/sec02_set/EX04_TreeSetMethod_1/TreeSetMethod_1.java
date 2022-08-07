package ch17.sec02_set.EX04_TreeSetMethod_1;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMethod_1 {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet=new TreeSet<>();
		for(int i=50; i>0; i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet.toString());
		
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		System.out.println(treeSet.lower(26));
		System.out.println(treeSet.higher(26));
		System.out.println(treeSet.floor(25));
		System.out.println(treeSet.floor(26));
		System.out.println(treeSet.ceiling(25));
		System.out.println(treeSet.ceiling(26));
		
		int treeSetSize=treeSet.size();
		System.out.println(treeSetSize);
		System.out.println(treeSet.size());
		
		for(int i=0;i<treeSetSize;i++) { //treeSet Size만큼 반복하며 가장 작은 원소 꺼내기 
			System.out.print(treeSet.pollFirst()+" ");
		}
		System.out.println();
		System.out.println(treeSet.size()); // poll로 데이터를 다 꺼내면 데이터가 없음
		
		for(int i=2;i<=50;i+=2) {
			treeSet.add(i);
		}
		System.out.print(treeSet.toString());
		System.out.println();
		
		treeSetSize=treeSet.size();
		for(int i=0;i<treeSetSize;i++) {
			System.out.print(treeSet.pollLast()+" "); // 큰수부터 꺼내기 
		}
		
		System.out.println();
		System.out.println(treeSet.size());
		System.out.println();
		
		for(int i=2;i<=50;i+=2) {
			treeSet.add(i);
		}
		
		SortedSet<Integer> sSet=treeSet.headSet(20); // 20보다 작은 원소들의 집합 
		System.out.print(treeSet.headSet(20));
		System.out.println();
		System.out.println(sSet.toString());
		System.out.println();
		
		NavigableSet<Integer> nSet=treeSet.headSet(20,  true); // 20을포함 
		System.out.println(nSet.toString());
		nSet=treeSet.headSet(20, false); // 20을 미포함 
		System.out.println(nSet.toString());
		
		sSet=treeSet.tailSet(20);
		System.out.println(sSet.toString());
		nSet=treeSet.tailSet(20, false);
		System.out.println(nSet.toString());
		
		sSet=treeSet.subSet(10,20);
		System.out.println(sSet.toString());
		nSet=treeSet.subSet(10, false, 20, true);
		System.out.println(nSet.toString());
		System.out.println(treeSet);
		NavigableSet<Integer> descendingSet=treeSet.descendingSet();
		System.out.println(descendingSet);
		descendingSet=descendingSet.descendingSet();
		System.out.println(descendingSet);
	}
	

}
