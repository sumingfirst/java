package �������ַ���ϵ��;

public class CreatString {

	public static void main(String[] args) {
		int t;
		//����ֱ�Ӵ����ַ����ķ���
		String  garren="����";
		String teemo=new String("��Ī");
		//ͨ���ַ����鴴���ַ���
		char cf[]={'1','3','6'};
		String a=new String(cf);
		//ͨ��+�����ַ����Ĵ���
		String b=garren+teemo;
		//String ��Ϊ��finall���Բ��ܱ��̳У�����immutable���ܽ����κ��޸�
		//�ַ����ĳ���
		System.out.println(b.length());
		//��������ַ���
		//���ֵ����48��57
		//��ĸ��65��122����90��97Ϊ����ĸ����
		char s5[]=new char[5];
		for(int i=0;i<5;i++)
		{
			
			do {
				t=48+(int)(Math.random()*75);
				
			}while(t<65&&t>57||t>90&&t<97);
			s5[i]=(char) t;
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(s5[i]);
		}
		
				
		}

	}


