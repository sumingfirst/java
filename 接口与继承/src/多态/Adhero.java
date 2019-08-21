package ¶àÌ¬;

public class Adhero extends Hero implements Mortal{

	public static void main(String[] args) {
		Adhero ad1=new Adhero();
		ad1.die();

	}

	@Override
	public void die() {
		System.out.println("ÎïÀíÓ¢ĞÛËÀÍö");
		
	}

}
