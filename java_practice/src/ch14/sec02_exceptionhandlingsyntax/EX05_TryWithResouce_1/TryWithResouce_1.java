package ch14.sec02_exceptionhandlingsyntax.EX05_TryWithResouce_1;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResouce_1 {

	public static void main(String[] args) {

		System.out.println("문자를 입력하세요!");
		
		try(InputStreamReader isr1=new InputStreamReader(System.in);){//리소스를 해제하여 콘솔입력 불가 
			char input=(char) isr1.read();
			System.out.println("입력글자 = "+input);
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}

		InputStreamReader isr2=null;
		try {
			isr2=new InputStreamReader(System.in);
					char input =(char)isr2.read();
			System.out.println("입력글자="+input);
		}
		
		catch(IOException e) {
			
			e.printStackTrace();
			
		}
		
		finally {
			//리소스 해제 구문 
			if(isr2!=null) {
				try {
					isr2.close(); //리소스 수동해제 
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
