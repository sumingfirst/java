package 异常处理;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import javax.print.attribute.standard.PrinterLocation;

public class Exception2 {

	public static void main(String[] args) {
		File f=new File("D:/LOL.exe");
		//第一种捕捉异常的方法
		try{
			System.out.println("试图打开LOL.exe");
			new FileInputStream(f);
			System.out.println("成功打开");
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			Date d=sdf.parse("2016-06-03-21");
			
		
			
		}/*
		catch(FileNotFoundException e){
			System.out.println("没有找到这个文件");
			e.printStackTrace();
		}
	catch(ParseException e){
		System.out.println("日期格式和解析错误");
		e.printStackTrace();
		
	}*///第二种异常处理
		catch(FileNotFoundException|ParseException e)
		{
			if(e instanceof FileNotFoundException){
				System.out.println("LOL找不到");
			}
			if (e instanceof ParseException)
			{
				System.out.println("日期解析格式错误");
			}
			e.printStackTrace();
		}//无论如何都要进行的语句
		finally{
			System.out.println("无论如何都会执行的语句");
			
		}
	

}
}
