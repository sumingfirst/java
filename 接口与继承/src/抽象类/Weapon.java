package 抽象类;

public class Weapon  extends Item{
	public boolean disposonable()
	{
		System.out.println("武器使用后不会消失");
		return true;
		
	}

}
