package �ӿ���̳�;

public class Mixhero extends Hero implements Ap,AD,Heal{

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

	@Override
	public void PhysicalAttackMethod() {
		System.out.println("ʹ����������");
		
	}

	@Override
	public void Apattack() {
		System.out.println("ʹ����ħ������");
		
	}

	@Override
	public void HealAttack() {
		System.out.println("ʹ��������");
		
	}

}
