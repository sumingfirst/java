/**
 * 
 */
package ��Ͷ���;

/**
 * ���ݲ�������ϰ
 *
 */
public class Recovery {
	String name;
	float hp;
	float armor;
	int speed;
	public Recovery()
	{
		
	}
	public void recov(int xp)
	{
		hp+=xp;
		xp=0;
		//����Ѫ��Ѫƿ��Ϊ0
	}
	public Recovery(String  name,float hp)
	{
		this.name=name;
		this.hp=hp;
		System.out.println(this.hp);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Recovery hero1=new Recovery("��Ī",123);
		int blood =80;
		hero1.recov(blood);
		System.out.println(blood);

	}

}
