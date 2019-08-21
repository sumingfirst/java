package 训练与巩固;

public abstract class Anmial {
	String name;
	protected int legs;
	public abstract void eat();
	public void walk( int legs)
	{
		this.legs=legs;
		System.out.println("这个动物有"+this.legs+"条腿");
	}
	public Anmial()//构造器不是使用class修饰而是通过pubic之类的限制修饰符
	{
		
	}
	public Anmial(int legs)//构造器不是使用class修饰而是通过pubic之类的限制修饰符
	{
		this.legs=legs;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
Spider s1=new Spider(8);
s1.name="The big spider";
s1.eat();
s1.walk(8);
Cat c1=new Cat();
c1.eat();
c1.walk(4);
c1.setname("加菲猫");
c1.getName();

c1.play();
Fish f1=new Fish();
f1.eat();
f1.walk(0);
f1.setname("小鲤鱼");
f1.getName();

f1.play();
			
		

	}

}
