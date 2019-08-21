package 异常处理;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;;
public class FlieNotFound {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO 自动生成的方法存根
		File f=new File("D:/LOL.exe");
		new FileInputStream(f);

	}

}
//常见的错误的目前
//paraseException解析异常在日期字符串转换为日期对象时会抛出异常
//Out ofmermory内存不足异常
//OutOfindex数组下标越界的异常
//calssexception类型转换异常
//nullpointer空指针异常
//arithmeticexception除数为0异常