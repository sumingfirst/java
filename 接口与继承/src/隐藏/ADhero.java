package ����;

import ��̬.Mortal;
import �ӿ���̳�.AD;

public class ADhero extends Hero implements AD{
//���ظ��෽����battle����
	public static void battlewin()
	{
		System.out.println("������д�������");
	}
	public static void main(String[] args) {
		Hero.battlewin();
		ADhero.battlewin();
		
		
		//����һ������adhero������ָ����д�Ķ���
		ADhero ad=new ADhero();
		ad.battlewin();
		//����һ������hero��������Ȼָ��hero
				Hero h=new Hero();
				h.battlewin();
		

	}


	@Override
	public void PhysicalAttackMethod() {
		System.out.println("����������");
		
	}
	

}
