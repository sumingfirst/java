package 数字与字符串系列;

public class Testnumber {

	public static void main(String[] args) {
		int i=5;//定义基本类型变量
		//基本类型转换为封装类型
		Integer it= new Integer(i);//把一个int 类型强制转换为intenger
		//自动装箱
		Integer i3=i;
		//封装类型转换为基本类型
		int i2=it.intValue();
		//把一个Intenger 类型强制转换为int
		System.out.println(i);
		System.out.println(i2);
		System.out.println(it);
		System.out.println(it instanceof Integer);
		System.out.println();
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		//Byte的自动装箱
		byte b1=6;
		Byte b2=b1;
		//float 的自动装箱
		float f1= 2.3f;
		Float f2=f1;
		//short 的自动装箱
		short s1=996;
		Short s2=s1;
		Short s3=new Short(s1);
		short s4=s3.shortValue();
		
		//double  的自动装箱
		double d1=23;
		Double d2=d1;
		Double d3=new Double (d1);
		double d4=d3.doubleValue();
		//Byte b3=i3;byte与Integer无法进行自动装箱
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(s1);
		//数字转字符串。或者字符串转数字
		int t=5;
		//方法一
		String t2=String.valueOf(t);
		//方法二
		Integer t3=t;
		String t4=t3.toString();
		System.out.println(t4);
		System.out.println(t);
		//字符串转数字
		String str="999";
		int str1=Integer.parseInt(str);
		System.out.println(str1);
		System.out.println(str);
	}

}
