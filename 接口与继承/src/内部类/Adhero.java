package �ڲ���;

public abstract class Adhero {
	public String name;
	float hp;
	float armor;
	int speed;
	//������������󷽷�
public abstract void attack();
	public static void main(String[] argus){
		
	Adhero h=new Adhero(){
//����ʵ��attack����
		@Override
		public void attack() {
			// TODO �Զ����ɵķ������
			
		System.out.println("�µĽ�������");	
		
		}
	};
	h.attack();
	System.out.println(h);
	//������ ���ڲ���������Ǳ�����ӵ������
	final int damage=5;
	class aphero extends Adhero{
		
		int damage;

		public int Getdemage(int damage)
		{
			return this.damage=damage;
			
		}
		public aphero(int damage) {
			// TODO �Զ����ɵĹ��캯�����
			 damage=10;
			System.out.println("����һ��������"+this.damage);
		}
		
		@Override
		public void attack() {
			System.out.println("����һ��������"+this.damage);
			
		}
		
	}
	aphero a1=new aphero(5);
	a1.attack();
	//������ʹ���ⲿ����
	 //����������ʹ���ⲿ�ľֲ��������ⲿ�ľֲ�������������Ϊfinal
	//ע��jdk8�в��ڱ���Ҫ��finall����Ϊ������ȫ�Զ����㰵�������
	  //��ʵ�ϵ������࣬����������������һ��damage���ԣ�����ʹ�ù��췽����ʼ�������Ե�ֵ
    //��attack��ʹ�õ�damage������ʹ�õ�������ڲ�damage�������ⲿdamage
     
    //�����ⲿ���Բ���Ҫ����Ϊfinal
    //��ô��attack���޸�damage��ֵ���ͻᱻ��ʾΪ�޸����ⲿ����damage��ֵ
     
    //�����������ǲ�ͬ�ı������ǲ������޸��ⲿ����damage��
    //����Ϊ�˱�������󵼣��ⲿ��damage��������Ϊfinal,"����ȥ"�Ͳ����޸���
	
	}


}
