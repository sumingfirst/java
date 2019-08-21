package 关系与区别;
//ArrayLsit插入删除数据块，顺序结构如同电影票所以定位快
//LinkList插入删除数据慢，如果佛珠只能一个一个接着一个查过去所以比较慢
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class ArrayListVSLinKLSit {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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
		System.out.printf("在%s面前插入了%d数据总共耗时%d秒%n",name,total,end-start);
		
	}
}
