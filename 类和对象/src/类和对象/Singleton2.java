package ��Ͷ���;

public class Singleton2 {

		private Singleton2()
		{
			
		}
		public static  Singleton2 instance;//׼����һ��������
		public static Singleton2 getInstance()
		{
			if(null==instance)
			{
				instance=new Singleton2();
			}
			return instance;
		}
}
