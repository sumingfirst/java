package packag;

public class Enum {

	public static void main(String[] args) {
		Sean seaon =Sean.SPRING;
		switch(seaon){
			case SPRING:
				System.out.println("���Ǵ���");
				break;
			case SUMMER:
				System.out.println("�����ļ�");
				break;
			case AUTUM:
				System.out.println("�����＾");
				break;
			case WINTER:
				System.out.println("���Ƕ���");
				break;
		}//��������ö������
		for(Sean s:Sean.values())
		{
			System.out.println(s);
		}

	}

}
