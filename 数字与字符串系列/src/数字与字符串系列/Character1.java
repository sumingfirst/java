package �������ַ���ϵ��;

import java.util.Scanner;

public class Character1 {

	public static void main(String[] args) {
	char a='a';
	char b='b';
	char c='c';
	Character c1=c;//�Զ�װ��
	c=c1;//�Զ�ж��
	System.out.println(Character.isLetter('a'));//�ж��Ƿ�����ĸ
	System.out.println(Character.isDigit('a'));//�ж��Ƿ�������
	System.out.println(Character.isWhitespace('a'));//�ж��Ƿ��ǿհ�
	System.out.println(Character.isUpperCase('a'));//�ж��Ƿ��Ǵ�д
	System.out.println(Character.isLowerCase('a'));//�ж��Ƿ���Сд
	System.out.println(Character.toUpperCase('a'));//ת���ɴ�д
	System.out.println(Character.toLowerCase('a'));//ת����Сд
	//String f='a';������ֱ�ӵĽ��ַ������ַ�������
	String f= Character.toString('a');
	//ת���ַ�
	System.out.println("ʹ�ÿո񲢲��ܳ��ֿո�");
	System.out.println("ab   df");
	System.out.println("a def");
	System.out.println("ʹ��ˮƽ�Ʊ��//t���Դﵽ�ո��Ч��");
	System.out.println("abc\tdef");
	System.out.println("12345678abc");
	System.out.println("a\tbcdef");
	System.out.println("abcde\tf");
	System.out.println("abc\'def");//������
	System.out.println("abc\"def");//˫����
	System.out.println("abc\\def");
	//ѵ����ȡ�Ӽ����������Ϣ�������е����ֺʹ�д�������
	Scanner s1=new Scanner(System.in);
	String s2=s1.nextLine();
	char str[]=s2.toCharArray();
	for(int i=0;i<str.length;i++)
	{
		if(Character.isUpperCase(str[i])||Character.isDigit(str[i]))
		{
			System.out.println(str[i]);
		}
	}
	
	}

}
