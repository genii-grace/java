package Day08;

import java.util.Random;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  크기 5인 배열
		 *  랜덤으로 1~9까지 저장
		 *  중복 제거
		 *  오름차순 정렬 -> 저장할 변수 하나 만들고 각 인덱스별로 비교(작은 수를 저장)  
		 */
		
		Random r = new Random();
		
		//배열 생성
		int[] num = new int[5];
		
		//랜덤 저장
		for(int i=0; i<num.length; i++) {
			num[i]=r.nextInt(9)+1;
			//중복제거
			for(int j=0;j<i; j++) {
				if(num[i]==num[j]) {
					i--;
					break;
				}
			}
		}
		System.out.print("랜덤 배열 : ");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}System.out.println();

		System.out.print("정렬한 배열 : ");
		for(int i=0; i<num.length-1;i++) { // 비교할 자리수 ,가장 마지막 num[4] 는 따로 비교하지 않으므로 num.length-1 
			for(int j=i+1; j<num.length; j++ ) { //숫자비교 반복 
				if(num[i]>num[j]) { // 비교할 자리수가 더 크면 자리 교체
					int min=num[j];
					num[j]=num[i];
					num[i]=min;
					
					//비교 후 작은 값 저장 
				}
				
			}
		}
		for(int i=0; i<num.length; i++) {
		System.out.print(num[i]+" ");
		}
	}

}

/*
 * 리뷰 :
 * 비교하는 패턴부터 정리해서 조건을 만들고 
 * 비교한 값을 정리해서 대입하는 것 (자리정리) 다시 체크할 것.   
 */
