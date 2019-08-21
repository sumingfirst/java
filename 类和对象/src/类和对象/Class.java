package 类和对象;

public class Class {
	public String name;//实例属性，非静态属性，对象属性
	protected float hp;
	static String copyright;//类属性
	public static void battle()
	{
		System.out.println("我打败了你");
	}
	
	
	
	public static void main(String[] args) {
		Class.copyright="胜利集团大发公司";
		System.out.println(Class.copyright);
		Class.copyright="李老板王老板";
		System.out.println(Class.copyright);
		Class.battle();
		

	}

}
