package ͬ��;

public class PollTest {

	public static void main(String[] args) {
		ThreadPool tp=new ThreadPool();
		for(int i=0;i<5;i++)
		{
			Runnable task=new Runnable()
					{

						@Override
						public void run() {
							// TODO �Զ����ɵķ������
							System.out.println("ʵ������");
						}
				
					};
					tp.add(task);
					try{
						Thread.sleep(1000);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
		}
//�����̳߳�
		int sleep=1000;
		   while(true){
	            tp.add(new Runnable(){
	                @Override
	                public void run() {
	                    //System.out.println("ִ������");
	                    try {
	                        Thread.sleep(1000);
	                    } catch (InterruptedException e) {
	                        // TODO Auto-generated catch block
	                        e.printStackTrace();
	                    }
	                }
	            });
	            try {
	                Thread.sleep(sleep);
	                sleep = sleep>100?sleep-100:sleep;
	            } catch (InterruptedException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
		   }
	}

}
