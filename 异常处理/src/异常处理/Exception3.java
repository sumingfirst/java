package 异常处理;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Exception3 {
	public static void main(String[] args) {
		//method1();
		System.out.println(method());
	}
	/*private static void method1()
	{
		try {method2();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		}
	private static void method2() throws FileNotFoundException{
		File f=new File("D:/LOL。exe");
		System.out.println("试图打开D:lol.exe");
		new FileInputStream(f);
		System.out.println("成功打开");
	}*/
	//throw与throws的区别
	//throw声明在方法体内；throws出现在方法声明上
	//throws表示一种可能性不一定会发生这些异常，而throw择时抛出了异常，执行throw一定是抛出某个异常
	public static int method(){
		int i=5;
	
		try{
			return 1;
		}
		catch(Exception e)
		{
			return 2;
		}
		finally{
			return 3;
		}//方法最后返回的还是fianlly
	}

}
