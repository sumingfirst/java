package 原理和特殊的操作;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
//关于比较器的问题
public class Comparator1 {

	public static void main(String[] args) {
		Random r=new Random();
		List<Hero>heros=new ArrayList<>();
		for(int i=0;i<10;i++)
		{
			heros.add(new Hero("Hero "+i,r.nextInt(100),r.nextInt(100)));
		}
		System.out.println("初始化后的集合：");
		System.out.println(heros);
		//直接调用会出错Collections.sort(heros);因为有多个数值，不知道该调用哪一个属性去比较
		Comparator<Hero>c=new Comparator<Hero>()
				{

					@Override
					public int compare(Hero h1, Hero h2) {
						
						if(h1.hp>h2.hp)
							return 1;
							else
						return -1;
						
					}
			
				
		};
		Collections.sort(heros,c);
		System.out.println("调整后的集合：");
		System.out.println(heros);
		//或者也可以采用Comparable接口在Hero提前设定好需要比较的内容
		
	}

}
