package calendar2;
import java.util.Date;
import java.util.Calendar;
public class Calendar1 {

	public static void main(String[] args) {
		// ���õ���ģʽ�����������Calendar��getInstance(_
		Calendar c1=Calendar.getInstance();
		System.out.println(c1);
		//ͨ����������õ����ڶ���
		Date d=c1.getTime();
		System.out.println(d);
		Date d2=new Date(0);
		c1.setTime(d2);
		System.out.println(c1);

	}

}
