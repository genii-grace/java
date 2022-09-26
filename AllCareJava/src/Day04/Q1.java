package Day04;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		/*
		 * 숫자를 입력받고 짝수/홀수 출력
		 * */
		
		//1. 입력
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num1=sc.nextInt();
		
		String num2="";
		String num3="";
		
		//2. 짝수 홀수 나누기 
		for(int i=0; i<num1;i++) {
			if(num1%2==0) {
				num2+=i+" ";
				i++;
			}
			
			num3+=i+" ";
			}
		
		System.out.println("짝수 : "+num2);
		System.out.println("홀수 : "+num3);
		
		/* 강사님 피드백 
		 * while 문으로 작성
		 * 
		 * int i=1;
		 * while(i<num1){
		 * 	if(i%2==0){
		 * 		String temp=i+" ";
		 * 		j+=temp;
		 * 
		 * 	}
		 *  else{
		 *  	String temp=i+" ";
		 *  	h+=temp;
		 * 	 }
		 * 	i++;
		 *  }
		 *  System.out.println("짝수 : "+j);
		 *  System.out.println("홀수 : "+h);
		 * 
		 */
		
	}

}
