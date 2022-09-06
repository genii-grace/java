package ch16.sec03_genericmethod.EX01_GenericMethod;

class GenericMethods{
	public <T> T method1(T t) {
		return t;
	}
	
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2); // 매개변수 t2가 t1과 같은지 
	}
	
	public <K,V> void method3(K k, V v) {
		System.out.println(k+" : "+v);
	}
}
public class GenericMethod {

	public static void main(String[] args) {

		GenericMethods gm=new GenericMethods();
		
		String str1=gm.<String>method1("안녕");
		System.out.println(str1);
		
		String str2=gm.method1("반가워");//"반가워"로 String 임을 유추할수 있으므로 생략
		System.out.println(str2);
		
		boolean bool1=gm.<Double>method2(2.5,2.5);
		System.out.println(bool1);
		
		boolean bool2=gm.<Double>method2(2.5,3.0);
		System.out.println(bool2);
		
		gm.<String,Integer>method3("국어",100);
		
	}

}
