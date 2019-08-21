package 接口与继承;

public class Mixhero extends Hero implements Ap,AD,Heal{

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	@Override
	public void PhysicalAttackMethod() {
		System.out.println("使用了物理攻击");
		
	}

	@Override
	public void Apattack() {
		System.out.println("使用了魔法攻击");
		
	}

	@Override
	public void HealAttack() {
		System.out.println("使用了治疗");
		
	}

}
