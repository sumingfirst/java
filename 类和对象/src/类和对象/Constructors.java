package 类和对象;
//构造方法的寻找
public class Constructors {
	String name;
	float hp;
	float armor;
	int speed;
	public Constructors()//构造器
	{
		System.out.println("实例化一个对象必然发生的方法");
	}
	public Constructors(String Heroname)//重载构造器
	{
		name=Heroname;
		System.out.println(name);
	}
	public Constructors(String Heroname,float HeroHp,float HeroArmor,int HeroSpeed)//重载构造器
	{
		name=Heroname;
		hp=HeroHp;
		armor=HeroArmor;
		speed=HeroSpeed;
		System.out.println(name);
		System.out.println(hp);
		System.out.println(armor);
		System.out.println(speed);
	}


	public static void main(String[] args) {
		
		Constructors Hero=new Constructors("盖伦");
		Constructors Hero2=new Constructors("锐雯",800,180,14);
		
		
	}

}
