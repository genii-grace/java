package Day28;

import java.util.Calendar;
import java.util.Date;

public class ExCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar calendar = Calendar.getInstance();
		//new 객체 생성 하지 않는 이유 : getInstance 메서드에서 객체를 넘겨주기 때문 
		
		System.out.print("날짜 : ");
		System.out.print(calendar.get(Calendar.YEAR)+"년 ");
		System.out.print(calendar.get(Calendar.MONTH)+"월 ");
		System.out.print(calendar.get(Calendar.DATE)+"일 ");
		System.out.print(calendar.get(Calendar.HOUR)+"시 ");
		System.out.print(calendar.get(Calendar.MINUTE)+"분 ");
		System.out.println(calendar.get(Calendar.SECOND)+"초 ");

		//Date d = calendar.getTime();
		System.out.println(calendar.getTime());


	}

}
