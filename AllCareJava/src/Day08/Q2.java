package Day08;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  5*5 배열
		 *  1~25까지 숫자 넣기 
		 *  
		 *  sol1.
		 *  짝수열은 상향
		 *  홀수열은 하향 
		 *  
		 *  sol2. // 강사님 피드백 
		 *  홀수/짝수로 나누는게 아니라 스위치 1, -1번갈아가면서 개행하고 카운트 함
		 *  숫자역행은 인덱스의 관계성을 찾아서 인덱스를 수정함  
		 */
		
		int count=1;
		int sw=1;
		int[][] array = new int[5][5];
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if (sw==1) {
					array[i][j]=count++;
				}
				else {
					array[i][array[j].length-1 -j]=count++;
				}
			
			}
			sw *= -1;

		}
		
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
