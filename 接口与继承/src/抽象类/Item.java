package ≥ÈœÛ¿‡;

public abstract class Item {
	public abstract boolean disposonable();
	
	public static void main(String[] args) {
		
		Armor a1=new Armor();
		Weapon w1=new Weapon();
		Lifepostion l1=new Lifepostion();
		a1.disposonable();
		w1.disposonable();
		l1.disposonable();
	}

}
