package 位操作训练;

public class 二进制 {

	public static void main(String[] args) {
		int a=5;
		int b=6;
		String s=Integer.toBinaryString(a);
		String t=Integer.toBinaryString(b);
		System.out.println(t);
		System.out.println(s);
		System.out.println(a&b);//位或运算
		System.out.println(a|b);//位与运算
		System.out.println(a^b);//位异运算
		System.out.println(a>b);//右移
		System.out.println(a<b);//左移
		System.out.println(a>>1);//带符号右移
		System.out.println(a>>>1);//无符号右移
		System.out.println(~b);//取非运算
		System.out.println(~a);//取非运算
	}

}
