package 日期DATE;
import java.util.Date;
public class Date2 {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println("输出现在的时间：");
		System.out.println(d1);
		System.out.println();
		Date d2=new Date (5000);
		System.out.println("基准时间5s后的时间：");
		System.out.println(d2);
		//通过getTime获得实践多少
		Date now=new Date();
		System.out.println("输出现在的时间："+now.toString());
		System.out.println("输出现在的时间："+now.getTime());
		//当前日期的毫秒数
		Date now2=new Date();
		System.out.println("输出现在的时间："+now2.getTime());
		System.out.println("输出现在的时间："+System.currentTimeMillis());
		

	}

}
