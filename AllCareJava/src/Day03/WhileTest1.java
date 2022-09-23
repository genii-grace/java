package Day03;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//입력받는 수 까지 더하기 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int inputNum = sc.nextInt();
		
		int hap =0;
		int count =1;
		
		while(count<=inputNum) {
			hap+=count;
			count++;
		}
		System.out.println("1부터 "+inputNum+"까지의 합은 "+hap+"입니다.");
		
		
		
	}

}
