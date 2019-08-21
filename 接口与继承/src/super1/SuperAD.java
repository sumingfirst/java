package super1;
//实例化子类其父类的构造方法也一定会被使用
public class SuperAD extends Super{
	public SuperAD()//没有父类的构造方法子类的构造方法会报错
	{
		System.out.println("ADsuper的构造方法");
	}
	public SuperAD(String name)
	{
		super (name);//使用super显示调用super父类带参的构造方法
		System.out.println("ADsuper的含参构造方法");
	}
	//调用父类属性
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
			System.out.println(i+"通过子类调用的使用物品方法");
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
