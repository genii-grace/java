package ch17.sec03_map.EX05_TreeMapMethod_1;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethod_1 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> treeMap=new TreeMap<Integer, String>();
		for (int i=20; i>0; i-=2) {
			treeMap.put(i, i+" 번째 데이터");
		}
		System.out.println(treeMap.toString());
		System.out.println("firstKey : "+treeMap.firstKey());
		System.out.println("firstEntry : "+treeMap.firstEntry());
		System.out.println();
		System.out.println("lastKey : "+treeMap.lastKey());
		System.out.println("lastEntry : :"+treeMap.lastEntry());
		System.out.println();
		System.out.println("lowerKey(11) : "+treeMap.lowerKey(11));
		System.out.println("lowerEntry(11) : "+treeMap.lowerEntry(11));
		System.out.println("lowerKey(10) : "+treeMap.lowerKey(11));
		System.out.println("lowerEntry(10) : "+treeMap.lowerEntry(11));
		System.out.println();
		System.out.println("higherKey(11) : "+treeMap.higherKey(11));
		System.out.println("higherEntry(11) : "+treeMap.higherEntry(11));
		System.out.println("higherKey(10) : "+treeMap.higherKey(10));
		System.out.println("higherEntry(10) : "+treeMap.higherEntry(10));
		System.out.println();
		System.out.println("pollFirstEntry() : "+treeMap.pollFirstEntry());
		System.out.println("to String() : "+treeMap.toString());
		System.out.println("pollLastEntry() : "+treeMap.pollLastEntry());
		System.out.println("to String() : "+treeMap.toString());
		System.out.println();
		System.out.println();
		SortedMap<Integer, String> sortedMap=treeMap.headMap(8);
		System.out.println("sortedMap(8) : "+sortedMap);
		NavigableMap<Integer, String> navigableMap=treeMap.headMap(8, true);
		System.out.println("navigableMap(8, true) : "+navigableMap);
		sortedMap=treeMap.tailMap(14);
		System.out.println("tailMap(14) : "+sortedMap);
		navigableMap=treeMap.tailMap(14, false);
		System.out.println("tailMap(14, false) : "+navigableMap);
				
		
	}

}
