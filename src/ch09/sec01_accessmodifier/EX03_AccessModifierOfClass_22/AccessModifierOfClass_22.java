package ch09.sec01_accessmodifier.EX03_AccessModifierOfClass_22;

import ch09.sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.AA;
//import ch09.sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.BB; // public class가 아닌 default class 이므 import 불가 
import ch09.sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.CC;


public class AccessModifierOfClass_22 {

	public static void main(String[] args) {
		
		AA a=new AA();
//		BB b=new BB(); // default class 이므로 import가 안되어 애초에 호출 불가 
//		CC c=new CC(); // public class 라 import까지는 가능하지만 default 생성자이기 때문에 호출이 불가함 
		 

	}

}
