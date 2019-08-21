package 抽象类;

public class Armor  extends Item{

	public boolean disposonable()
	{
		System.out.println("铠甲使用后不会消失");
		return true;
		
	}
}
