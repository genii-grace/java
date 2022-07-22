package ch07.practice;

import java.util.Arrays;

//		Q5
/*
class A{
	void averageScore(int...values) {
		int sum=0;
		for(int i=0; i<values.length; i++) {
			sum+=values[i];
		}
		
	배열출력방법 2번
		 for(int k: values) {
			sum+=k;
		}
		
		double avg=(double)sum/values.length;
		System.out.println(avg);
	}
}

public class practice {
	
	public static void main(String[] args) {
		
		A a=new A();
		
		a.averageScore(1);
		a.averageScore(1,2);
		a.averageScore(1,2,3);
		a.averageScore(1,2,3,4);
	}

}

//		Q6


class A{
	A(int k){
		
	}
	A(double a, double b){
		
	}
}
public class practice {
	public static void main(String[] args) {
		A a1=new A(3);
		A a2=new A(1.5, 2.8);
	}
} 

// Q4

class A{
	int abc(int m) {
		m=8; // 지역변수 m 
		System.out.println(m);
		return m;
	}
	
	void bcd(int[] n) { // n이 가리키는 공간에 4,5,6 이 저장
		n[0]=4; n[1]=5; n[2]=6;
	}
}
	public class practice {
		public static void main(String[] args) {
			A a=new A();
			
			int m=5; // 지역변수 m
			int[] n= {1,2,3}; // 배열의 참조값이 n 에 저장됨 
			
			a.abc(m); 
			
			System.out.println(Arrays.toString(n));
			
			a.bcd(n);
			
			System.out.println(m); //main() frame에 있는 지역변수 m 
			
			System.out.println(Arrays.toString(n)); // n이 가리키는 주소는 같으나 내용이 변경됨 
		}
	}
	*/
//Q7

class A{
	int m=3; // field
	int n=5; // field
	
	void abc(int m, int n) { // 변수 m, n
		this.m=m; // 변수에 m필드값 복사 
		n=n; // 
		System.out.println(m);
		System.out.println(n);
	}
}
 public class practice {
	 public static void main(String[] args) {
		 
		 A a=new A();
		 a.abc(7, 8);;
		 System.out.println(a.m); // 필드값 불러오기 
		 System.out.println(a.n); // 필드값 불러오기 
		 
	 }
 }