package 类和对象;

public class Support extends Hero{
	void heal()
	{
		System.out.println(name+"不确定为谁加了血");
	}
	void heal(Hero h1)
	{
		System.out.println(name+"为"+h1.name+"加了血");
	}
	void heal(Hero h1,int hp)
	{
		System.out.println(name+"为"+h1.name+"加了"+hp+"血");
	}

	public static void main(String[] args) {
		Support h2=new Support();
		
		Hero h1=new Hero();
		h1.name="锐雯";
		h2.name="法术大师";
		h2.heal();
		h2.heal(h1);
		h2.heal(h1, 30);
	}

}
