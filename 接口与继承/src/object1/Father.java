package object1;
import ��д.Item1;
public class Father extends Object {
	String name;
	int speed;
	float hp;
	float armro;
	float price;
	//������������ת����string�ķ���
	public String toString()
	{
		return name;
	}
	public void fianlize()//��������ʹ�õ�
	{
		System.out.println("���Ӣ�����ڱ�����");
	}
	public boolean equals(Object o)
	{
		if(o instanceof Father)
		{
			Father f=(Father) o;
			return this.hp==f.hp;
		}
		return false;
		
	}
	public static void main(String[] args) {
		Father father=new Father();
		father.name="����";
		Father f1=new Father();
		Father f2=new Father();
		Father f3=new Father();
		f1.hp=200;
		f2.hp=200;
		f3.hp=300;
		f1.fianlize();
		//equals�����Ƿ����
		System.out.println(f1.equals(f2));
		System.out.println(f1.equals(f3));
		System.out.println(f1.equals(father));
		//==�Ƕ����Ƿ����
		System.out.println(f1==f2);
		System.out.println(f1==f3);
		System.out.println(f1==father);
		/*
		System.out.println(father.toString());
		//ֱ�Ӵ�ӡ���Ƿ���ֵ
		System.out.println(father);
		Father j;
		for(long  i=0;i<100000000;i++)
		{
			for(int t=0;t<1000000;t++)
			{
				for(int m=0;m<1000000;m++)
				{
					j=new Father();
					
				}
		
			}
		}*/
	

	}

}
