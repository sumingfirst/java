package ��Ͷ���;
//��������
public class Overload extends Hero{
	public void attack()
	{
		System.out.println(name+"������һ�ι������ǲ�ȷ��������˭");
	}
	public void attack(Hero h1)
	{
		System.out.println(name+"��"+h1.name+"������һ�ι���");
		
	}
	public void attack(Hero h1,Hero h2)
	{
		System.out.println(name+"��"+h1.name+"��"+h2.name+"ͬʱ�����˹���");
	}
	//�ɱ������Ĳ���
	public void attack(Hero ...heros){
		for(int i=0;i<heros.length;i++)
		{
			System.out.println(name+"��"+heros[i].name+"�����˽���");
		}
	}
	public static void main(String[] args) {
		Overload h3=new Overload();
		h3.name="�ͽ�����";
		Hero h1=new Hero();
		Hero h2=new Hero();
		Hero h4=new Hero();
		h1.name="����";
		h2.name="��Ī";
		h4.name="����";
		h3.attack();
		h3.attack(h1);
		h3.attack(h1, h2);
		h3.attack(h1,h2,h3,h4);
	}

}
