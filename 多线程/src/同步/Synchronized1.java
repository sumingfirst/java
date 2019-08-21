package 同步;
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
					System.out.println(now()+"线程1已经运行");
					System.out.println(now()+this.getName()+"试图占有对象：someObject");
					synchronized (o1) {
						System.out.println(now()+this.getName()+"占有对象：someObject");
						Thread.sleep(5000);
						System.out.println(now()+this.getName()+"释放对象：someObject");
					}
					System.out.println(now()+"线程结束");
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
					System.out.println(now()+"线程2已经运行");
					System.out.println(now()+this.getName()+"试图占有对象：someObject");
					synchronized (o1) {
						System.out.println(now()+this.getName()+"占有对象：someObject");
						Thread.sleep(5000);
						System.out.println(now()+this.getName()+"释放对象：someObject");
					}
					System.out.println(now()+"线程结束");
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		};
		t2.setName("t2");
		t2.start();
//通过Synchronized来独占当前的线程，在其修饰下只有当本线程的任务完成才可以进入到下一线程中
		
		
		
		
	}


}
