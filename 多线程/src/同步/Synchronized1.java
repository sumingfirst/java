package ͬ��;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
public class Synchronized1 {
public static String now()
{
	return new SimpleDateFormat("HH:mm:ss").format(new Date());
}
	public static void main(String[] args) {
		final Object o1=new Object();
		Thread t1=new Thread(){
			public void run()
			{
				try{
					System.out.println(now()+"�߳�1�Ѿ�����");
					System.out.println(now()+this.getName()+"��ͼռ�ж���someObject");
					synchronized (o1) {
						System.out.println(now()+this.getName()+"ռ�ж���someObject");
						Thread.sleep(5000);
						System.out.println(now()+this.getName()+"�ͷŶ���someObject");
					}
					System.out.println(now()+"�߳̽���");
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		};
		t1.setName("t1");
		t1.start();
		Thread t2=new Thread(){
			public void run()
			{
				try{
					System.out.println(now()+"�߳�2�Ѿ�����");
					System.out.println(now()+this.getName()+"��ͼռ�ж���someObject");
					synchronized (o1) {
						System.out.println(now()+this.getName()+"ռ�ж���someObject");
						Thread.sleep(5000);
						System.out.println(now()+this.getName()+"�ͷŶ���someObject");
					}
					System.out.println(now()+"�߳̽���");
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		};
		t2.setName("t2");
		t2.start();
//ͨ��Synchronized����ռ��ǰ���̣߳�����������ֻ�е����̵߳�������ɲſ��Խ��뵽��һ�߳���
		
		
		
		
	}


}
