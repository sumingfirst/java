package 集合框架;
import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		//容器类ArrayList用于存放对象
		ArrayList heros=new ArrayList();
		heros.add(new Hero());
		System.out.println(heros.size());
		//只要不断往容器里添加对象其长度不断在变大，不用担心数组越界的问题
		for(int i=0;i<5;i++)
		{
		heros.add(new Hero("This is a hero"+i));
		System.out.println(heros.size());
		
		}
		//集合框架的常用方法
		//上面是第一种add，是在ArrayLSIt的最后面添加的对象可以在指定位置添加
		Hero specal=new Hero("special Hero");
		heros.add(3, specal);
		System.out.println(heros.toString());
		System.out.println(heros);
		//判断一个对象是否在容器里面，标准：其对象是否相同，而不是名字是否一样
		System.out.println("虽然一个新对象的名字也叫Hero 1但contians返回的值是：");
		System.out.println(heros.contains(new Hero("hero1")));//这一个的对象不在容器里面
		System.out.println("而对specal的判断则是：");
		System.out.println(heros.contains(specal));
		//contians判断是否存在
		//通过get获得指定位置的对象
		System.out.println(heros.get(5));
		//通过index Of获取对象存在的位置
		System.out.println("specal存在的位置是"+heros.indexOf(specal));
		//通过remove删除，可以通过对象删除，也可以·通过位置删除
		System.out.println("当前ArrayList的长度是："+heros.size());
		heros.remove(0);
		System.out.println("当前ArrayList的长度是："+heros.size());
		heros.remove(specal);
		System.out.println(heros);
		//set用于替换指定元素
		heros.set(3 ,new Hero("这是一个后来添加的Hero"));
		System.out.println(heros);
		//size获取大小
		//toArray转化为数组
		
		Hero[] hero=(Hero [])heros.toArray(new Hero[]{});
		//addAll把另一个容器的所有对象都加入进来
		ArrayList heros1=new ArrayList();
		for(int i=0;i<5;i++)
		{
			heros1.add(new Hero("这是第二容器的的对象排名第"+i));
		}
		heros.addAll(heros1);
		System.out.println(heros);
		//clear清空
		heros.clear();;
		System.out.println(heros);
	}

}
