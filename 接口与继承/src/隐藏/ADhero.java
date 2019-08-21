package 隐藏;

import 多态.Mortal;
import 接口与继承.AD;

public class ADhero extends Hero implements AD{
//隐藏父类方法的battle方法
	public static void battlewin()
	{
		System.out.println("这是重写后的类型");
	}
	public static void main(String[] args) {
		Hero.battlewin();
		ADhero.battlewin();
		
		
		//定义一个关于adhero的引用指向重写的对象
		ADhero ad=new ADhero();
		ad.battlewin();
		//定义一个关于hero的引用依然指向hero
				Hero h=new Hero();
				h.battlewin();
		

	}


	@Override
	public void PhysicalAttackMethod() {
		System.out.println("进行物理攻击");
		
	}
	

}
