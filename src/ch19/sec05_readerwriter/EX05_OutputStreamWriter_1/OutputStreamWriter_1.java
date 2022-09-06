package ch19.sec05_readerwriter.EX05_OutputStreamWriter_1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriter_1 {

	public static void main(String[] args) {
		
		File outputStreamWriter1 = new File("chap19/OutputStreamWriter1.txt");
		try(Writer writer = new FileWriter(outputStreamWriter1);){
				
		writer.write("OutputStreamWriter 예제입니다.".toCharArray());
		writer.write("한글과 영문이 모두 포함됨");
		writer.write('\n');
		writer.write("bye");
		writer.flush();
			
		}catch (IOException e) {}
		
		File outputStreamWriter2 = new File("chap19/OutputStreamWriter2.txt");
		try(OutputStream os = new FileOutputStream(outputStreamWriter2);
				OutputStreamWriter osw = new OutputStreamWriter(os, "MS949");){
			osw.write("OutputStreamWriter 예제입니다.".toCharArray());
			osw.write("한글과 영문이 모두 포함됨");
			osw.write('\n');
			osw.write("bye");
			osw.flush();
		}catch (IOException e) {}
		
	}

}
