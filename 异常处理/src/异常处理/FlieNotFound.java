package 异常处理;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;;
public class FlieNotFound {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO 自动生成的方法存根
		File f=new File("D:/LOL.exe");
		try{
			System.out.println("试图打开d:/LOL.exe");
			new FileInputStream(f);
			System.out.println("成功打开了LOL");
		}
		/*catch(FileNotFoundException e)//FileNotFoundException是exception的子类也可以使用exception来进行异常处理
		{
			System.out.println("LOL不存在");
			e.printStackTrace();
		}*/
		catch(Exception e){
			System.out.println("这是第二种异常处理方法");
			e.printStackTrace();
		}

	}

}
//常见的错误的目前
//paraseException解析异常在日期字符串转换为日期对象时会抛出异常
//Out ofmermory内存不足异常
//OutOfindex数组下标越界的异常
//calssexception类型转换异常
//nullpointer空指针异常
//arithmeticexception除数为0异常