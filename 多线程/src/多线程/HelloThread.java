package 多线程;

public class HelloThread {

	public static void main(String[] args) {
		Hero garren=new Hero();
		garren.name="盖伦";
		garren.hp=888;
		garren.demage=49;
		Hero teemo=new Hero();
		teemo.name="提莫";
		teemo.hp=67800;
		teemo.demage=72;
		Hero bh=new Hero();
		bh.name="赏金猎人";
		bh.demage=81;
		bh.hp=640;
		Hero leesin=new Hero();
		leesin.name="盲僧";
		leesin.demage=55;
		leesin.hp=102400;
		/*
		//盖伦攻击提莫
		while(!teemo.IsDead())
		{
			garren.attackHero(teemo);
		}
		//赏金猎人攻击盲僧
		while(!leesin.IsDead())
		{
			bh.attackHero(leesin);
		}*/
		//这是非多线程的方式一次只能够进行一个事情，下面开始使用多线程的方法来同时进行多个
		/*KIllThread kt1=new KIllThread(garren, teemo);
		kt1.start();
		KIllThread kt2=new KIllThread(bh, leesin);
		kt2.start();*/
		//这是第一种创建多线程的方式，继承Thread类
		//下面的是第二种实现Runnable接口的方式
		Battle b1=new Battle(garren, teemo);
		new Thread(b1).start();
		Battle b2=new Battle(bh, leesin);
		new Thread(b2).start();
		//第三种方法就是使用匿名类来启动多线程
		//在jdk以前要在内部使用局部变量需要定义为final但jdk1.7以后则不需要了
		Thread t1=new Thread(){
			public void run()
			{
				while(!teemo.IsDead())
				{	Thread.yield();
					garren.attackHero(teemo);
				}
			}
		};
		//t1.start();
		Thread t2=new Thread()
				{
			public void run() {
				while(!leesin.IsDead())
				{
					//这一个是临时暂停
				
					bh.attackHero(leesin);
				}
			}
			
				};
			//	t2.start();
				//下面是线程优先级的知识
			t1.setPriority(Thread.MAX_PRIORITY);	
			t2.setPriority(Thread.MIN_PRIORITY);
			t1.start();
			t2.start();
			//如果需要测试，需要把血量加到很大攻击降到很低才可以看到

	}

}
