package ����DATE;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Dateformate1 {

	public static void main(String[] args) {
		//����ת�ַ���
		// TODO �Զ����ɵķ������
		//Y������
		//M������
		//d������
		//H����24h��
		//h����12h��
		//m�������
		//s������
		//S�������
		/*SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss:SS");
		Date d=new Date();
		String str=sdf.format(d);
		 System.out.println(str);
		 SimpleDateFormat sdf1=new SimpleDateFormat("YYYY-MM-dd HH");
			Date d2=new Date();
			String str2=sdf1.format(d);
			 System.out.println(str2);*/
			 //�ַ���ת����
			 SimpleDateFormat sdf2=new SimpleDateFormat("YYYY/MM/dd HH:mm:ss:SS");
			 String str3 ="2016/02/17 18:24:23:21";
			 try {
				Date d3=sdf2.parse(str3);
				System.out.println(d3);
			} catch (ParseException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}		
		
		
	}

}
