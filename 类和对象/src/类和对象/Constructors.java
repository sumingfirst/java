package ��Ͷ���;
//���췽����Ѱ��
public class Constructors {
	String name;
	float hp;
	float armor;
	int speed;
	public Constructors()//������
	{
		System.out.println("ʵ����һ�������Ȼ�����ķ���");
	}
	public Constructors(String Heroname)//���ع�����
	{
		name=Heroname;
		System.out.println(name);
	}
	public Constructors(String Heroname,float HeroHp,float HeroArmor,int HeroSpeed)//���ع�����
	{
		name=Heroname;
		hp=HeroHp;
		armor=HeroArmor;
		speed=HeroSpeed;
		System.out.println(name);
		System.out.println(hp);
		System.out.println(armor);
		System.out.println(speed);
	}


	public static void main(String[] args) {
		
		Constructors Hero=new Constructors("����");
		Constructors Hero2=new Constructors("����",800,180,14);
		
		
	}

}
