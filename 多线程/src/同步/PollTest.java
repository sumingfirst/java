package 同步;

public class PollTest {

	public static void main(String[] args) {
		ThreadPool tp=new ThreadPool();
		for(int i=0;i<5;i++)
		{
			Runnable task=new Runnable()
					{

						@Override
						public void run() {
							// TODO 自动生成的方法存根
							System.out.println("实现任务");
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
//测试线程池
		int sleep=1000;
		   while(true){
	            tp.add(new Runnable(){
	                @Override
	                public void run() {
	                    //System.out.println("执行任务");
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
