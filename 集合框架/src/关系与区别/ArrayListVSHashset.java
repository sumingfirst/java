package ��ϵ������;

import java.util.ArrayList;
import java.util.HashSet;

//ArrayList:��˳��;HashSet:��˳�򣻲���List�����ظ���Hash Set�������ظ�
public class ArrayListVSHashset {

	public static void main(String[] args) {
//����˳��ļ�����ظ�
		ArrayList<Integer>h1=new ArrayList<>();
		h1.add(1);
		h1.add(443);
		h1.add(4343);
		h1.add(1);//�����ظ�
		System.out.println(h1);
		HashSet<Integer>h2= new HashSet<>();
		h2.add(1);
		h2.add(443);
		h2.add(4343);
		h2.add(1);//�������ظ�
		System.out.println(h2);
		
	}

}
