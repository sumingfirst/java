package ���߳�;

public class Normal {
	public static void main(String[] args) {
		Hero garren=new Hero();
		garren.name="����";
		garren.hp=888;
		garren.demage=49;
		Hero teemo=new Hero();
		teemo.name="��Ī";
		teemo.hp=678;
		teemo.demage=72;
		Hero bh=new Hero();
		bh.name="�ͽ�����";
		bh.demage=81;
		bh.hp=640;
		Hero leesin=new Hero();
		leesin.name="äɮ";
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
		//���е��߳���һֱ��һ���߳̽������߳�
		//ִ��join�������Լ������߳���
		//d�������е�����һֱ��main�߳����˶�
		try{
			t1.join();//t1������main�̣߳�ֻ��t1�߳�������ϣ����̲߳Ż�������
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		//�����ǵ�ǰ�߳���ͣsleep
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
							Thread.sleep( 1000);//ֻ����ͣ��ǰ���̣߳������̲߳���Ӱ��
						}
						catch(InterruptedException e)//���̳߳������ж��쳣��ʱ���п��ܱ�ֹͣ�ͻ��׳��쳣
						{
							e.printStackTrace();
						}
						System.out.printf("�Ѿ�����LOL%d��%n",second++);
						
					}
						
					}
						};
						t3.start();
						t3.setDaemon(true);//���߳���ֻʣ���ػ��߳�ʱ�ͻ��Զ��������ػ��߳���Ҫ��������־������ͳ��
						//�ػ��߳�
				
				
					

	}

}
