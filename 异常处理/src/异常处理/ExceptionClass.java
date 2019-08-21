package 异常处理;
//几种异常分类
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ExceptionClass {
//可查异常例如打不开文件
	public static void main(String[] args) {
		File f =new File("D:/LOL.exe");
		try
		{
			System.out.println("尝试打开LOL.exe");
			
			new FileInputStream(f);
			System.out.println("成功打开");
		}
		//Throwable是exception和error都继承这个
		
		/*catch(FileNotFoundException e)
		{
			System.out.println("打开文件LoL.exe");
			e.printStackTrace();
		}*/
		catch(Throwable e)
		{
			System.out.println("打开文件LoL.exe");
			e.printStackTrace();
		}
		//运行时异常主要为：除数为0，下标越界，空指针
		int k=5/0;
		int[] j=new int[5];
		j[10]=10;
		System.out.println(j[10]);
		String  str=null;
		System.out.println(str.length());
		
		
		
		//错误Error通常是内存用光了
		StringBuffer s=new StringBuffer();
		for(int i=0;i<Integer.MAX_VALUE;i++)
		{
			s.append('a');
		}
	}
}
