package 同步;
import 多线程.Hero;
import java.awt.GradientPaint;
public class DealWithProcess {

	public static void main(String[] args) {
		final Object o1=new Object();
		final Hero gareen=new Hero();
		gareen.name="盖伦";
		gareen.hp=10000;
		int n=10000;
		Thread []addThread=new Thread[n];
		Thread[] reduceThread=new Thread[n];
		for(int i=0;i<n;i++)
		{
			Thread t=new Thread()
			{
				public void run()
				{//任何线程想要修改hp的值需要先占有o1线程
				/*	 
					synchronized(o1)
					{
						gareen.recover();
					}*/
					//在方法前加上synchornized也可以达到这个效果
					
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
				{//任何线程想要修改hp的值需要先占有o1线程
					 
			/*	synchronized (o1) 
					{
						gareen.hurt();
					}*/
					//通过在Hero中的方法中使用了synchornized所以可以直接使用
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
	System.out.printf("在增加%d个线程，减少%d个线程后，%s的血量减少为%f",n,n,gareen.name,gareen.hp);
		
		
		
		
		
		
	}

}
