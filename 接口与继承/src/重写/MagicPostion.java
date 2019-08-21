package 重写;

public class MagicPostion extends Item1 {
	
	public void effect()
	{
		System.out.println("使用了魔瓶补充魔力");
	}
	public static void main(String[] args) {
		
	MagicPostion m1=new MagicPostion();
	m1.buy();
	m1.effect();
	}

}
