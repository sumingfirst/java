package ��ϵ������;
//ArrayLsit����ɾ�����ݿ飬˳��ṹ��ͬ��ӰƱ���Զ�λ��
//LinkList����ɾ�����������������ֻ��һ��һ������һ�����ȥ���ԱȽ���
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class ArrayListVSLinKLSit {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		List<Integer>l;
		l=new ArrayList<>();
		insertFirst(l, "Arraylist");
		
		
		l=new LinkedList<>();
		insertFirst(l, "Linkedlist");
		

	}
	private static void insertFirst(List<Integer> l,String name)
	{
		int total=100*1000;
		final int number=5;
		long start=System.currentTimeMillis();
		for(int i=0;i<total;i++)
		{
			l.add(number);
		}
		long end=System.currentTimeMillis();
		System.out.printf("��%s��ǰ������%d�����ܹ���ʱ%d��%n",name,total,end-start);
		
	}
}
