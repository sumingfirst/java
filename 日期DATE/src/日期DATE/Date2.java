package ����DATE;
import java.util.Date;
public class Date2 {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println("������ڵ�ʱ�䣺");
		System.out.println(d1);
		System.out.println();
		Date d2=new Date (5000);
		System.out.println("��׼ʱ��5s���ʱ�䣺");
		System.out.println(d2);
		//ͨ��getTime���ʵ������
		Date now=new Date();
		System.out.println("������ڵ�ʱ�䣺"+now.toString());
		System.out.println("������ڵ�ʱ�䣺"+now.getTime());
		//��ǰ���ڵĺ�����
		Date now2=new Date();
		System.out.println("������ڵ�ʱ�䣺"+now2.getTime());
		System.out.println("������ڵ�ʱ�䣺"+System.currentTimeMillis());
		

	}

}
