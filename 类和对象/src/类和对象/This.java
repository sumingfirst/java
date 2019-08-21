package 类和对象;
//对于this使用的训练
public class This {
	String name;
	float hp;
	float armor;
	int speed;

	
	public void showAddressINmemory()
	{
		System.out.println("这个对象在文件中的地址是"+this);
	}
//通过this访问属性
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
	//this调用其他的构造方法
	public void This(String name)
	{
		System.out.println("一个参数的构造方法");
		this.name=name;
		System.out.println(this.name);
	}
	public void This(String name,float hp)
	{
	
		System.out.println("二个参数的构造方法");
		this.hp=hp;
		System.out.println(this.hp);
		
	}
	public static void main(String[] args) {
		
		This hero1=new This();
		This hero2=new This();
		hero1.name="盖伦";
		hero2.name="锐雯";
		hero1.showAddressINmemory();
		hero2.showAddressINmemory();
		hero1.setname1("牛头");
		hero1.setname2("斧王");
		hero1.setname3("撒谎");
		
		
	}

}
