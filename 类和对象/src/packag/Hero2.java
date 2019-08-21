package packag;
//饿汉式模式
public class Hero2 {
	private  Hero2()
	{
		//私有化构造器
	}
	public static Hero2 hero2=new Hero2();//将类属性指向一个实例化对象
	public static  Hero2 getinstance()
	{
		return hero2;
	}
	
}
