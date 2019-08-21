package 集合框架;
import java.util.List;
import java.util.ArrayList;
public class ListInterface1 {

	public static void main(String[] args) {
		//ArrayList接口实现了List接口
		//接口引用指向子类多态
		List hero=new ArrayList();
		hero.add(new Hero("盖伦"));
		
		System.out.println(hero.size());
		

	}

}
