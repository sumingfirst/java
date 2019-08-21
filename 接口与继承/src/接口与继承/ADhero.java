package 接口与继承;

public class ADhero extends Hero implements AD{
	
	public static void main(String[] args) {
		
		ADhero ad1=new ADhero();
		
	}
	@Override
	public void PhysicalAttackMethod() {
		System.out.println("使用了物理攻击");
		
	}

}
