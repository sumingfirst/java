package io;
//�ļ�����

import java.io.File;
import java.io.IOException;
import java.util.Date;
public class Ioexample {

	public static void main(String[] args) throws IOException {
		//ʹ�þ���·�������·��������File����
		System.out.println("hello,world!");
		//����·��
		File f1=new File("D:/hello.txt");
		System.out.println("f1�ľ���·��"+f1.getAbsolutePath());
		//���·��������ڹ���·���������ecslipse�����������ĿĿ¼
		File f2=new File("Hello.txt");
		System.out.println("f2�ľ���·��"+f2.getAbsolutePath());
		//��f1��Ϊ��Ŀ¼���������ļ�
		File f3=new File(f1,"LOL.exe");
		System.out.println("f3�ľ���·��"+f3.getAbsolutePath());
		//�ļ��ĳ��÷���
		System.out.println(f1);
		//�ļ��Ƿ����
		System.out.println("�ж��ļ��Ƿ����"+f1.exists());
		//�ж��Ƿ����ļ���
		System.out.println("�ж��Ƿ����ļ���"+f1.isDirectory());
		//�ж��Ƿ����ļ���������ļ��У�
		System.out.println("�ж��Ƿ����ļ�"+f1.isFile());
		//��ȡ�ļ�����
		System.out.println(f1.length());
		//�ļ�������޸�ʱ��
		long time=f1.lastModified();
		Date d=new Date(time);
	
		System.out.println("��ȡ�ļ�������޸�ʱ��"+d);
		f1.setLastModified(19351212);
		
		
		
		
		//�ļ���������
		File f5=new File("D:/hello1.txt");
		f1.renameTo(f5);
		System.out.println("��hello����Ϊhello1��");
		
		//���ַ����������ʽ�������ص�ǰ�ļ��������е��ļ�
		System.out.println(f1.list());
		/*//���ļ��������ʽ���������ļ������������ļ������ļ��к�������Ǹ�һ��
		File[]f6=f1.listFiles();
		for(int i=0;i<f6.length;i++)
		{
			System.out.println(f6[i]);
		}*/
		//���ַ�������ʽ���ػ�ȡ���ڵ��ļ���
		f1.getParent();
		//���ļ�����ʽ�������ڵ��ļ���
		f1.getParentFile();
		//�����ļ��и��ļ��в��ھͻᴴ����Ч
		f1.mkdir();
		//�����ļ��У�������ļ��в��ھͻᴴ�����ļ���
		f1.mkdirs();
		//����һ�����ļ���������ļ��в��ھͻ��׳��쳣
		f1.createNewFile();
		//����һ���ļ���ǰͨ�����ᴴ�����ļ���
		f1.getParentFile().mkdirs();
		//�г����е��̷���c��d
		f1.listRoots();
		//ɾ���ļ�
		f1.delete();
		//jvm����ʱɾ���ļ�����������ʱ�ļ���ɾ��
		f1.deleteOnExit();
		
	
}}
