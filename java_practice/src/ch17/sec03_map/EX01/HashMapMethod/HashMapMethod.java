package ch17.sec03_map.EX01.HashMapMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethod {

	public static void main(String[] args) {


		Map<Integer, String> hMap1=new HashMap<>();
		
		hMap1.put(2, "abc");
		hMap1.put(3, "def");
		hMap1.put(1, "xyz");
//		hashmap 입력, 입력순서 != 출력순서 
		System.out.println(hMap1.toString());
		
		Map<Integer, String> hMap2=new HashMap<>();
		hMap2.putAll(hMap1);
//		hMap1 전체를 추가 
		System.out.println(hMap2.toString());
		
		hMap2.replace(2, "가가가"); // 2key 값 수정 
		hMap2.replace(10, "다다다"); // key가 없으므로 동작하지않음 
		System.out.println(hMap2.toString());
		
		System.out.println(hMap2.get(1));
		System.out.println(hMap2.get(2));
		System.out.println(hMap2.get(3));
		
		for(int i=0; i<5; i++) {
			System.out.println("key : "+i+" : "+hMap2.containsKey(i));
		}
		
		System.out.println(hMap2.containsValue("가가가"));
		System.out.println(hMap2.containsValue("나나"));
		
		
		Set<Integer> keySet=hMap2.keySet();
		System.out.println(keySet.toString());
//		key 값만 모아서 보여주기
		
		Set<Map.Entry<Integer, String>> entrySet=hMap2.entrySet();
		System.out.println(entrySet.toString());
		
		System.out.println(hMap2.size());
		
		hMap2.remove(1);
		hMap2.remove(4); // key 4가 없으므로 동작하지 않음 
		System.out.println(hMap2.toString());
		
		hMap2.remove(3,"def");
		hMap2.remove(2,"나나나"); // 값이 존재하지 않으므로 동작하지 않음 
		System.out.println(hMap2.toString());
	
		hMap2.clear();
		System.out.println(hMap2.toString());
	}

}
