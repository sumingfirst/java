package ��̬;

import javax.swing.Spring;

public class Hero {
	String name;
	int speed;
	float hp;
	float Armor;
	public	void kill(Mortal m,Mortal n,Mortal t)
	{
		System.out.println("���׻�ɱ�ˣ�");
		//ͨ���ӿڵ��ú���
		m.die();
		n.die();
		t.die();
		
	}
	

	public static void main(String[] args) {
		Hero gallen=new Hero();
		Aphero ap2=new Aphero();
		Adhero ad2=new Adhero();
		AdAphero adadp2=new AdAphero();
		gallen.kill(ap2,ad2,adadp2);
		

	}

}
