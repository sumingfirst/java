package 泛型;

public class 泛型通配符 {
//ArrayList HelloLSit<?extendsHero>表示这是一个Hero的泛型，或者是其子类的泛型
	//HeroLsit的泛型可能是Hero可能是APHero可能是APHero。但从HeroLsit中去取出的东西一定可以转形成Hero，但不能向里面放东西，放ADHero不满足Aphero，放ApHero又
	//不满足ADHero
	
	//ArrayList HelloLSit<?SuperHero>表示这是一个Hero的泛型，或者是其父类的泛型
	//HelloList的泛型可能是Hero也可能是OBject
	//可以放Hero活着Hero的子类
	//但取出却有风险不能确定取出的是Hero还是Object
	
	/*泛型通配符? 代表任意泛型
既然?代表任意泛型，那么换句话说，这个容器什么泛型都有可能

所以只能以Object的形式取出来
并且不能往里面放对象，因为不知道到底是一个什么泛型的容器*/
	//总结
	//如果希望只取出不插入就选择？exteds
	//希望只插入不取出就选择？super
	//只要希望取出或者插入的就不要选择？
	//泛型转型
	//对象转型，子类转父类一定可以成功，但父类转子类不一定
	//泛型子类泛型转父类转型一定不可以
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
