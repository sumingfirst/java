package ��Ͷ���;

public class Class {
	public String name;//ʵ�����ԣ��Ǿ�̬���ԣ���������
	protected float hp;
	static String copyright;//������
	public static void battle()
	{
		System.out.println("�Ҵ������");
	}
	
	
	
	public static void main(String[] args) {
		Class.copyright="ʤ�����Ŵ󷢹�˾";
		System.out.println(Class.copyright);
		Class.copyright="���ϰ����ϰ�";
		System.out.println(Class.copyright);
		Class.battle();
		

	}

}
