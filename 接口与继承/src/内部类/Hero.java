package 内部类;

public class Hero {
public String name;
	float hp;
	float armor;
	int speed;
	//非静态内部类在，只有外部类对象存在时才有意义
	//战斗成绩只有当一个英雄对象存在时才有意义
	 class battlescore
	 {
		 int kill;
		 int die;
		  int assit;
		  public void lengdary()
		  {
			  if(kill>=8)
			  {
				  System.out.println(name+"超神");
			  }
			  else System.out.println(name+"尚未超神");
		  }
		 
	 }
	 //静态内部类
	 static class  enemycri
	 {
		 int  hp=2000;
		 public void check()
		 {
			 if(hp==0)
			 {
				 System.out.println("win this game");
			 }
		 }
	 }
	
	 final int damage=5;
	public static void main(String[] args) {
		Hero garren=new Hero();
		garren.name="盖伦";
		//通过实例化对象对非静态内部类进行调用
		battlescore score=garren.new battlescore();
		score.kill=9;
		score.lengdary();
		//实例化静态内部类
		Hero.enemycri e1=new Hero.enemycri();
		e1.check();
	
		

	}

}
