package �������ַ���ϵ��;

import java.util.Scanner;

public class Format {

	public static void main(String[] args) {
		String name="����";
		int kill=8;
		String title="����";
		String Sentence=name+"�ڽ�����"+kill+"�λ�ɱ"+title;
		System.out.println(Sentence);
		//ʹ�ø�ʽ�����%s�����ַ���%d��������%n������
		String SentenceFormat ="%s�ڽ���������%d�λ�ɱ������%s�ĳƺ�%n";
		//ʹ��printf���и�ʽ�����
		System.out.printf(SentenceFormat,name,kill,title);
		//ʹ��format���и�ʽ�����
		System.out.format(SentenceFormat,name,kill,title);
		System.out.printf("���ǻ��з�%");
		System.out.printf("���ǻ��з�%n");
		int year=2020;
		System.out.format("%d%n",year);
		//�Ҷ���
		System.out.format("%8d%n",year);
		//�����
		System.out.format("%-8d%n",year);
		//����ǧλ�ָ���
		
		System.out.format("%,8d%n",year*1000);
		//ǰ�����0
		System.out.format("%08d%n",year);
		Scanner s=new Scanner(System.in);
		System.out.println("�����������");
	    String str1 = s.next();
	    System.out.println("���乫˾��");
	    String str2 = s.next();
	    System.out.println("����������");
	    String str3 = s.next();
	    System.out.println();
	    String str4= s.next("��������");
	    


	}

}
