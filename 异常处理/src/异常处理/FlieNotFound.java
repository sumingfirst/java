package �쳣����;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;;
public class FlieNotFound {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO �Զ����ɵķ������
		File f=new File("D:/LOL.exe");
		new FileInputStream(f);

	}

}
//�����Ĵ����Ŀǰ
//paraseException�����쳣�������ַ���ת��Ϊ���ڶ���ʱ���׳��쳣
//Out ofmermory�ڴ治���쳣
//OutOfindex�����±�Խ����쳣
//calssexception����ת���쳣
//nullpointer��ָ���쳣
//arithmeticexception����Ϊ0�쳣