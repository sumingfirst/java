package ͬ��;
//������ص�֪ʶ
import java.awt.GradientPaint;
public class Interactive1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		final Hero1 gareen = new Hero1();
        gareen.name = "����";
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
        		//ͨ��wait��notiy���Բ���whileѭ�����ж�
        			
        			
        			
        			gareen.hurt();
        			  System.out.printf("t1 Ϊ%s ��Ѫ1��,����Ѫ��%s��Ѫ����%.0f%n",gareen.name,gareen.name,gareen.hp);
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
           			  System.out.printf("t2 Ϊ%s ��Ѫ1��,����Ѫ��%s��Ѫ����%.0f%n",gareen.name,gareen.name,gareen.hp);
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
