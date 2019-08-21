package ¿ØÖÆÁ÷³Ì;

public class Primissue {

	public static void main(String[] args) {
		int i,j,x,y;
		outloop:
		for(i=1;i<64;i++)
		{
			for(j=1;j<64;j++)
			{
				for(x=1;x<64;x++)
				{
					for(y=1;y<64;y++)
					{
						if(i+j==8&&i+x==14&&j+y==10&&x-y==6)
						{
							System.out.println(x);
							System.out.println(y);
							System.out.println(i);
							System.out.println(j);
							break outloop;
						}
					}
					
				}
			}
		}

	}

}
