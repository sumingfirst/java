package ѵ���빮��;

public class Cat extends Anmial implements Pet{

	String Catname;
	@Override
	public String getName() {
		System.out.println("è��������"+this.name);
		return name;
	}

	@Override
	public void setname(String name) {
		this.name=name;
		System.out.println("èȡ��Ϊ"+this.name);
		
	}

	@Override
	public void play() {
		System.out.println("èϲ��׽����");
		
	}

	@Override
	public void eat() {
		System.out.println("èϲ������");
		
	}

}
