package ���Ͽ��;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Ergodic {

	public static void main(String[] args) {
		
		List<Hero>heros=new ArrayList<>();
		for(int i=0;i<5;i++)
		{
			heros.add(new Hero("This is hero��������Ϊ"+i));
		}
		//��һ��ѭ������������forѭ��������
		for(int i=0;i<heros.size();i++){
			Hero h=heros.get(i);
		
		}
		//�ڶ��ֵ���������
		Iterator<Hero>it=heros.iterator();
		//���ʼ��ʼ�жϣ�������������ݣ��Ͱ�����ȡ������ָ�������
		while(it.hasNext())
		{
			Hero h=it.next();
			System.out.println(h);
		}
		
		//������for��д��
		/*for (Iterator<Hero> iterator = heros.iterator(); iterator.hasNext();) {
            Hero hero = (Hero) iterator.next();
            System.out.println(hero);*/
        //������for��д��
            for(Iterator <Hero> iterator=heros.iterator();iterator.hasNext();)
            {
            	Hero hero= (Hero)iterator.next();
            	System.out.println(hero);
            }
		
		
		//��������ǿ��forѭ��,�����޷��������ݳ�ʼ�����޷�ֻ��ӡ����
		for(Hero h2:heros)
		{
			System.out.println(h2);
		}
	}

}
