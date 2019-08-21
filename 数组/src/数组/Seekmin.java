package 数组;

public class Seekmin {

	public static void main(String[] args) {
	int a[];
	int []b;
	a=new int[5];
	b=new int [10];
	a[0]=(int)Math.random()*100;
	a[1]=1;
	a[2]=2;
	a[3]=3;
	a[4]=(int)Math.random()*100;
	int c[]={
			12,23,43,54,6,7,87,2234
	};
	System.arraycopy(a, 0, b,0, 5);//src原数组，srcpos原数组起始位置，dest目标数组，destpos目标数组起始位置，length长度
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	System.out.println(a[4]);
	System.out.println(b[0]);
	System.out.println(b[1]);
	System.out.println(b[2]);
	System.out.println(b[3]);
	System.out.println(b[4]);
	System.out.println(b[5]);
	System.out.println(b[6]);
	System.out.println(b[7]);
int d[];
d=a;
System.out.println(d);
int[][]q,w,e;
q=new int[3][3];
System.out.println(a);
	}

}
