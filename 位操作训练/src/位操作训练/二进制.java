package λ����ѵ��;

public class ������ {

	public static void main(String[] args) {
		int a=5;
		int b=6;
		String s=Integer.toBinaryString(a);
		String t=Integer.toBinaryString(b);
		System.out.println(t);
		System.out.println(s);
		System.out.println(a&b);//λ������
		System.out.println(a|b);//λ������
		System.out.println(a^b);//λ������
		System.out.println(a>b);//����
		System.out.println(a<b);//����
		System.out.println(a>>1);//����������
		System.out.println(a>>>1);//�޷�������
		System.out.println(~b);//ȡ������
		System.out.println(~a);//ȡ������
	}

}
