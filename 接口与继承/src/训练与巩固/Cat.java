package ÑµÁ·Óë¹®¹Ì;

public class Cat extends Anmial implements Pet{

	String Catname;
	@Override
	public String getName() {
		System.out.println("Ã¨µÄÃû×ÖÊÇ"+this.name);
		return name;
	}

	@Override
	public void setname(String name) {
		this.name=name;
		System.out.println("Ã¨È¡ÃûÎª"+this.name);
		
	}

	@Override
	public void play() {
		System.out.println("Ã¨Ï²»¶×½ºûµû");
		
	}

	@Override
	public void eat() {
		System.out.println("Ã¨Ï²»¶³ÔÓã");
		
	}

}
