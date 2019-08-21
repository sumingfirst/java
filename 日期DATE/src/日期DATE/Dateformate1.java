package 日期DATE;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Dateformate1 {

	public static void main(String[] args) {
		//日期转字符串
		// TODO 自动生成的方法存根
		//Y代表年
		//M代表月
		//d代表日
		//H代表24h制
		//h代表12h制
		//m代表分钟
		//s代表秒
		//S代表毫秒
		/*SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss:SS");
		Date d=new Date();
		String str=sdf.format(d);
		 System.out.println(str);
		 SimpleDateFormat sdf1=new SimpleDateFormat("YYYY-MM-dd HH");
			Date d2=new Date();
			String str2=sdf1.format(d);
			 System.out.println(str2);*/
			 //字符串转日期
			 SimpleDateFormat sdf2=new SimpleDateFormat("YYYY/MM/dd HH:mm:ss:SS");
			 String str3 ="2016/02/17 18:24:23:21";
			 try {
				Date d3=sdf2.parse(str3);
				System.out.println(d3);
			} catch (ParseException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}		
		
		
	}

}
