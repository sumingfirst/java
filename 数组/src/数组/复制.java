package ����;
import java.util.Arrays;
public class ���� {

	public static void main(String[] args) {
	int a[];
	
a=new int[6];
int b[]={2143,232,543,344,521,521};
a=Arrays.copyOf(b, b.length);//��������и���
String s=Arrays.toString(b);//������ת�����ַ���
System.out.println(s);
System.out.println("521�ǵڼ���"+Arrays.binarySearch(b, 521));
Arrays.sort(b);
System.out.println(b[1]);
System.out.println("521�ǵڼ���"+Arrays.binarySearch(b, 521));//����Ԫ��
System.out.println(Arrays.equals(a, b));//�ж��Ƿ����
int c[]=new int[9];
Arrays.fill(c,9);//�������
for(int i=0;i<b.length;i++)
{
	System.out.println(a[i]);
	System.out.println(b[i]);
	System.out.println(c[i]);
}
	}
}
