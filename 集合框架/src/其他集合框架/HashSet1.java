package �������Ͽ��;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		//Hashset��Ԫ�ز����ظ�,ֻ�ܱ���һ������
		HashSet<String>heros=new HashSet<String>();
		heros.add("hello");
		System.out.println(heros);
		heros.add("hellos");
		System.out.println(heros);
		//set�е�Ԫ��û��˳��
		HashSet<Integer>h1=new HashSet<Integer>();
		for(int i=0;i<5;i++)
		{
			h1.add(i);
		}
		//set���ṩget��������ȡĳ��λ�õ�Ԫ��,���Բ��õ������ķ���
		for(Iterator<Integer>integer=h1.iterator();integer.hasNext();)
		{
			Integer i=(Integer)integer.next();
			System.out.println(i);
		}
		//���߲�����ǿ��forѭ��
		for(Integer m:h1)
		{
			System.out.println(m);
		}
		
		

	}

}
