package ͬ��;

import java.util.LinkedList;

public class ThreadPool {
	//�̳߳ش�С
	int ThreadPoolSize=0;
	//��������
	LinkedList<Runnable>tasks=new LinkedList<Runnable>();
	//��ͼ���ѵ������߳�
	public ThreadPool(){
		ThreadPoolSize=10;
		//����10�����������������߳�
		synchronized (tasks) {
			for(int i=0;i<ThreadPoolSize;i++)
			{
				new TaskConsumeThread("�����������߳�"+i).start();
				
			}
		}
	}
	public void add(Runnable r)
	{
		synchronized (tasks) {
			tasks.add(r);
			//���ѵȴ�������������߳�
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
			System.out.println("������ " + this.getName());
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
					//�������������̼߳����������
					tasks.notifyAll();
					
				}
				System.out.println(this.getName() + " ��ȡ�����񣬲�ִ��");
                task.run();
			}
		}
	}
	
}
