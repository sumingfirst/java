package ¿ØÖÆÁ÷³Ì;

public class Gold {

	public static void main(String[] args) {
		double a,b,c,min=1,x;
		double i=-1,j=-1;
		for(a=1;a<20;a++)
		{
			for(b=a+1;b<20;b++)
			{
				if(a%2==0&&b%2==0)
				{
				
					continue;
				}
				c=a/b;
				x=Math.abs(c-0.618);
				if(x<min)
				{
					min=x;
					i=a;
					j=b;
				}
			}
			
		}
		System.out.println(i);
		System.out.println(j);

	}

}
