package Day29;

import java.util.ArrayList;
import java.util.HashMap;


//충격이에요.

class Solution{
	public int[] solution(String[] id_list, String[] report, int k) {
		
		// 1. Map -> key : 신고당한사람 / 값 : 신고한사람
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		// 2. Map -> key : User      / 값 : 메일 횟수
		HashMap<String, Integer> mailSend_map = new HashMap<>();
		
		// 맵객체 생성
		for(String name:id_list) {
			ArrayList<String> list = new ArrayList<>();
			map.put(name, list);
			mailSend_map.put(name, 0);
		}
		
		// report -> map 데이터를 넣어줍니다.
		for(int i =0;i<report.length;i++) {
			String[] temp = report[i].split(" ");
			String a = temp[0]; // 신고자
			String b = temp[1]; // 신고당한사람
			ArrayList<String> arr = map.get(b);
			
			//중복을 확인해주는게 있음
			if(arr.contains(a)) {
				continue;
			}
			
			arr.add(a);
			map.put(b, arr);
			
		}
		
		for(String name:map.keySet()) {
			ArrayList<String> arr = map.get(name);
			if(arr.size() >= k) {
				for(int i = 0;i<arr.size();i++) {
					int count = mailSend_map.get(arr.get(i))+1;
					mailSend_map.put(arr.get(i), count);
				}
			}
		}
		
		int[] answer = new int[id_list.length];
		for(int i = 0;i<answer.length;i++) {
			answer[i] = mailSend_map.get(id_list[i]);
		}
        return answer;
	}
}


public class Programmers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		
		String[] id = {"muzi","frodo","apeach","neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		
		int[] a=s.solution(id, report, 1);
		for(int i =0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
		
	}

}
