// 컴파일 후 생성되는 바이트코드 (.class)

package ch01.sec01_basicsyntax.EX02_ByteCodeFiles;

class A { // A.class
} 
class B { // B.class
} 
class C { // C.class
	class D { // C$D.class - C는 아우터클래스, D는 이너클래
	}
	} 

public class ByteCodeFiles {
	
	public static void main(String[] args) {
	
		System.out.println("컴파일후 생성되는 바이트코드 확인");
		
		
	} //1개의 소스파일에는 최대 1개의 public class, 여러개의 class 구성 가능
	
	
	
	


}
