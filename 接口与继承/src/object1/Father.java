package object1;
import 重写.Item1;
public class Father extends Object {
	String name;
	int speed;
	float hp;
	float armro;
	float price;
	//各种数据类型转换成string的方法
	public String toString()
	{
		return name;
	}
	public void fianlize()//垃圾回收使用的
	{
		System.out.println("这个英雄正在被回收");
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
		father.name="吕布";
		Father f1=new Father();
		Father f2=new Father();
		Father f3=new Father();
		f1.hp=200;
		f2.hp=200;
		f3.hp=300;
		f1.fianlize();
		//equals内容是否相等
		System.out.println(f1.equals(f2));
		System.out.println(f1.equals(f3));
		System.out.println(f1.equals(father));
		//==是对象是否相等
		System.out.println(f1==f2);
		System.out.println(f1==f3);
		System.out.println(f1==father);
		/*
		System.out.println(father.toString());
		//直接打印就是返回值
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
