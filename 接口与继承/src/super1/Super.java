package super1;
import 重写.Item1;
public class Super {
	
	String name;
	int speed;
	float armor;
	float hp;
	//super的显示构造方法
	//故意不提供父类的构造方法：去掉下一行代码 
	public Super()
	{
		System.out.println("Super 的构造方法");
	}
//父类提供两个构造方法
	public Super(String name)
	{
		System.out.println("有一个参数的构造方法");
		this.name=name;
		System.out.println(this.name);
	}
	public void useitem(Super i)
	{
		System.out.println(i+"通过父类调用的使用物品方法");
	}
	
	public static void main(String[] args) {
	new Super();
	new Super("jack");	

	}

}
