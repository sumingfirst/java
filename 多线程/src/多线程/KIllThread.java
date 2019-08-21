package ∂‡œﬂ≥Ã;

public class KIllThread extends Thread {
	private Hero h1;
	private Hero h2;
	public KIllThread(Hero h1,Hero h2) {
		this.h1=h1;
		this.h2=h2;
	} 
	public void run()
	{
		while(!h2.IsDead())
		{
			h1.attackHero(h2);
		}
	}
}
