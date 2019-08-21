package 同步;

import java.util.LinkedList;

public class ThreadPool {
	//线程池大小
	int ThreadPoolSize=0;
	//任务容器
	LinkedList<Runnable>tasks=new LinkedList<Runnable>();
	//试图消费的任务线程
	public ThreadPool(){
		ThreadPoolSize=10;
		//启动10个任务消费者任务线程
		synchronized (tasks) {
			for(int i=0;i<ThreadPoolSize;i++)
			{
				new TaskConsumeThread("任务消费者线程"+i).start();
				
			}
		}
	}
	public void add(Runnable r)
	{
		synchronized (tasks) {
			tasks.add(r);
			//唤醒等待任务的消费者线程
			tasks.notifyAll();
			
		}
	}
	
	
	class TaskConsumeThread extends Thread {
		public TaskConsumeThread(String name)
		{
			super(name);
		}
		Runnable task;
		public void run()
		{
			System.out.println("启动： " + this.getName());
			while(true)
			{
				synchronized (tasks) {
					while(tasks.isEmpty())
					{
						try{
							tasks.wait();
						}
						catch(InterruptedException e)
						{
							e.printStackTrace();
						}
					}
					task=tasks.removeLast();
					//允许完成任务的线程继续添加任务
					tasks.notifyAll();
					
				}
				System.out.println(this.getName() + " 获取到任务，并执行");
                task.run();
			}
		}
	}
	
}
