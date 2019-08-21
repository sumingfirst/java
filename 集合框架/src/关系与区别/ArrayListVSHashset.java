package 关系与区别;

import java.util.ArrayList;
import java.util.HashSet;

//ArrayList:有顺序;HashSet:无顺序；并且List可以重复而Hash Set不可以重复
public class ArrayListVSHashset {

	public static void main(String[] args) {
//关于顺序的检验和重复
		ArrayList<Integer>h1=new ArrayList<>();
		h1.add(1);
		h1.add(443);
		h1.add(4343);
		h1.add(1);//可以重复
		System.out.println(h1);
		HashSet<Integer>h2= new HashSet<>();
		h2.add(1);
		h2.add(443);
		h2.add(4343);
		h2.add(1);//不可以重复
		System.out.println(h2);
		
	}

}
