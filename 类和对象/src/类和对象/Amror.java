package 类和对象;
//继承的训练
public class Amror extends Item {

	int defends;
	public static void main(String[] args) {
		Amror clothgrown=new Amror();
		Amror hauberk =new Amror();
		clothgrown.name="布衣";
		clothgrown.defends=2;
		clothgrown.price=450;
		hauberk.name="锁子甲";
		hauberk.defends=4;
		hauberk.price=1050;
		

	}

}
