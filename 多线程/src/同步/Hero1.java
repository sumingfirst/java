package ͬ��;

public class Hero1 {

public String name;
public float hp;
public int damage;
public synchronized void recover()
{
	hp+=1;
	System.out.printf("%s��Ѫһ��,��Ѫ��%s��Ѫ����%f",name,name,hp);
	this.notify();
}
public synchronized void hurt()
{
	if(hp==1)
	{
		try{
			this.wait();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	hp-=1;
	System.out.printf("%s ��Ѫ1��,����Ѫ��%s��Ѫ����%.0f%n", name, name, hp);
	
	
}

public void attackHero(Hero1 h) {
    h.hp-=damage;
    System.out.format("%s ���ڹ��� %s, %s��Ѫ����� %.0f%n",name,h.name,h.name,h.hp);
    if(h.isDead())
        System.out.println(h.name +"���ˣ�");
}
public Boolean isDead()
{
	return hp<=0?true:false;
}
}
