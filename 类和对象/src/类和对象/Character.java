package ��Ͷ���;

public class Character {

	public static void main(String[] args) {
		//Singleton g=new Singleton();ֱ�ӹ��캯���ķ���������
		Singleton s1=Singleton.getinstance();
		Singleton s2=Singleton.getinstance();
		Singleton s3=Singleton.getinstance();
		System.out.println(s1==s2);
		System.out.println(s3==s2);
		//����ģʽ�ĵ����Ĳ���
		//Singleton g=new Singleton();ֱ�ӹ��캯���ķ���������
				Singleton2 s4=Singleton2.getInstance();
				Singleton2 s5=Singleton2.getInstance();
				Singleton2 s6=Singleton2.getInstance();
				System.out.println(s4==s5);
				System.out.println(s4==s6);
	}

}
