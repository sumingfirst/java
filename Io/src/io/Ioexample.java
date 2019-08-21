package io;
//文件对象

import java.io.File;
import java.io.IOException;
import java.util.Date;
public class Ioexample {

	public static void main(String[] args) throws IOException {
		//使用绝对路径和相对路径来创建File对象
		System.out.println("hello,world!");
		//绝对路径
		File f1=new File("D:/hello.txt");
		System.out.println("f1的绝对路径"+f1.getAbsolutePath());
		//相对路径，相对于工作路径，如果在ecslipse就是相对于项目目录
		File f2=new File("Hello.txt");
		System.out.println("f2的绝对路径"+f2.getAbsolutePath());
		//把f1作为父目录创建对象文件
		File f3=new File(f1,"LOL.exe");
		System.out.println("f3的绝对路径"+f3.getAbsolutePath());
		//文件的常用方法
		System.out.println(f1);
		//文件是否存在
		System.out.println("判断文件是否存在"+f1.exists());
		//判断是否是文件夹
		System.out.println("判断是否是文件夹"+f1.isDirectory());
		//判断是否是文件（相对于文件夹）
		System.out.println("判断是否是文件"+f1.isFile());
		//获取文件长度
		System.out.println(f1.length());
		//文件的最后修改时间
		long time=f1.lastModified();
		Date d=new Date(time);
	
		System.out.println("获取文件的最后修改时间"+d);
		f1.setLastModified(19351212);
		
		
		
		
		//文件的重命名
		File f5=new File("D:/hello1.txt");
		f1.renameTo(f5);
		System.out.println("把hello改名为hello1了");
		
		//以字符串数组的形式来，返回当前文件夹下所有的文件
		System.out.println(f1.list());
		/*//以文件数组的形式返回所有文件，不包括子文件和子文件夹和上面的那个一样
		File[]f6=f1.listFiles();
		for(int i=0;i<f6.length;i++)
		{
			System.out.println(f6[i]);
		}*/
		//以字符串的形式返回获取所在的文件夹
		f1.getParent();
		//以文件的形式返回所在的文件夹
		f1.getParentFile();
		//创建文件夹父文件夹不在就会创建无效
		f1.mkdir();
		//创建文件夹，如果父文件夹不在就会创建父文件夹
		f1.mkdirs();
		//创建一个空文件，如果父文件夹不在就会抛出异常
		f1.createNewFile();
		//创建一个文件夹前通常都会创建父文件夹
		f1.getParentFile().mkdirs();
		//列出所有的盘符如c，d
		f1.listRoots();
		//删除文件
		f1.delete();
		//jvm结束时删除文件，常用于临时文件的删除
		f1.deleteOnExit();
		
	
}}
