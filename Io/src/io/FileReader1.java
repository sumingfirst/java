package io;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//������ӵ��ļ�
import java.io.FileReader;
import java.io.FilterReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class FileReader1 {

	public static void main(String[] args)throws UnsupportedEncodingException,FileNotFoundException {
		// TODO �Զ����ɵķ������
		File f=new File("D:/hello.txt");
		System.out.println("Ĭ�ϵı��뷽ʽ�ǣ�"+Charset.defaultCharset());
		//Filereader�õ������ַ���һ�����ֽڸ���ĳ�ֱ��룬ͨ��ĳ�ֱ���ʶ������ַ���
		//��Filereadeʹ�õ���Ĭ�ϵĲ���ϵͳ���ַ�����������Ĳ���ϵͳ����ô����gbk
		/*try(FileInputStream F1=new FileInputStream(f)){
		
			byte[]b=new byte[(int) f.length()];
			System.out.println("���ļ��ж�ȡ������Ϊ��");
			F1.read(b);
		/	for(byte c:b)
			{
				int i=c&0x000000ff;//ֻ��ȡ�����λ
				System.out.println(Integer.toHexString(i));
				System.out.println(c);
			}
			System.out.println("������ļ��ŵ�GBK�����ϣ�");
			String str =new String(b,"GBK");
			System.out.println(str);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		try (FileReader F1=new FileReader(f))
		{
			char c[]=new char[(int) f.length()];
			F1.read(c);
			for(char b:c)
			{
				System.out.println(c);
			}
			System.out.printf("FileReaderʹ�õ���Ĭ�ϵı�����ʽ%s,ʶ��������ַ��ǣ�",Charset.defaultCharset());
			System.out.println(new String(c));
		}
		catch(IOException e)
		{
		e.printStackTrace();
		}
//ͨ��FileReader�ַ�����ȷ��ȡ���ģ�
		//����ͨ��FileReade��ȡ���ַ�ֻ��ͨ������Ĭ�ϵı�����ʽ�������Ҫ���������������ʽ�����ȡInputSream
	}

}
