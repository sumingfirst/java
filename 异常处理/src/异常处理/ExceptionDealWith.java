package �쳣����;
//ˮƽ�����Ȱ����е�֪ʶ���һ�飬�����������
public class ExceptionDealWith {

	double balance;
	public double getBalance()//��ȡ���
	{
		return this.balance;
	}
	
	public double deposit()//��Ǯ
	{
		return balance;
		
	}
	public double  withDraw()//ȡǮ
	{
		return balance;
		
	}
	public static void main(String[] args) {
		
		try {
			
		}
		catch(Exception e)
		{
			System.out.println("Ǯ��͸֧��");
			e.printStackTrace();
		}
	}

}
