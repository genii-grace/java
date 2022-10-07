package Day12;

import java.util.Random;

public class ArrayRandomString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//랜덤으로 문자열 뽑기 
		// 문자열을 가진 배열을 만든 다음 랜덤으로 인덱스를 지정하여 출력 
	
		Random r =new Random();
		String[] str = {"대운","소운","평범","안좋음"};
		System.out.println(str[r.nextInt(str.length)]);
		
	}

}
