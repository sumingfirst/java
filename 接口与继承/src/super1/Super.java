package super1;
import ��д.Item1;
public class Super {
	
	String name;
	int speed;
	float armor;
	float hp;
	//super����ʾ���췽��
	//���ⲻ�ṩ����Ĺ��췽����ȥ����һ�д��� 
	public Super()
	{
		System.out.println("Super �Ĺ��췽��");
	}
//�����ṩ�������췽��
	public Super(String name)
	{
		System.out.println("��һ�������Ĺ��췽��");
		this.name=name;
		System.out.println(this.name);
	}
	public void useitem(Super i)
	{
		System.out.println(i+"ͨ��������õ�ʹ����Ʒ����");
	}
	
	public static void main(String[] args) {
	new Super();
	new Super("jack");	

	}

}
