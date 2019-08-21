package 异常处理;
//水平不够先把所有的知识点过一遍，再来干这个吧
public class ExceptionDealWith {

	double balance;
	public double getBalance()//获取余额
	{
		return this.balance;
	}
	
	public double deposit()//存钱
	{
		return balance;
		
	}
	public double  withDraw()//取钱
	{
		return balance;
		
	}
	public static void main(String[] args) {
		
		try {
			
		}
		catch(Exception e)
		{
			System.out.println("钱财透支了");
			e.printStackTrace();
		}
	}

}
