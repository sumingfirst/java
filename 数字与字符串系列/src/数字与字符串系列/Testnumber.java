package �������ַ���ϵ��;

public class Testnumber {

	public static void main(String[] args) {
		int i=5;//����������ͱ���
		//��������ת��Ϊ��װ����
		Integer it= new Integer(i);//��һ��int ����ǿ��ת��Ϊintenger
		//�Զ�װ��
		Integer i3=i;
		//��װ����ת��Ϊ��������
		int i2=it.intValue();
		//��һ��Intenger ����ǿ��ת��Ϊint
		System.out.println(i);
		System.out.println(i2);
		System.out.println(it);
		System.out.println(it instanceof Integer);
		System.out.println();
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		//Byte���Զ�װ��
		byte b1=6;
		Byte b2=b1;
		//float ���Զ�װ��
		float f1= 2.3f;
		Float f2=f1;
		//short ���Զ�װ��
		short s1=996;
		Short s2=s1;
		Short s3=new Short(s1);
		short s4=s3.shortValue();
		
		//double  ���Զ�װ��
		double d1=23;
		Double d2=d1;
		Double d3=new Double (d1);
		double d4=d3.doubleValue();
		//Byte b3=i3;byte��Integer�޷������Զ�װ��
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(s1);
		//����ת�ַ����������ַ���ת����
		int t=5;
		//����һ
		String t2=String.valueOf(t);
		//������
		Integer t3=t;
		String t4=t3.toString();
		System.out.println(t4);
		System.out.println(t);
		//�ַ���ת����
		String str="999";
		int str1=Integer.parseInt(str);
		System.out.println(str1);
		System.out.println(str);
	}

}
