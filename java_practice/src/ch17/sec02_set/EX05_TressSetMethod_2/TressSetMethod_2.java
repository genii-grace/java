package ch17.sec02_set.EX05_TressSetMethod_2;

import java.util.Comparator;
import java.util.TreeSet;

class MC{
	int data1;
	int data2;
	public MC(int data1, int data2) {
		this.data1=data1;
		this.data2=data2;
		
	}
}

class MComparableC implements Comparable<MComparableC>{
	int data1;
	int data2;
	public MComparableC(int data1, int data2) {
		this.data1=data1;
		this.data2=data2;
	}
	
	@Override
	public int compareTo(MComparableC o) {
		if(this.data1<o.data1)
			return -1;
		else if(this.data1==o.data1)
			return 0;
		else return 1;
		
	}
}
public class TressSetMethod_2 {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet1=new TreeSet<Integer>();
		Integer intValue1=new Integer(20);
		Integer intValue2=new Integer(10);
		
		treeSet1.add(intValue1);
		treeSet1.add(intValue2);
		System.out.println(treeSet1.toString());
		
		TreeSet<String> treeSet2=new TreeSet<>();
		String str1="ab";
		String str2="cd";
		treeSet2.add(str1);
		treeSet2.add(str2);
		System.out.println(treeSet2.toString());

		
		TreeSet<MComparableC> treeSet4=new TreeSet<>();
		MComparableC myComparableClass1=new MComparableC(2,5);
		MComparableC myComparableClass2=new MComparableC(3,4);
		treeSet4.add(myComparableClass1);
		treeSet4.add(myComparableClass2);
		for(MComparableC mcc:treeSet4) {
			System.out.print(mcc.data1+",");
		}
		System.out.println();
		
		TreeSet<MC> treeSet5=new TreeSet<MC>(new Comparator<MC>() {
		
		@Override
		public int compare(MC o1, MC o2) {
			if(o1.data1<o2.data1)
				return -1;
			else if (o1.data1==o2.data1)
				return 0;
			else return 1;
		}
		});
		MC mC1=new MC(2,5);
		MC mC2=new MC(3,4);
		treeSet5.add(mC1);
		treeSet5.add(mC2);
		for(MC mcc:treeSet5) {
			System.out.println(mcc.data1);
		}
	}

}
