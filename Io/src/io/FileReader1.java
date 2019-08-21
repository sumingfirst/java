package io;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//额外添加的文件
import java.io.FileReader;
import java.io.FilterReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class FileReader1 {

	public static void main(String[] args)throws UnsupportedEncodingException,FileNotFoundException {
		// TODO 自动生成的方法存根
		File f=new File("D:/hello.txt");
		System.out.println("默认的编码方式是："+Charset.defaultCharset());
		//Filereader得到的是字符，一定把字节根据某种编码，通过某种编码识别成了字符，
		//而Filereade使用的是默认的操作系统的字符，如果是中文操作系统，那么就是gbk
		/*try(FileInputStream F1=new FileInputStream(f)){
		
			byte[]b=new byte[(int) f.length()];
			System.out.println("从文件中读取的内容为：");
			F1.read(b);
		/	for(byte c:b)
			{
				int i=c&0x000000ff;//只读取最后两位
				System.out.println(Integer.toHexString(i));
				System.out.println(c);
			}
			System.out.println("把这个文件放到GBK棋盘上：");
			String str =new String(b,"GBK");
			System.out.println(str);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		try (FileReader F1=new FileReader(f))
		{
			char c[]=new char[(int) f.length()];
			F1.read(c);
			for(char b:c)
			{
				System.out.println(c);
			}
			System.out.printf("FileReader使用的是默认的编码形式%s,识别出来的字符是：",Charset.defaultCharset());
			System.out.println(new String(c));
		}
		catch(IOException e)
		{
		e.printStackTrace();
		}
//通过FileReader字符流正确读取中文，
		//但是通过FileReade读取的字符只能通过采用默认的编码形式，如果想要采用其他的输出形式必须采取InputSream
	}

}
