package �������ַ���ϵ��;

public class CompareCharacter {

	public static void main(String[] args) {
		//==�Ƿ�Ϊͬһ���ַ����Ķ���
		String s1=new String();
		String s2=s1;
		System.out.println(s1==s2);
		//�������
		String s3=new String("�Ұ���");
		String s4="�Ұ���";
		String s5="�Ұ���";
		
		System.out.println(s5==s4);
		System.out.println(s3==s4);
		//�����Ƿ���ͬ
		System.out.println(s3.equals(s4));
		//��ʲô��ʼ�ͽ���
		String start="��";
		String end="��";
		System.out.println(s3.startsWith(start));
		System.out.println(s3.endsWith(end));
		

	}

}
