package 类和对象;

public class Singleton2 {

		private Singleton2()
		{
			
		}
		public static  Singleton2 instance;//准备了一个类属性
		public static Singleton2 getInstance()
		{
			if(null==instance)
			{
				instance=new Singleton2();
			}
			return instance;
		}
}
