package io;
//关于流的一些知识点
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
public class Stream1 {

	public static void main(String[] args) {
		
		//创建基于文件的输入流
		File f1=new File("D:/hello.txt");
		//通过这个输入流，可以将数据从硬盘读取到内存中
		FileInputStream F3=null;
		try{
			 F3=new FileInputStream(f1);
			//创建基于文件的输入流
			File f=new File("D:/hello.txt");
			//通过这个输入流，可以将数据从硬盘读取到内存中
			FileInputStream F1=new FileInputStream(f);
			//创建一个字节数组，其长度等于内容的长度
			byte[]all=new byte[(int) f.length()];
			//以字节流读取每一个字节
			F1.read(all);
			for(byte b:all)//输出的都是其AScll码
			{
				System.out.println(b);
			}
			//在try中关闭流，但如果文件不存在或者存在抛出了异常会导致流不会正常关闭
			F1.close();
			//下面联系写入文件
			//创建一个输出流
			FileOutputStream F2=new FileOutputStream(f);
			byte c[]=new byte[]{1,2,3,4,5};
			F2.write(c, 0, 5);
			F2.close();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		//在fianlly中关闭流，这也是关闭流的正规的方法
		finally{
			if(null!=F3){
				try{
					F3.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			
			}
		}
		//第三种把流定义在try的括号里面当完成try catch或者fianlly自动关闭时自动会关闭，这是try withsource的新型编码形式是从jdk7开始的一种新型的技术
		try(FileInputStream F4=new FileInputStream(f1))
		{
			//各种操作
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
//InputStream和OutputInstram都是通过字节来存取数据的