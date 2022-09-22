package Day02;

public class TestCasting {

	public static void main(String[] args) {
		
		//형변환 
		System.out.println(7+6.5); // 13.5 -> 7이 double로 자동 형변환 
		System.out.println("안녕하세요"+5+3); // 안녕하세요53 String으로 자동 형변환 
		System.out.println((int)37.7); // 37 -> 소수점이 버려짐 
		System.out.println();
		System.out.println("안녕하세요"+(5+3)); // 안녕하세요8 -> 괄호의 우선순위가 더 높다.
		
	}

}
