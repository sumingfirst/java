package �������ַ���ϵ��;

public class ControlString {

	public static void main(String[] args) {
		String sentence="  ���Ǹ���,  ��ҪͶ����   �����������Ͷ����?  ";
		char c=sentence.charAt(1);//��ȡ�ַ�
		System.out.println(c);
//��ȡ�ַ���
		String s1=sentence.substring(2);
		System.out.println(s1);
		String s2=sentence.substring(2,6);
		System.out.println(s2);
		//�ָ��forѭ��������һ�ֱ��
		String[] s3=sentence.split(",");
		for(String s5:s3)//��������һ�������͵����ݼ��ϣ���ԭ������
		{
			
			System.out.println(s5);
		}
		//ȥ����β�ո�
		String s6=sentence.trim();
		
		System.out.println(s6);	
		//��Сдת��
		String s7="ADdewedjADdqw";
		System.out.println(s7.toUpperCase());
		System.out.println(s7.toLowerCase());
		//��λ��صĺ���
		System.out.println(s6.indexOf("��"));//��һ�γ��ֵ�λ��
		System.out.println(s6.lastIndexOf("��"));//���һ�γ��ֵ�λ��
		System.out.println(s6.contains("����"));//�Ƿ����
		System.out.println(s6.indexOf("��",6));//��6λ�ÿ�ʼ��ѯ�ҳ��ֵ�λ��
		//�滻��صĺ���
		System.out.println(s6.replaceAll("��", "��"));//�滻����
		System.out.println(s6.replaceFirst("��", "��"));//�滻һ��
	}

}
