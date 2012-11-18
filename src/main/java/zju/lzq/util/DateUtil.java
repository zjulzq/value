package zju.lzq.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	public static Date today() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}
	
	public static void main(String[] args){
		System.out.println(DateUtil.today());
	}
}
