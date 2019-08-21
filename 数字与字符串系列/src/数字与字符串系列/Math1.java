package 数字与字符串系列;

public class Math1 {

	public static void main(String[] args) {
		float f1=5.4f;
		float f2=5.5f;
		System.out.println(Math.round(f1));
		System.out.println(Math.round(f2));
		System.out.println(Math.random());
		System.out.println(Math.random()*10);
		System.out.println(Math.sqrt(9));
		System.out.println(Math.pow(2,4));
		System.out.println(Math.E);
		System.out.println(Math.PI);
		double max=Double.POSITIVE_INFINITY;//无限
		int max2=Integer.MAX_VALUE;
		double max1=max2;
		System.out.println(Double.POSITIVE_INFINITY);
		System.out.println(Math.pow((1+1/max1),max1));
		int l = Integer.MAX_VALUE;
        double d = (double)l;
        double e = Math.pow((1+1/d), d);
        System.out.println(e);
        System.out.println(Math.E);
	}

}
