package Day09;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 *  1	2	3	4	5
		 *  16	17	18	19	6
		 *  15	24	25	20	7
		 *  14	23	22	21	8
		 *  13	12	11	10	9
		 */

		int x=0;//행
		int y=0;//열
		
		int count=1;//값 
		
		int n=1;//반복 
		int sw=1;// 짝수/홀수 분기 
		int[][] dal = new int[5][5];


		//첫줄은 기본 출력 
		for(int i=0; i<5; i++) { 
			dal[x][y++]= count++;
			}

		y-=1; //x=4, y=4인 상태로 세팅

		while(n<5) {
			if(sw==1) { //숫자가 짝수개 찍히는 구간 
				for(int i=0; i<dal.length-n; i++) {
					dal[++x][y]=count++;
					//(1,4) (2,4) (3,4) (4,4)
					// (2,3) (3,3)
				}
				for(int i=0; i<dal.length-n; i++) {
					dal[x][--y]=count++;
					//(4,3) (4,2) (4,1) (4,0)
					//(3,2) (3,1)
				}
				sw *= -1;
				n++; //숫자 찍히는 갯수 제어 
			}
			else { //숫자가 홀수개 찍히는 구간 
				for(int i=0; i<dal.length-n; i++) {
					dal[--x][y]=count++;
					//(0,3) (0,2) (0,1)
					//(2,1)
				}
				for(int i=0; i<dal.length-n; i++) {
					dal[x][++y]=count++;
					//(1,1) (1,2) (1,3)
					//(2,2)
				}
				sw *= -1;
				n++;
			}
		}
		
		/* 
		//패턴 찾기를 위해 달팽이 열 모든 값 1:1 입력 
		for(int i=0; i<(5-1); i++) { //세로 이동 
			dal[++x][y]=count++;
		}
		//x=4, y=5

		for(int i=0;i<(5-1); i++) { //가로 역행 

			dal[x][--y]=count++;
		}

		for(int i=0; i<(5-1-1); i++) { //세로 역행 
			dal[--x][y]=count++;
		}

		for(int i=0; i<(5-1-1); i++) { //가로 이동 
			dal[x][++y]=count++;
		}

		for(int i=0; i<(5-1-1-1); i++) { //세로 이동
			dal[++x][y]=count++;
		}

		for(int i=0; i<(5-1-1-1); i++) {// 가로 역행
			dal[x][--y]=count++;
		}

		for(int i=0; i<(5-1-1-1-1); i++) { //세로 역행 
			dal[--x][y]=count++;
		}

		for(int i=0; i<(5-1-1-1-1);i++) { //마지막 가로 이동 
			dal[x][++y]=count++;
		}

		 */
		
		//출력
		for(int i=0; i<dal.length; i++) {
			for(int j=0; j<dal[i].length; j++) {
				System.out.print(dal[i][j]+"\t");
			}
			System.out.println();
		}


	}

}
