package 控制流程;

public class 水仙花数 {

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
