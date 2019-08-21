package 原理和特殊的操作;

public class Hero {
	public String name;
	public int  hp;
	public int demage;
	public Hero(){
		
	}
	public Hero(String name)
	{
		this.name=name;
	}
	public Hero(String name,int demage,int  hp)
	{
		this.name=name;
		this.hp=hp;
		this.demage=demage;
	}
	public String toString (){
		return "Hero[name="+name+",hp="+hp+",demage"+demage+"]\r\n";
		
	}

}
