package finall;

import javax.print.DocFlavor.STRING;

public class Fianll  {
	int hp;
	//常量
	public static final int m=6;
	//m不可改变
	//修饰方法不可以被重写
	//修饰的属性不可被多次赋值
	public static void main(String[] args) {
//final 修饰的引用只有一次机会指向对象
	final	Fianll f;
	f=new Fianll();
	//报错 f=new Fianll();
	//属性没有问题
	f.hp=23;
	f.hp=23;
	
	}

}
