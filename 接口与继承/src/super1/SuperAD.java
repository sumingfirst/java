package super1;
//ʵ���������丸��Ĺ��췽��Ҳһ���ᱻʹ��
public class SuperAD extends Super{
	public SuperAD()//û�и���Ĺ��췽������Ĺ��췽���ᱨ��
	{
		System.out.println("ADsuper�Ĺ��췽��");
	}
	public SuperAD(String name)
	{
		super (name);//ʹ��super��ʾ����super������εĹ��췽��
		System.out.println("ADsuper�ĺ��ι��췽��");
	}
	//���ø�������
		public int getSpeed()
		{
			return this.speed;
		}
		public int getSpeed1()
		{
			return super.speed;
		}

		public void useitem(Super i)
		{
			System.out.println(i+"ͨ��������õ�ʹ����Ʒ����");
			super.useitem(i);
		}
	public static void main(String[] args) {
		new Super();
		new SuperAD();
		new SuperAD("tom");
		
		SuperAD sa1=new SuperAD();
		sa1.getSpeed();
		System.out.println(sa1.getSpeed());
		System.out.println(sa1.getSpeed1());
		sa1.useitem(sa1);

	}

}
