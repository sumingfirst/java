package 同步;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public class JavaThreradPool {

	public static void main(String[] args)throws InterruptedException {
		// TODO 自动生成的方法存根
		ThreadPoolExecutor tp=new ThreadPoolExecutor(10, 15, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
		tp.execute(new Runnable()
				{

					@Override
					public void run() {
						System.out.println("任务1");
						
					}	
			
				}
				
				);
		
		
	}

}
