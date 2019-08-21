package object1;

public class Son extends Father{
	public String toString()
	{
		return name+price;
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
			return this.price==f.price;
		
			
		}
		return false;
		
	}

	public static void main(String[] args) {
		Son s1=new Son();
		Son s2=new Son();
		Son s3=new Son();
		s1.price=240;
		s2.price=420;
		s3.price=240;
		s1.name="关羽";
		System.out.println(s1.equals(s3));
		System.out.println(s1.toString());
		

	}

}
