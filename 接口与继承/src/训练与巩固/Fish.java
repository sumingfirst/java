package ѵ���빮��;

public class Fish extends Anmial implements Pet {
	
	public void walk(int legs) {
		
		System.out.println("��û����Ҳ������·");
	}

	@Override
	public String getName() {
		// TODO �Զ����ɵķ������
		System.out.println("�����������"+name);
		return name;
	}

	@Override
	public void setname(String name) {
		// TODO �Զ����ɵķ������

		this.name=name;
		System.out.println("��ȡ��Ϊ"+this.name);
		
		
	}
		

	@Override
	public void play() {
		System.out.println("����������Ӿ");
		
	}

	@Override
	public void eat() {
		System.out.println("�������ڳԶ���");
		
	}
	public Fish()
	{
		System.out.println("��������޲ι��췽��");
		}

}
