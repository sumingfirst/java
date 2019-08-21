package packag;
//对象属性初始化
public class Hero {
	public String name="some hero";//在声明这个变量的时候初始化
    protected float hp;
    float maxhp;
    {
    	maxhp=240;//初始化块
    }
   /* public Hero()
    {
    	hp=100;//构造方法中初始化
    }*/
    //类属性初始化
    static int item=1;//声明时初始化
    static float money;
    static
    {
    	money=300;//静态化初始化块
    }
    //执行顺序:初始化，初始化块，构造方法初始化
    protected float mp=100;
   
    {
    	mp=200;//初始化块
    }
    public Hero()
    {
    	mp=300;//构造方法中初始化
    }
	public static void main(String[] args) {
		
	Hero hero=new Hero();
	System.out.println(hero.mp);
	}

}
