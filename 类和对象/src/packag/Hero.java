package packag;
//�������Գ�ʼ��
public class Hero {
	public String name="some hero";//���������������ʱ���ʼ��
    protected float hp;
    float maxhp;
    {
    	maxhp=240;//��ʼ����
    }
   /* public Hero()
    {
    	hp=100;//���췽���г�ʼ��
    }*/
    //�����Գ�ʼ��
    static int item=1;//����ʱ��ʼ��
    static float money;
    static
    {
    	money=300;//��̬����ʼ����
    }
    //ִ��˳��:��ʼ������ʼ���飬���췽����ʼ��
    protected float mp=100;
   
    {
    	mp=200;//��ʼ����
    }
    public Hero()
    {
    	mp=300;//���췽���г�ʼ��
    }
	public static void main(String[] args) {
		
	Hero hero=new Hero();
	System.out.println(hero.mp);
	}

}
