package ��Ͷ���;

public class Support extends Hero{
	void heal()
	{
		System.out.println(name+"��ȷ��Ϊ˭����Ѫ");
	}
	void heal(Hero h1)
	{
		System.out.println(name+"Ϊ"+h1.name+"����Ѫ");
	}
	void heal(Hero h1,int hp)
	{
		System.out.println(name+"Ϊ"+h1.name+"����"+hp+"Ѫ");
	}

	public static void main(String[] args) {
		Support h2=new Support();
		
		Hero h1=new Hero();
		h1.name="����";
		h2.name="������ʦ";
		h2.heal();
		h2.heal(h1);
		h2.heal(h1, 30);
	}

}
