package �쳣����;
//�����쳣����
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ExceptionClass {
//�ɲ��쳣����򲻿��ļ�
	public static void main(String[] args) {
		File f =new File("D:/LOL.exe");
		try
		{
			System.out.println("���Դ�LOL.exe");
			
			new FileInputStream(f);
			System.out.println("�ɹ���");
		}
		//Throwable��exception��error���̳����
		
		/*catch(FileNotFoundException e)
		{
			System.out.println("���ļ�LoL.exe");
			e.printStackTrace();
		}*/
		catch(Throwable e)
		{
			System.out.println("���ļ�LoL.exe");
			e.printStackTrace();
		}
		//����ʱ�쳣��ҪΪ������Ϊ0���±�Խ�磬��ָ��
		int k=5/0;
		int[] j=new int[5];
		j[10]=10;
		System.out.println(j[10]);
		String  str=null;
		System.out.println(str.length());
		
		
		
		//����Errorͨ�����ڴ��ù���
		StringBuffer s=new StringBuffer();
		for(int i=0;i<Integer.MAX_VALUE;i++)
		{
			s.append('a');
		}
	}
}
