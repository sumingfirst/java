package io;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.processing.Filer;
public class BuffeReader1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		File f=new File("D:/hello.txt");
		/*//�����ļ��ַ���
		try(FileReader F1=new FileReader(f);
				//�������������һ�����Ļ�����
				BufferedReader br=new BufferedReader(F1);)
		{
			while(true)
			{
				String line=br.readLine();
				System.out.println(line);
				if(null==line)
				{
					break;
				}
			}
					}*/
		//������ʹ�û�����д������
		try(FileWriter F2=new FileWriter(f);PrintWriter bw=new PrintWriter(F2))
		{
			bw.println("����ʹ�û�����д����ļ�1");
			//�������ļ����뵽����
			bw.flush();
			bw.println("����ʹ�û�����д����ļ�2");
			bw.println("����ʹ�û�����д����ļ�3");
		
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	

	}

}
