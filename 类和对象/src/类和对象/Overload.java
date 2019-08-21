package 类和对象;
//方法重载
public class Overload extends Hero{
	public void attack()
	{
		System.out.println(name+"进行了一次攻击但是不确定打中了谁");
	}
	public void attack(Hero h1)
	{
		System.out.println(name+"对"+h1.name+"进行了一次攻击");
		
	}
	public void attack(Hero h1,Hero h2)
	{
		System.out.println(name+"对"+h1.name+"和"+h2.name+"同时进行了攻击");
	}
	//可变数量的参数
	public void attack(Hero ...heros){
		for(int i=0;i<heros.length;i++)
		{
			System.out.println(name+"对"+heros[i].name+"发动了进攻");
		}
	}
	public static void main(String[] args) {
		Overload h3=new Overload();
		h3.name="赏金猎人";
		Hero h1=new Hero();
		Hero h2=new Hero();
		Hero h4=new Hero();
		h1.name="盖伦";
		h2.name="提莫";
		h4.name="锐雯";
		h3.attack();
		h3.attack(h1);
		h3.attack(h1, h2);
		h3.attack(h1,h2,h3,h4);
	}

}
