package 训练与巩固;

public class Fish extends Anmial implements Pet {
	
	public void walk(int legs) {
		
		System.out.println("鱼没有腿也不能走路");
	}

	@Override
	public String getName() {
		// TODO 自动生成的方法存根
		System.out.println("这是鱼的名字"+name);
		return name;
	}

	@Override
	public void setname(String name) {
		// TODO 自动生成的方法存根

		this.name=name;
		System.out.println("鱼取名为"+this.name);
		
		
	}
		

	@Override
	public void play() {
		System.out.println("这是鱼在游泳");
		
	}

	@Override
	public void eat() {
		System.out.println("这是鱼在吃东西");
		
	}
	public Fish()
	{
		System.out.println("这是鱼的无参构造方法");
		}

}
