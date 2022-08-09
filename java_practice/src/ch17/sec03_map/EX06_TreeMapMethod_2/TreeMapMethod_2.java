package ch17.sec03_map.EX06_TreeMapMethod_2;

import java.util.Comparator;
import java.util.TreeMap;

class MyClass{
	int data1;
	int data2;
	public MyClass(int data1, int data2) {
		this.data1=data1;
		this.data2=data2;
	}
	@Override
	public String toString() {
		return "data1= "+data1+"을 갖고있는 클래스";
	}
}

class MyComparableClass implements Comparable<MyComparableClass>{
	int data1;
	int data2;
	public MyComparableClass(int data1, int data2) {
		this.data1=data1;
		this.data2=data2;
		
	}
	@Override
	public int compareTo(MyComparableClass o) {
		if(this.data1<o.data1)return -1;
		else if(this.data1==o.data1)return 0;
		else return 1;
	}
	
	@Override
	public String toString() {
		return "data1= "+data1+"을 갖고있는 클래스";
	}
}
public class TreeMapMethod_2 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> treeMap1=new TreeMap<>(); // key 가 숫자일때 
		Integer intValue1=new Integer(20);
		Integer intValue2=new Integer(10);
		treeMap1.put(intValue1, "가나다");
		treeMap1.put(intValue2, "나라다");
		System.out.println(treeMap1.toString());
		
		TreeMap<String, Integer> treeMap2=new TreeMap<>();// Key가 문자일때 
		String str1="ab";
		String str2="cd";
		treeMap2.put(str1, 10);
		treeMap2.put(str2, 20);
		System.out.println(treeMap2.toString());

//		객체 크기비교 1
		TreeMap<MyComparableClass, String> treeMap4=new TreeMap<>();
		MyComparableClass myComparableClass1=new MyComparableClass(2,5);
		MyComparableClass myComparableClass2=new MyComparableClass(3,3);
		treeMap4.put(myComparableClass1, "abc");
		treeMap4.put(myComparableClass2, "xyz");
		System.out.println(treeMap4);
		
//		객체 크기비교 2
		TreeMap<MyClass, String> treeMap5= new TreeMap<>(new Comparator<MyClass>() {
			@Override
			public int compare(MyClass o1, MyClass o2) {
				if(o1.data1<o2.data1) return -1;
				else if (o1.data1==o2.data1) return 0;
				else return 1;
			}
		});
		
		MyClass myClass1=new MyClass(7,5);
		MyClass myClass2=new MyClass(3,3);
		treeMap5.put(myClass1, "가나다");
		treeMap5.put(myClass2, "나라다");
		System.out.println(treeMap5);

	}

}
