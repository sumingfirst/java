package packag;

public class Item2 {
private Item2()
{
	
}
public static Item2 item2;
public static  Item2 Getinstance()
{
	if(item2==null)
	{
		item2=new Item2();
	}
	return item2;
}
}