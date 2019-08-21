package 集合框架;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Ergodic {

	public static void main(String[] args) {
		
		List<Hero>heros=new ArrayList<>();
		for(int i=0;i<5;i++)
		{
			heros.add(new Hero("This is hero对象排名为"+i));
		}
		//第一种循环遍历，借助for循环来进行
		for(int i=0;i<heros.size();i++){
			Hero h=heros.get(i);
		
		}
		//第二种迭代器遍历
		Iterator<Hero>it=heros.iterator();
		//从最开始开始判断，如果后面有数据，就把数据取出并将指针向后移
		while(it.hasNext())
		{
			Hero h=it.next();
			System.out.println(h);
		}
		
		//迭代器for的写法
		/*for (Iterator<Hero> iterator = heros.iterator(); iterator.hasNext();) {
            Hero hero = (Hero) iterator.next();
            System.out.println(hero);*/
        //迭代器for的写法
            for(Iterator <Hero> iterator=heros.iterator();iterator.hasNext();)
            {
            	Hero hero= (Hero)iterator.next();
            	System.out.println(hero);
            }
		
		
		//第三种增强型for循环,不过无法进行数据初始化，无法只打印单数
		for(Hero h2:heros)
		{
			System.out.println(h2);
		}
	}

}
