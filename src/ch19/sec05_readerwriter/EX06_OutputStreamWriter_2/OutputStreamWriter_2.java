package ch19.sec05_readerwriter.EX06_OutputStreamWriter_2;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_2 {

	public static void main(String[] args) {
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "UTF-8");
		osw.write("OutputStreamWriter를 이용한 \n".toCharArray());
		osw.write("콘솔출력 예제입니다. \n한글과 영문이 모두포함됐음 ");
		osw.write("BYE");
		osw.flush();
		}catch (IOException e) {}
		
	}

}
