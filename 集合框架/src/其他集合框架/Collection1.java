package 其他集合框架;
//collection是一个接口Dequeue，Queue是先进先出队列
//collections是一个类，如同数组的ArrayList类，容器有Collections类
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Collection1 {

	public static void main(String[] args) {
		// 反转reverse
		List<Integer>numbers=new ArrayList<>();
		for(int i=0;i<10;i++)
		{
			numbers.add(i);
		}
		System.out.println(numbers);
		
		Collections.reverse(numbers);
		System.out.println("反转后的数据");
		System.out.println(numbers);
		//shuffle混肴
		Collections.shuffle(numbers);
		
		
		System.out.println("混肴后的数据");
		System.out.println(numbers);
		//sort排序
		Collections.sort(numbers);
		System.out.println("排序后的数据");
		System.out.println(numbers);
		//swap交换
		Collections.swap(numbers, 0,9 );
		System.out.println("交换后的数据");
		System.out.println(numbers);
		//sort排序
		Collections.sort(numbers);
		System.out.println("排序后的数据");
		System.out.println(numbers);
		//rotate滚动
		Collections.rotate(numbers, 2);
		System.out.println("滚动后的数据");
		System.out.println(numbers);
	}

}
