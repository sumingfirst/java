package ���߳�;

public class HelloThread {

	public static void main(String[] args) {
		Hero garren=new Hero();
		garren.name="����";
		garren.hp=888;
		garren.demage=49;
		Hero teemo=new Hero();
		teemo.name="��Ī";
		teemo.hp=67800;
		teemo.demage=72;
		Hero bh=new Hero();
		bh.name="�ͽ�����";
		bh.demage=81;
		bh.hp=640;
		Hero leesin=new Hero();
		leesin.name="äɮ";
		leesin.demage=55;
		leesin.hp=102400;
		/*
		//���׹�����Ī
		while(!teemo.IsDead())
		{
			garren.attackHero(teemo);
		}
		//�ͽ����˹���äɮ
		while(!leesin.IsDead())
		{
			bh.attackHero(leesin);
		}*/
		//���ǷǶ��̵߳ķ�ʽһ��ֻ�ܹ�����һ�����飬���濪ʼʹ�ö��̵߳ķ�����ͬʱ���ж��
		/*KIllThread kt1=new KIllThread(garren, teemo);
		kt1.start();
		KIllThread kt2=new KIllThread(bh, leesin);
		kt2.start();*/
		//���ǵ�һ�ִ������̵߳ķ�ʽ���̳�Thread��
		//������ǵڶ���ʵ��Runnable�ӿڵķ�ʽ
		Battle b1=new Battle(garren, teemo);
		new Thread(b1).start();
		Battle b2=new Battle(bh, leesin);
		new Thread(b2).start();
		//�����ַ�������ʹ�����������������߳�
		//��jdk��ǰҪ���ڲ�ʹ�þֲ�������Ҫ����Ϊfinal��jdk1.7�Ժ�����Ҫ��
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
					//��һ������ʱ��ͣ
				
					bh.attackHero(leesin);
				}
			}
			
				};
			//	t2.start();
				//�������߳����ȼ���֪ʶ
			t1.setPriority(Thread.MAX_PRIORITY);	
			t2.setPriority(Thread.MIN_PRIORITY);
			t1.start();
			t2.start();
			//�����Ҫ���ԣ���Ҫ��Ѫ���ӵ��ܴ󹥻������ܵͲſ��Կ���

	}

}
