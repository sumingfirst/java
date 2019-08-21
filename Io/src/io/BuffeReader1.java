package io;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.processing.Filer;
public class BuffeReader1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File f=new File("D:/hello.txt");
		/*//创建文件字符流
		try(FileReader F1=new FileReader(f);
				//缓存流必须存在一个流的基础上
				BufferedReader br=new BufferedReader(F1);)
		{
			while(true)
			{
				String line=br.readLine();
				System.out.println(line);
				if(null==line)
				{
					break;
				}
			}
					}*/
		//下面是使用缓存流写出数据
		try(FileWriter F2=new FileWriter(f);PrintWriter bw=new PrintWriter(F2))
		{
			bw.println("这是使用缓存流写入的文件1");
			//立即将文件存入到磁盘
			bw.flush();
			bw.println("这是使用缓存流写入的文件2");
			bw.println("这是使用缓存流写入的文件3");
		
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	

	}

}
