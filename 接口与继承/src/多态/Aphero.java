package ¶àÌ¬;

public class Aphero extends Hero implements Mortal{

	public static void main(String[] args) {
		Aphero ap1=new Aphero();
		ap1.die();

	}

	@Override
	public void die() {
		System.out.println("Ä§·¨Ó¢ĞÛËÀÍö");
		
	}

}
