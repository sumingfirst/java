package 重写;

public class Bllod extends Item1{

	 public void effect()
	{
		System.out.println("使用了血瓶");
	}
	public static void main(String[] args) {
		Bllod bllod=new Bllod();
		bllod.buy();
		bllod.effect();

	}

}
