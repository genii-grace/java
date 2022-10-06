package Day11;

import java.util.Random;

public class HW1 {

	static char[] str=new char[10];

	//1. 랜덤 (주고 안받고)
	static int randomSet() {
		Random r = new Random();
		int num = r.nextInt(26);
		return num;
	}

	//2. 더하기 연산 (주고 받고)
	static int add(int num) {
		int hap=num+'A';
		return hap;
	}

	//3. 연산완료 후 문자 만듦 (주고 받고)
	static char setChar (int hap) {
		char charset= (char)hap;
		return charset;
	}

	//4. 랜덤문자 만드는 작업 10번 실행 (안주고 안받고)
	static void randomFor() {
		for(int i=0; i<10; i++) {
			str[i]=setChar(add(randomSet()));
		}
	}

	//5. 10개문자 더하기 연산  (주고 받고)
	static String randomForHap(char[] str) {
		String strResult="";
		for(int i=0; i<10; i++) {
			strResult += str[i]+"";
		}
		return strResult;
	}

	//6. 10개 문자 출력 (안주고 받고)
	static void strPrint(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {

		randomFor();
		strPrint(randomForHap(str));



	}
}

