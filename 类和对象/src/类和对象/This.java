package ��Ͷ���;
//����thisʹ�õ�ѵ��
public class This {
	String name;
	float hp;
	float armor;
	int speed;

	
	public void showAddressINmemory()
	{
		System.out.println("����������ļ��еĵ�ַ��"+this);
	}
//ͨ��this��������
	public void setname1(String name)
	{
		this.name=name;
		System.out.println(this.name);
	}
	public void setname2(String Heroname)
	{
		name=Heroname;
		System.out.println(this.name);
	}
	public void setname3(String name)
	{
		name=name;
		System.out.println(name);
	}
	//this���������Ĺ��췽��
	public void This(String name)
	{
		System.out.println("һ�������Ĺ��췽��");
		this.name=name;
		System.out.println(this.name);
	}
	public void This(String name,float hp)
	{
	
		System.out.println("���������Ĺ��췽��");
		this.hp=hp;
		System.out.println(this.hp);
		
	}
	public static void main(String[] args) {
		
		This hero1=new This();
		This hero2=new This();
		hero1.name="����";
		hero2.name="����";
		hero1.showAddressINmemory();
		hero2.showAddressINmemory();
		hero1.setname1("ţͷ");
		hero1.setname2("����");
		hero1.setname3("����");
		
		
	}

}
