package baekjoon;

/*
import java.time.LocalDate;

public class Main10699 {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
	}
	*/
import java.text.SimpleDateFormat;
import java.util.*;

public class Main10699{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");
		
		Date d=new Date();
		System.out.println(format.format(d));
		
	}

}
