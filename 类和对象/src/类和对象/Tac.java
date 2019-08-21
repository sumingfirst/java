package 类和对象;
//this调用其他构造方法
public class Tac {
	String name;
	float hp;
	float armor;
	int speed;
	public Tac(String name,float hp)
	{
		this.name=name;
		this.hp=hp;
		System.out.println("姓名是"+this.name+"血量是"+this.hp);
		System.out.println("这是第一个构造器");
	}
	public Tac(String name,float hp,int speed,float armor)
	{
		this(name,hp);
		this.armor=armor;
		this.speed=speed;
		
		System.out.println("防御是"+this.armor+"速度是"+this.speed);
		System.out.println("这是第二个构造器");
	}
	public static void main(String[] args) {
		Tac hero1=new Tac("提莫",1);
		Tac hero2=new Tac("盖伦",2,3,4);
		

	}

}
