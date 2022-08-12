package ch19.sec01_fileandcharset.EX02_FileMethod;

import java.io.File;

public class FileMethod {

	public static void main(String[] args) {
		
		File tempDir=new File("temp");
		if(!tempDir.exists()) {tempDir.mkdir();}
		File file=new File("temp/Windows");
		System.out.println(file.mkdir());
		
		System.out.println("절대경로 : "+file.getAbsolutePath());
		System.out.println("폴더(?) : "+file.isDirectory());
		System.out.println("파일(?) : "+file.isFile());
		System.out.println("파일/폴더명 : "+file.getName());
		System.out.println("부모폴더 : "+file.getParent());
		
		File newfile1=new File("temp/abc");
		System.out.println(newfile1.mkdir());
		
		File newfile2=new File("temp/bcd/cde");
		System.out.println(newfile2.mkdir());
		System.out.println(newfile2.mkdirs());
		
		File[] fnames=file.listFiles();
		for(File fname : fnames) {
			System.out.println( (fname.isDirectory()?"폴더:":"파일:")+fname.getName());
		}


	}

}
