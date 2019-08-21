package 集合框架;

import java.util.ArrayList;
import java.util.List;

//不指定泛型的容器可以存放任何数据类型
//指定泛型的数据类型只能存放某些种类的数据类型
public class Generic1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List heros=new ArrayList();
		//对于不使用泛型的容器，可以向里面不仅加入英雄也可以加入物品
		heros.add(new Hero("盖伦"));
		heros.add(new Item1("冰杖"));
		//但对象转型会出现问题，尤其是添加的对象过多，导致其记忆不清的时候
		Hero h1=(Hero) heros.get(0);
		Hero h2=(Hero) heros.get(1);
		//但是引入泛型之后其，就指定了某种容器只可以放某种对象，放别的就出错
		List<Hero>herosGenericl=new ArrayList<Hero>();
		herosGenericl.add(new Hero("锐雯"));
		//如果加入泛型后就无法再添加非指定类型的对象了herosGenericl.add(new Item1("火焰石"));
		//并且泛型还可以存放指定类的子类
		//在取出数据时不需要进行转型乐1，因为肯定是需要取出的类型
		Hero h3=herosGenericl.get(0);
		//泛型可以稍微简写一点，List<Hero>=new ArrayList<>()

	}

}
