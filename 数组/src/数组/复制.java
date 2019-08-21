package 数组;
import java.util.Arrays;
public class 复制 {

	public static void main(String[] args) {
	int a[];
	
a=new int[6];
int b[]={2143,232,543,344,521,521};
a=Arrays.copyOf(b, b.length);//将数组进行复制
String s=Arrays.toString(b);//将数组转化成字符串
System.out.println(s);
System.out.println("521是第几个"+Arrays.binarySearch(b, 521));
Arrays.sort(b);
System.out.println(b[1]);
System.out.println("521是第几个"+Arrays.binarySearch(b, 521));//查找元素
System.out.println(Arrays.equals(a, b));//判断是否相等
int c[]=new int[9];
Arrays.fill(c,9);//填充数组
for(int i=0;i<b.length;i++)
{
	System.out.println(a[i]);
	System.out.println(b[i]);
	System.out.println(c[i]);
}
	}
}
