package ¿ØÖÆÁ÷³Ì;

public class Millnare {

	public static void main(String[] args) {
		double money=12000;
		double allmoney=0;
		int i;
		for(i=1;i<10000;)

		{
			allmoney=money*(1+0.2);
			
			money=allmoney+12000;
			i=i+1;
			if(allmoney>1000000)
			{
				System.out.println(i);
				break;
			}
		}
	}

}
