package �������ַ���ϵ��;

public class String2buffer {

	public static void main(String[] args) {
		// ׷��(append)ɾ��(delete)�����루insert������ת��reverse��
		StringBuffer s1=new StringBuffer("������");
		s1.append("hello");
		System.out.println(s1);
		s1.delete(0, 1);
		System.out.println(s1);
		s1.insert(0, "god");
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		System.out.println(s1.length());//����
		System.out.println(s1.capacity());//�ܿռ�

	}

}
