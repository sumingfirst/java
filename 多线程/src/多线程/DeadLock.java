package 多线程;

public class DeadLock {
//死锁相关的知识 
	public static void main(String[] args) {
	final Hero arhi=new Hero();
	arhi.name="九尾妖狐";
	final Hero annie=new Hero();
	annie.name="安妮";
	Thread t1=new Thread()
			{
		public void run()
		{
			//占有九尾妖狐
			synchronized (arhi) {
				System.out.println("已经占有了九尾妖狐");
			}
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("t1试图占有安妮，t1等待中");
			synchronized(annie)
			{
				System.out.println("t1成功占有安妮");
			}
		}
			};
			t1.start();
			Thread t2=new Thread(){
				
				public void run()
				{
					synchronized (annie) {
						System.out.println("已经占有了安妮");	
					}
					try{
						Thread.sleep(1000);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
					System.out.println("t2试图占有九尾妖狐，t2等待中");
					synchronized (arhi) {
						System.out.println("t2成功占有九尾妖狐");
					}
				}
			};
			t2.start();
	}

}
