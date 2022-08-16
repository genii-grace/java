package ch19.sec05_readerwriter.EX02_BufferedReaderWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderWriter {

	public static void main(String[] args) {

		File readerWriterFile = new File("chap19/BufferedFile.txt");
		
		try(Writer writer = new FileWriter(readerWriterFile);
				BufferedWriter bw = new BufferedWriter(writer);){
			bw.write("안녕하세요\n".toCharArray());
			bw.write("Hello");
			bw.write('\n');
			bw.write("반가워요",2,2);
			bw.flush();
		}catch (IOException e) {}
		
		try(Reader reader = new FileReader("chap19/BufferedFile.txt");
				BufferedReader br=new BufferedReader(reader); ) {
			String data;
			while( (data=br.readLine())!=null) {
				System.out.println(data);
			}
		}catch (IOException e) {}
	}

}
