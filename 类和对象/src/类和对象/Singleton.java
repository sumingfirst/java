package ��Ͷ���;
//����ģʽ����ģʽ
public class Singleton {
	//˽�л����췽��ʹ�����޷����ⲿͨ��newʵ��
	private  Singleton()
	{
		
	}//׼��һ�������ԣ�ʹ֮һ��ʵ����������Ϊ��������ֻ����һ��
	private static Singleton instance =new Singleton();
	public static Singleton getinstance()
	{
		return  instance;//����ģʽ������
		
	}
}
