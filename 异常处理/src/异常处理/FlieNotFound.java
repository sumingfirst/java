package �쳣����;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;;
public class FlieNotFound {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO �Զ����ɵķ������
		File f=new File("D:/LOL.exe");
		try{
			System.out.println("��ͼ��d:/LOL.exe");
			new FileInputStream(f);
			System.out.println("�ɹ�����LOL");
		}
		/*catch(FileNotFoundException e)//FileNotFoundException��exception������Ҳ����ʹ��exception�������쳣����
		{
			System.out.println("LOL������");
			e.printStackTrace();
		}*/
		catch(Exception e){
			System.out.println("���ǵڶ����쳣������");
			e.printStackTrace();
		}

	}

}
//�����Ĵ����Ŀǰ
//paraseException�����쳣�������ַ���ת��Ϊ���ڶ���ʱ���׳��쳣
//Out ofmermory�ڴ治���쳣
//OutOfindex�����±�Խ����쳣
//calssexception����ת���쳣
//nullpointer��ָ���쳣
//arithmeticexception����Ϊ0�쳣