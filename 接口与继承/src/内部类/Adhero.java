package 内部类;

public abstract class Adhero {
	public String name;
	float hp;
	float armor;
	int speed;
	//定义匿名类抽象方法
public abstract void attack();
	public static void main(String[] argus){
		
	Adhero h=new Adhero(){
//当场实现attack方法
		@Override
		public void attack() {
			// TODO 自动生成的方法存根
			
		System.out.println("新的进攻方法");	
		
		}
	};
	h.attack();
	System.out.println(h);
	//本地类 与内部类的区别是本地类拥有名字
	final int damage=5;
	class aphero extends Adhero{
		
		int damage;

		public int Getdemage(int damage)
		{
			return this.damage=damage;
			
		}
		public aphero(int damage) {
			// TODO 自动生成的构造函数存根
			 damage=10;
			System.out.println("这是一个本地类"+this.damage);
		}
		
		@Override
		public void attack() {
			System.out.println("这是一个本地类"+this.damage);
			
		}
		
	}
	aphero a1=new aphero(5);
	a1.attack();
	//匿名类使用外部变量
	 //在匿名类中使用外部的局部变量，外部的局部变量必须修饰为final
	//注意jdk8中不在必须要加finall了因为编译器全自动帮你暗中添加了
	  //事实上的匿名类，会在匿名类里声明一个damage属性，并且使用构造方法初始化该属性的值
    //在attack中使用的damage，真正使用的是这个内部damage，而非外部damage
     
    //假设外部属性不需要声明为final
    //那么在attack中修改damage的值，就会被暗示为修改了外部变量damage的值
     
    //但是他们俩是不同的变量，是不可能修改外部变量damage的
    //所以为了避免产生误导，外部的damage必须声明为final,"看上去"就不能修改了
	
	}


}
