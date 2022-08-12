package ch19.sec01_fileandcharset.EX01_CreateFileObject;

import java.io.File;
import java.io.IOException;

public class CreateFileObject {

	public static void main(String[] args) throws IOException {
		
//		C드라이브 temp 폴더 안에 temp 폴더 만들기 
		File tempDir = new File("temp");
	
//		temp 폴더 없으면 만들어 
		if(!tempDir.exists()) {tempDir.mkdir();}
		System.out.println("temp 폴더가 있나요? : "+ tempDir.exists());


//		c드라이브 temp 폴더안에 newFile.txt 파일 만들기 
		File newFile = new File("temp/newFile.txt");


//		없으면 만들어 
		if(!newFile.exists()) { newFile.createNewFile(); }
		System.out.println("newFile.txt파일이 있나요? : "+newFile.exists());
		System.out.println();



		File newFile2=new File("temp\\newFile.txt");
		File newFile3=new File("temp/newFile.txt");
		File newFile4=new File("temp"+File.separator+"newFile.txt");
		
		System.out.println("newFile.txt 파일이 있나요? : "+newFile2.exists());
		System.out.println("newFile.txt 파일이 있나요? : "+newFile3.exists());
		System.out.println("newFile.txt 파일이 있나요? : "+newFile4.exists());
		
		File newFile5 = new File("abc/newFile.txt");
		File newFile6 = new File("abc/bcd/newFile.txt");
		System.out.println(newFile5.getAbsolutePath());
		System.out.println(newFile6.getAbsolutePath());
		
		System.out.println(System.getProperty("user.dir"));
		File newFile7=new File("newFile1.txt");
		File newFile8=new File("bcd/newFile2.txt");
		System.out.println(newFile7.getAbsolutePath());
		System.out.println(newFile8.getAbsolutePath());

	}

}
