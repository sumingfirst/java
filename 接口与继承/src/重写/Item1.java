package ��д;

public class Item1 {
	String name;
	float hp;
	 public void buy()
	{
		System.out.println("������Ʒ");
		
	}
	 public void effect()
	 {
		 System.out.println("ʹ����Ʒ");
	 }
	
	public static void main(String[] args) {
		Item1 item1= new Item1();
		Item1 item2= new Item1();
		item1.buy();
		item1.effect();
		item2.buy();
		item2.effect();

	}

}
