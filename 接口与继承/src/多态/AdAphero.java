package 多态;

public class AdAphero extends Hero implements Mortal{

	public static void main(String[] args) {
		AdAphero adadp1=new AdAphero()
;
		adadp1.die();
	}

	@Override
	public void die() {
		System.out.println("物理魔法双修英雄死亡");
		
	}

}
