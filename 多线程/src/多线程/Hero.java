package 多线程;
import java.io.Serializable;
public class Hero {
public String name;
public float hp;
public int demage;
//直接加上synchronized效果和在方法内部加上synchornized this一样
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
//使用Hero作为同步对象
public void hurt()
{
	synchronized (this) {
		hp-=1;
		
	}
}
public void attackHero(Hero h)
{
	/*try
	{//每次攻击需要花费时间，暂停1000毫秒
		Thread.sleep(1000);
	}
	catch(InterruptedException e){
		e.printStackTrace();
	}*/
	//同步问题
	
		h.hp-=demage;
		System.out.printf("%s在攻击%s,%s的血量变成了%f%n",name,h.name,h.name,h.hp);
		if(h.hp<0)
		{
			System.out.println(h.name+"死了");
		}
	
	}
public Boolean IsDead()
{
	return hp<0? true :false;
}
}
