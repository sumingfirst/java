package 其他集合框架;
import java.util.LinkedList;
import 集合框架.Hero;
public class LinkedLsit {

	public static void main(String[] args) {
		// 序列分为先进先出FiFO，先进后出FILO，FIFo在java被称为队列，FILO成为栈
		//LinkedList是一个双向链表List
		LinkedList<Hero>heros=new LinkedList<Hero>();
		heros.addFirst(new Hero("这是第一一个加入头部的对象"));
		heros.addFirst(new Hero("这是第二个加入头部的对象"));
		heros.addFirst(new Hero("这是第三个加入头部的对象"));
		heros.addLast(new Hero("这是最后一个被插入的英雄"));
		System.out.println(heros);
		//查看最前面的英雄
		System.out.println(heros.getFirst());
		//查看最后面的英雄
		System.out.println(heros.getLast());
		//取出最前面的英雄
		heros.removeFirst();
		//取出最后面的英雄
		heros.removeLast();
		System.out.println(heros);
		

	}

}
