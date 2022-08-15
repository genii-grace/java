package ch19.sec04_filterinputoutputstream.EX04_PrintStreamExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		File outFile1 = new File("chap19/PrintStream1.txt");
		if (!outFile1.exists()) outFile1.createNewFile();
		
		File outFile2= new File("chap19/PrintStream2.txt");
		if  (!outFile2.exists()) outFile2.createNewFile();
		
		try(OutputStream os1=new FileOutputStream(outFile1);
			PrintStream ps = new PrintStream(os1);) {
			ps.println(5.8);
			ps.print(3+"HI"+12345+"\n");
			ps.printf("%d", 7).printf("%s %f","안녕",5.8);
			ps.println();
				
		}catch (IOException e) {}
		
		try(PrintStream ps = new PrintStream(outFile2);){
			ps.println(5.8);
			ps.print(3+"HI"+12345+"\n");
			ps.printf("%d", 7).printf("%s %f","안녕",5.8);
			ps.println();
		}catch (IOException e) {}
		
		try(OutputStream os2=System.out;
				PrintStream ps = new PrintStream(os2);){
			ps.println(5.8);
			ps.print(3+"HI"+12345+"\n");
			ps.printf("%d", 7).printf("%s %f","안녕",5.8);
			ps.println();
		}catch (IOException e) {}
	}

}
