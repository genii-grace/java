package ch14.sec01_typeofexception.EX01_CheckedException;

import java.io.FileInputStream;
import java.io.InputStreamReader;

class A implements Cloneable{
	protected Object clone() throws CloneNotSupportedException{
		return super .clone();
	}
}
public class CheckedException {

	public static void main(String[] args) {
/*
		Thread.sleep(1000); // InteruuptedException 발생
		
		Class cls=Class.forName("java.lang.Object"); // ClassNotFoundException 발생
		
		InputStreamReader in = new InputStreamReader(System.in);// IOException 발생
		in.read();
		
		FileInputStream fis = new FileInputStream("text.txt"); // FileNotFoundException 발생
		
		A a1=new A();
		A a2=(A)a1.clone(); // CloneNotSupportedException
		*/
	}

}
