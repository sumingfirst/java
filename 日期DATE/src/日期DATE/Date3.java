package 日期DATE;
//输出从1996年全年内的随机时间使用randon
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Date3 {

	public static void main(String[] args) {
		//创建时间对象
		Date d1=new Date();
		Date d2=new Date();
		//创建时间格式
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//创建时间字符串
		String s1="1995-01-01 00:00:00";
		String s2="1995-12-31 23:59:59";
		//将字符串转换为时间并输出
		try {
			System.out.println("起始时间是"+sdf.parse(s1));
		} catch (ParseException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		try {
			System.out.println("起始时间是"+sdf.parse(s2));
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		try {
			long t=(long) ((Math.random()*(sdf.parse(s2).getTime()-sdf.parse(s1).getTime()))+sdf.parse(s1).getTime());
			 Date d3=new Date(t);
			 System.out.println(d3);
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

 
	}

}
