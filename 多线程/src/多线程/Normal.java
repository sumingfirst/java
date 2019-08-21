package 多线程;

public class Normal {
	public static void main(String[] args) {
		Hero garren=new Hero();
		garren.name="盖伦";
		garren.hp=888;
		garren.demage=49;
		Hero teemo=new Hero();
		teemo.name="提莫";
		teemo.hp=678;
		teemo.demage=72;
		Hero bh=new Hero();
		bh.name="赏金猎人";
		bh.demage=81;
		bh.hp=640;
		Hero leesin=new Hero();
		leesin.name="盲僧";
		leesin.demage=55;
		leesin.hp=1024;
		
		Thread t1=new Thread(){
			public void run()
			{
				while(!teemo.IsDead())
				{
					garren.attackHero(teemo);
				}
			}
		};
		t1.start();
		//所有的线程中一直有一个线程叫做主线程
		//执行join方法可以加入主线程中
		//d代码运行到这里一直是main线程在运动
		try{
			t1.join();//t1加入了main线程，只有t1线程运行完毕，主线程才会往后走
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		//下面是当前线程暂停sleep
		Thread t2=new Thread()
				{
			public void run() {
			
				while(!leesin.IsDead())
				{
					
					bh.attackHero(leesin);
				}
			}
			
				};
				t2.start();
				Thread t3=new Thread()
						{
					
					public void run()
					{int second=0;
					while(true)
					{
						try
						{
							Thread.sleep( 1000);//只会暂停当前的线程，其他线程不受影响
						}
						catch(InterruptedException e)//当线程出现了中断异常的时候，有可能被停止就会抛出异常
						{
							e.printStackTrace();
						}
						System.out.printf("已经玩了LOL%d秒%n",second++);
						
					}
						
					}
						};
						t3.start();
						t3.setDaemon(true);//当线程中只剩下守护线程时就会自动结束，守护线程主要用于做日志，性能统计
						//守护线程
				
				
					

	}

}
