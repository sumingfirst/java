package �쳣����;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import javax.print.attribute.standard.PrinterLocation;

public class Exception2 {

	public static void main(String[] args) {
		File f=new File("D:/LOL.exe");
		//��һ�ֲ�׽�쳣�ķ���
		try{
			System.out.println("��ͼ��LOL.exe");
			new FileInputStream(f);
			System.out.println("�ɹ���");
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			Date d=sdf.parse("2016-06-03-21");
			
		
			
		}/*
		catch(FileNotFoundException e){
			System.out.println("û���ҵ�����ļ�");
			e.printStackTrace();
		}
	catch(ParseException e){
		System.out.println("���ڸ�ʽ�ͽ�������");
		e.printStackTrace();
		
	}*///�ڶ����쳣����
		catch(FileNotFoundException|ParseException e)
		{
			if(e instanceof FileNotFoundException){
				System.out.println("LOL�Ҳ���");
			}
			if (e instanceof ParseException)
			{
				System.out.println("���ڽ�����ʽ����");
			}
			e.printStackTrace();
		}//������ζ�Ҫ���е����
		finally{
			System.out.println("������ζ���ִ�е����");
			
		}
	

}
}
