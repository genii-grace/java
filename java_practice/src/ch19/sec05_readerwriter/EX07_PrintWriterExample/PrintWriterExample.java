package ch19.sec05_readerwriter.EX07_PrintWriterExample;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) {
		
		File printWriter1 = new File("chap19/printWriter1.txt");
		File printWriter2 = new File("chap19/printWriter2.txt");
		File printWriter3 = new File("chap19/printWriter3.txt");
		
		try(PrintWriter pw = new PrintWriter(printWriter1);){
			pw.println("PrintWriter 예제#1");
			pw.println(13);
			pw.println(5.8);
			pw.print("안녕하세요");
			pw.println(" 반갑습니다");
			pw.printf("%d", 7).printf("%s %f"," 감사", 3.7);
			
		}catch (IOException e) {}
	
	
	try(PrintWriter pw=new PrintWriter(new FileWriter(printWriter3));){
		pw.println("PrintWriter 예제 3");
		
	}catch (IOException e) {}
	
	try(PrintWriter pw=new PrintWriter(new FileOutputStream(printWriter2));){
		pw.println("PrintWriter 예제 2");
	}catch(IOException e) {}
	
	PrintWriter pw=new PrintWriter(System.out,true);
	pw.println("PrintWriter 예제4");
	}
}
