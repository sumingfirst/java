package ���߳�;

public class DeadLock {
//������ص�֪ʶ 
	public static void main(String[] args) {
	final Hero arhi=new Hero();
	arhi.name="��β����";
	final Hero annie=new Hero();
	annie.name="����";
	Thread t1=new Thread()
			{
		public void run()
		{
			//ռ�о�β����
			synchronized (arhi) {
				System.out.println("�Ѿ�ռ���˾�β����");
			}
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("t1��ͼռ�а��ݣ�t1�ȴ���");
			synchronized(annie)
			{
				System.out.println("t1�ɹ�ռ�а���");
			}
		}
			};
			t1.start();
			Thread t2=new Thread(){
				
				public void run()
				{
					synchronized (annie) {
						System.out.println("�Ѿ�ռ���˰���");	
					}
					try{
						Thread.sleep(1000);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
					System.out.println("t2��ͼռ�о�β������t2�ȴ���");
					synchronized (arhi) {
						System.out.println("t2�ɹ�ռ�о�β����");
					}
				}
			};
			t2.start();
	}

}
