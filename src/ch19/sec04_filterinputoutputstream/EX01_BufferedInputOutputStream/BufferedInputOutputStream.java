package ch19.sec04_filterinputoutputstream.EX01_BufferedInputOutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedInputOutputStream {

	public static void main(String[] args) {
		
		File orgfile = new File("chap19/myorigin.jpg");
		File copyfile1 = new File("chap19/mycopy1.jpg");
		File copyfile2 = new File("chap19/mycopy2.jpg");
		
		long start, end,time1,time2;
		
//		BufferedStream 안쓸 때 
		start = System.nanoTime();
		try(
				InputStream is = new FileInputStream(orgfile);
				OutputStream os = new FileOutputStream(orgfile);){
			int data;
			while( (data=is.read())!=-1) 
			{
				os.write(data);
			}
		}catch(IOException e) {e.printStackTrace();}
		
		end=System.nanoTime();
		time1=end-start;
		System.out.println("WithoutBuffered : "+time1);
		
		
		start = System.nanoTime();
		try(
				InputStream is = new FileInputStream(orgfile);
				BufferedInputStream bis = new BufferedInputStream(is);
				OutputStream os = new FileOutputStream(copyfile2);
				BufferedOutputStream bos = new BufferedOutputStream(os);
				){
			int data;
			while( (data=bis.read())!=-1)
			{
				bos.write(data);
			}
			
		}catch(IOException e) {e.printStackTrace();}
		
		end=System.nanoTime();
		
		time2=end-start;
		System.out.println("With Bufferede : "+time2);
		System.out.println("Ratio of wiht and without : "+time1/time2);
		
		
	}

}
