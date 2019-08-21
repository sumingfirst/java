package io;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
public class Dataflu {

	public static void main(String[] args) {
	write();
	read();

	}
	private static void read()
	{
		File f=new File("d:/hello.txt");
		try(FileInputStream F1=new FileInputStream(f);
				DataInputStream F2=new DataInputStream(F1))
		{
			boolean b=F2.readBoolean();
			int i=F2.readInt();
			String str=F2.readUTF();//��ȡ���ַ���
			System.out.println("��ȡ�Ĳ���������ֵΪ��"+b);
			System.out.println("��ȡ��int������ֵΪ��"+i);
			System.out.println("��ȡ���ַ����ĵ�ֵΪ��"+str);
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}
	}
			
	private  static void write(){
		File f=new  File("D:/hello.txt");
		try(FileOutputStream F1=new FileOutputStream(f);
				DataOutputStream F2=new DataOutputStream(F1))
		{
			F2.writeBoolean(true);
			F2.writeInt(6);
			F2.writeUTF("Hello,world!");
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
