package io;
//��������һЩ֪ʶ��
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
public class Stream1 {

	public static void main(String[] args) {
		
		//���������ļ���������
		File f1=new File("D:/hello.txt");
		//ͨ����������������Խ����ݴ�Ӳ�̶�ȡ���ڴ���
		FileInputStream F3=null;
		try{
			 F3=new FileInputStream(f1);
			//���������ļ���������
			File f=new File("D:/hello.txt");
			//ͨ����������������Խ����ݴ�Ӳ�̶�ȡ���ڴ���
			FileInputStream F1=new FileInputStream(f);
			//����һ���ֽ����飬�䳤�ȵ������ݵĳ���
			byte[]all=new byte[(int) f.length()];
			//���ֽ�����ȡÿһ���ֽ�
			F1.read(all);
			for(byte b:all)//����Ķ�����AScll��
			{
				System.out.println(b);
			}
			//��try�йر�����������ļ������ڻ��ߴ����׳����쳣�ᵼ�������������ر�
			F1.close();
			//������ϵд���ļ�
			//����һ�������
			FileOutputStream F2=new FileOutputStream(f);
			byte c[]=new byte[]{1,2,3,4,5};
			F2.write(c, 0, 5);
			F2.close();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		//��fianlly�йر�������Ҳ�ǹر���������ķ���
		finally{
			if(null!=F3){
				try{
					F3.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			
			}
		}
		//�����ְ���������try���������浱���try catch����fianlly�Զ��ر�ʱ�Զ���رգ�����try withsource�����ͱ�����ʽ�Ǵ�jdk7��ʼ��һ�����͵ļ���
		try(FileInputStream F4=new FileInputStream(f1))
		{
			//���ֲ���
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
//InputStream��OutputInstram����ͨ���ֽ�����ȡ���ݵ�