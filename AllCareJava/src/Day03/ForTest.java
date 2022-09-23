package Day03;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while과 for 변환

		int hap =0;
		//int count =1;
		
		/*
		while(count<=10) {
			hap+=count;
			count++;
		}
		*/
		
		for(int count=1; count<=10; count++) {
			hap+=count;
		}
		System.out.println("1부터 10까지의 합은 "+hap+"입니다.");

		
	}

}
