package �쳣����;
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
		File f=new File("D:/LOL��exe");
		System.out.println("��ͼ��D:lol.exe");
		new FileInputStream(f);
		System.out.println("�ɹ���");
	}*/
	//throw��throws������
	//throw�����ڷ������ڣ�throws�����ڷ���������
	//throws��ʾһ�ֿ����Բ�һ���ᷢ����Щ�쳣����throw��ʱ�׳����쳣��ִ��throwһ�����׳�ĳ���쳣
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
		}//������󷵻صĻ���fianlly
	}

}
