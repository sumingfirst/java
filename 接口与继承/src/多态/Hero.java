package 多态;

import javax.swing.Spring;

public class Hero {
	String name;
	int speed;
	float hp;
	float Armor;
	public	void kill(Mortal m,Mortal n,Mortal t)
	{
		System.out.println("盖伦击杀了：");
		//通过接口调用函数
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
