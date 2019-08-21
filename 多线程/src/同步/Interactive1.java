package 同步;
//交互相关的知识
import java.awt.GradientPaint;
public class Interactive1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		final Hero1 gareen = new Hero1();
        gareen.name = "盖伦";
        gareen.hp = 616;
        Thread t1=new Thread()
        		{
        	public void run()
        	{
        	while(true)
        		{
        			/*while(gareen.hp==1)
        			{
        				continue;
        			}*/
        		//通过wait和notiy可以不用while循环来判断
        			
        			
        			
        			gareen.hurt();
        			  System.out.printf("t1 为%s 减血1点,减少血后，%s的血量是%.0f%n",gareen.name,gareen.name,gareen.hp);
                      try {
                          Thread.sleep(10);
                      } catch (InterruptedException e) {
                          // TODO Auto-generated catch block
                          e.printStackTrace();
                      }
        		}
                }
        		};
        		t1.start();
        		
        		
        		
        		   Thread t2=new Thread()
           		{
           	public void run()
           	{
           		while(true)
           		{
           			
           			
           			
           			gareen.recover();
           			  System.out.printf("t2 为%s 回血1点,增加血后，%s的血量是%.0f%n",gareen.name,gareen.name,gareen.hp);
                         try {
                             Thread.sleep(100);
                         } catch (InterruptedException e) {
                             // TODO Auto-generated catch block
                             e.printStackTrace();
                         }
           		}
                   }
           		};
           		t2.start();
	}

}
