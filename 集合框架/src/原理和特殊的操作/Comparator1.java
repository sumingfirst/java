package ԭ�������Ĳ���;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
//���ڱȽ���������
public class Comparator1 {

	public static void main(String[] args) {
		Random r=new Random();
		List<Hero>heros=new ArrayList<>();
		for(int i=0;i<10;i++)
		{
			heros.add(new Hero("Hero "+i,r.nextInt(100),r.nextInt(100)));
		}
		System.out.println("��ʼ����ļ��ϣ�");
		System.out.println(heros);
		//ֱ�ӵ��û����Collections.sort(heros);��Ϊ�ж����ֵ����֪���õ�����һ������ȥ�Ƚ�
		Comparator<Hero>c=new Comparator<Hero>()
				{

					@Override
					public int compare(Hero h1, Hero h2) {
						
						if(h1.hp>h2.hp)
							return 1;
							else
						return -1;
						
					}
			
				
		};
		Collections.sort(heros,c);
		System.out.println("������ļ��ϣ�");
		System.out.println(heros);
		//����Ҳ���Բ���Comparable�ӿ���Hero��ǰ�趨����Ҫ�Ƚϵ�����
		
	}

}
