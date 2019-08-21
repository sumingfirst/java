package 其他集合框架;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		//Hashset的元素不能重复,只能保留一个数据
		HashSet<String>heros=new HashSet<String>();
		heros.add("hello");
		System.out.println(heros);
		heros.add("hellos");
		System.out.println(heros);
		//set中的元素没有顺序
		HashSet<Integer>h1=new HashSet<Integer>();
		for(int i=0;i<5;i++)
		{
			h1.add(i);
		}
		//set不提供get方法来获取某个位置的元素,可以采用迭代器的方法
		for(Iterator<Integer>integer=h1.iterator();integer.hasNext();)
		{
			Integer i=(Integer)integer.next();
			System.out.println(i);
		}
		//或者采用增强型for循环
		for(Integer m:h1)
		{
			System.out.println(m);
		}
		
		

	}

}
