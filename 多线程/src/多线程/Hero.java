package ���߳�;
import java.io.Serializable;
public class Hero {
public String name;
public float hp;
public int demage;
//ֱ�Ӽ���synchronizedЧ�����ڷ����ڲ�����synchornized thisһ��
public  synchronized void recover()
{
	hp+=1;
}
/*

public void recover()
{
	hp+=1;
}
public void hurt()
{
	hp-=1;
}*/
//ʹ��Hero��Ϊͬ������
public void hurt()
{
	synchronized (this) {
		hp-=1;
		
	}
}
public void attackHero(Hero h)
{
	/*try
	{//ÿ�ι�����Ҫ����ʱ�䣬��ͣ1000����
		Thread.sleep(1000);
	}
	catch(InterruptedException e){
		e.printStackTrace();
	}*/
	//ͬ������
	
		h.hp-=demage;
		System.out.printf("%s�ڹ���%s,%s��Ѫ�������%f%n",name,h.name,h.name,h.hp);
		if(h.hp<0)
		{
			System.out.println(h.name+"����");
		}
	
	}
public Boolean IsDead()
{
	return hp<0? true :false;
}
}
