package ѵ���빮��;

public abstract class Anmial {
	String name;
	protected int legs;
	public abstract void eat();
	public void walk( int legs)
	{
		this.legs=legs;
		System.out.println("���������"+this.legs+"����");
	}
	public Anmial()//����������ʹ��class���ζ���ͨ��pubic֮����������η�
	{
		
	}
	public Anmial(int legs)//����������ʹ��class���ζ���ͨ��pubic֮����������η�
	{
		this.legs=legs;
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
Spider s1=new Spider(8);
s1.name="The big spider";
s1.eat();
s1.walk(8);
Cat c1=new Cat();
c1.eat();
c1.walk(4);
c1.setname("�ӷ�è");
c1.getName();

c1.play();
Fish f1=new Fish();
f1.eat();
f1.walk(0);
f1.setname("С����");
f1.getName();

f1.play();
			
		

	}

}
