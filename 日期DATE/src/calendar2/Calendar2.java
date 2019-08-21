package calendar2;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Calendar2 {
	private static SimpleDateFormat sdf=new SimpleDateFormat("YY--MM--hh HH:mm:ss");
	
	

	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		Date now=c.getTime();
		System.out.println("当前时间是"+fromat(c.getTime()));
		//下个月的今天
		c.setTime(now);
		c.add(Calendar.MONTH, 1);
		System.out.println("下个月时间是"+fromat(c.getTime()));
		//去年的今天是
		c.setTime(now);
		c.add(Calendar.YEAR, -1);
		System.out.println("去年的今天时间是"+fromat(c.getTime()));
		//上个月第三天
		c.setTime(now);
		c.add(Calendar.MONTH, -1);
		c.add(Calendar.DATE, -3);
		System.out.println("上个月第三天时间是"+fromat(c.getTime()));
		//下个月倒数第三天
		c.setTime(now);
		c.add(Calendar.MONTH, 2);
		c.add(Calendar.DATE,-3);
		System.out.println("下个月倒数第三天时间是"+fromat(c.getTime()));
		

	}

	private static String fromat(Date time) {
		// TODO 自动生成的方法存根
		return sdf.format(time);
	}

	
}
