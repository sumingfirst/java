package calendar2;
import java.util.Date;
import java.util.Calendar;
public class Calendar1 {

	public static void main(String[] args) {
		// 采用单例模式获得日历对象Calendar。getInstance(_
		Calendar c1=Calendar.getInstance();
		System.out.println(c1);
		//通过日历对象得到日期对象
		Date d=c1.getTime();
		System.out.println(d);
		Date d2=new Date(0);
		c1.setTime(d2);
		System.out.println(c1);

	}

}
