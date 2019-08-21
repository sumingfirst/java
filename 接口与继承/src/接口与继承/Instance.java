package ½Ó¿ÚÓë¼Ì³Ð;

public class Instance {

	public static void main(String[] args) {
		ADhero ad=new ADhero();
		Aphero ap=new Aphero();
		Hero h1=ad;
		Hero h2=ap;
		System.out.println(h1 instanceof ADhero);
		System.out.println(h2 instanceof ADhero);
		System.out.println(h2 instanceof Aphero);
		System.out.println(h1 instanceof Aphero);

	}

}
