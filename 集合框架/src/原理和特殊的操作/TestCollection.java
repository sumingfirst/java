package 原理和特殊的操作;
import 集合框架.Hero;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class TestCollection {

	public static void main(String[] args) {
		List<Hero>h1=new ArrayList<Hero>();
		//对于HashMap的性能测试，
		HashMap<String , Hero>hm1=new HashMap<>();
		for(int i=0;i<2000000;i++)
		{
			h1.add(new Hero("Hero "+i));
			Hero h=new Hero("Hero "+i);
			hm1.put(h.name, h);
		}
		System.out.println("数据准备完成");
		for(int i=0;i<10;i++)
		{
			//打乱hero的顺序
			Collections.shuffle(h1);
			long start=System.currentTimeMillis();
			String targert="Hero 100000";
			for(Hero h2:h1)
			{
				if(h2.equals(targert)){
					System.out.println("找到了Hero");
				break;}
			}
			for(int i1=0;i1<10;i1++){
			long start1=System.currentTimeMillis();
			Hero target1 = hm1.get("Hero 1000000");
            System.out.println("找到了 hero!" + target1.name);
			
			
			long end1=System.currentTimeMillis();
			long Savetime1=end1-start1;
			System.out.println("HashMap一共花费了"+Savetime1+"毫秒");
			}
			
			

			long end=System.currentTimeMillis();
			long Savetime=end-start;
			System.out.println("List一共花费了"+Savetime+"毫秒");
			
		}
		
		
		
	}

}
