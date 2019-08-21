package calendar2;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Calendar2 {
	private static SimpleDateFormat sdf=new SimpleDateFormat("YY--MM--hh HH:mm:ss");
	
	

	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		Date now=c.getTime();
		System.out.println("��ǰʱ����"+fromat(c.getTime()));
		//�¸��µĽ���
		c.setTime(now);
		c.add(Calendar.MONTH, 1);
		System.out.println("�¸���ʱ����"+fromat(c.getTime()));
		//ȥ��Ľ�����
		c.setTime(now);
		c.add(Calendar.YEAR, -1);
		System.out.println("ȥ��Ľ���ʱ����"+fromat(c.getTime()));
		//�ϸ��µ�����
		c.setTime(now);
		c.add(Calendar.MONTH, -1);
		c.add(Calendar.DATE, -3);
		System.out.println("�ϸ��µ�����ʱ����"+fromat(c.getTime()));
		//�¸��µ���������
		c.setTime(now);
		c.add(Calendar.MONTH, 2);
		c.add(Calendar.DATE,-3);
		System.out.println("�¸��µ���������ʱ����"+fromat(c.getTime()));
		

	}

	private static String fromat(Date time) {
		// TODO �Զ����ɵķ������
		return sdf.format(time);
	}

	
}
