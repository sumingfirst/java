package ��������;

public class ˮ�ɻ��� {

	public static void main(String[] args) {
		int i;
		for(i=100;i<999;i++)
		{
			int a,b,c;
			a=i/100;
			b=i/10%10;
			c=i%10;
			if((a*a*a+b*b*b+c*c*c)==i)
			{
				System.out.println(i);
			}
		}

	}

}
