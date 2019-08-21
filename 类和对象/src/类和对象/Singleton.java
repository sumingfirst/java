package 类和对象;
//单例模式饿汉模式
public class Singleton {
	//私有化构造方法使该类无法在外部通过new实现
	private  Singleton()
	{
		
	}//准备一个类属性，使之一个实例化对象。因为是类属性只能有一个
	private static Singleton instance =new Singleton();
	public static Singleton getinstance()
	{
		return  instance;//饿汉模式的特征
		
	}
}
