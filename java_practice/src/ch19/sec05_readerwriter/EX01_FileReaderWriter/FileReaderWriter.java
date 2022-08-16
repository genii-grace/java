package ch19.sec05_readerwriter.EX01_FileReaderWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileReaderWriter {

	public static void main(String[] args) {

		File readerWriterFile=new File("chap19/ReaderWriterFile.txt");
//		if(!readerWriterFile.exists()) readerWriterFile.createNewFile();
		
		try(Writer writer = new FileWriter(readerWriterFile)){
			writer.write("안녕하세요\n".toCharArray());
			writer.write("Hello");
			writer.write('\n');
			writer.write("반갑습니다",2,3);
			writer.flush();
		}catch (IOException e) {}
				
		
		try(Reader reader = new FileReader("chap19/ReaderWriterFile.txt");){
			int data;
			while((data=reader.read())!=-1) {
				System.out.print((char)data);
				
			}
		}catch (IOException e) {}
	}

}
