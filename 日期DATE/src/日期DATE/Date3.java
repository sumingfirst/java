package ����DATE;
//�����1996��ȫ���ڵ����ʱ��ʹ��randon
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Date3 {

	public static void main(String[] args) {
		//����ʱ�����
		Date d1=new Date();
		Date d2=new Date();
		//����ʱ���ʽ
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//����ʱ���ַ���
		String s1="1995-01-01 00:00:00";
		String s2="1995-12-31 23:59:59";
		//���ַ���ת��Ϊʱ�䲢���
		try {
			System.out.println("��ʼʱ����"+sdf.parse(s1));
		} catch (ParseException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		try {
			System.out.println("��ʼʱ����"+sdf.parse(s2));
		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		try {
			long t=(long) ((Math.random()*(sdf.parse(s2).getTime()-sdf.parse(s1).getTime()))+sdf.parse(s1).getTime());
			 Date d3=new Date(t);
			 System.out.println(d3);
		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

 
	}

}
