package ��Ͷ���;
//this�����������췽��
public class Tac {
	String name;
	float hp;
	float armor;
	int speed;
	public Tac(String name,float hp)
	{
		this.name=name;
		this.hp=hp;
		System.out.println("������"+this.name+"Ѫ����"+this.hp);
		System.out.println("���ǵ�һ��������");
	}
	public Tac(String name,float hp,int speed,float armor)
	{
		this(name,hp);
		this.armor=armor;
		this.speed=speed;
		
		System.out.println("������"+this.armor+"�ٶ���"+this.speed);
		System.out.println("���ǵڶ���������");
	}
	public static void main(String[] args) {
		Tac hero1=new Tac("��Ī",1);
		Tac hero2=new Tac("����",2,3,4);
		

	}

}
