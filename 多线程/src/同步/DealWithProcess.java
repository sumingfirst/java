package ͬ��;
import ���߳�.Hero;
import java.awt.GradientPaint;
public class DealWithProcess {

	public static void main(String[] args) {
		final Object o1=new Object();
		final Hero gareen=new Hero();
		gareen.name="����";
		gareen.hp=10000;
		int n=10000;
		Thread []addThread=new Thread[n];
		Thread[] reduceThread=new Thread[n];
		for(int i=0;i<n;i++)
		{
			Thread t=new Thread()
			{
				public void run()
				{//�κ��߳���Ҫ�޸�hp��ֵ��Ҫ��ռ��o1�߳�
				/*	 
					synchronized(o1)
					{
						gareen.recover();
					}*/
					//�ڷ���ǰ����synchornizedҲ���Դﵽ���Ч��
					
					gareen.recover();
				try{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				}
					};
					t.start();
					addThread[i]=t;
		}
		
		
		for(int i=0;i<n;i++)
		{
			Thread t=new Thread()
			{
				public void run()
				{//�κ��߳���Ҫ�޸�hp��ֵ��Ҫ��ռ��o1�߳�
					 
			/*	synchronized (o1) 
					{
						gareen.hurt();
					}*/
					//ͨ����Hero�еķ�����ʹ����synchornized���Կ���ֱ��ʹ��
					gareen.hurt();
					
					
				try{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				}
					};
					t.start();
					reduceThread[i]=t;
		}
		for(Thread t:addThread)
		{
			try{
				t.join();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		for(Thread t:reduceThread)
		{
			try{
				t.join();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	System.out.printf("������%d���̣߳�����%d���̺߳�%s��Ѫ������Ϊ%f",n,n,gareen.name,gareen.hp);
		
		
		
		
		
		
	}

}
