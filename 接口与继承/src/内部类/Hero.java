package �ڲ���;

public class Hero {
public String name;
	float hp;
	float armor;
	int speed;
	//�Ǿ�̬�ڲ����ڣ�ֻ���ⲿ��������ʱ��������
	//ս���ɼ�ֻ�е�һ��Ӣ�۶������ʱ��������
	 class battlescore
	 {
		 int kill;
		 int die;
		  int assit;
		  public void lengdary()
		  {
			  if(kill>=8)
			  {
				  System.out.println(name+"����");
			  }
			  else System.out.println(name+"��δ����");
		  }
		 
	 }
	 //��̬�ڲ���
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
		garren.name="����";
		//ͨ��ʵ��������ԷǾ�̬�ڲ�����е���
		battlescore score=garren.new battlescore();
		score.kill=9;
		score.lengdary();
		//ʵ������̬�ڲ���
		Hero.enemycri e1=new Hero.enemycri();
		e1.check();
	
		

	}

}
