package jdbc;
import jdbc.ConnectionPoll1;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class ConnectionPool2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ConnectionPoll1 cp=new ConnectionPoll1(3);
		for(int i=0;i<100;i++)
		{
			new workingThread("Working Thread"+i,cp).start();
			
		}
	}
	}
	class workingThread extends Thread
	{
		private ConnectionPoll1 cp;
		public workingThread(String name,ConnectionPoll1 cp)
		{
			super(name);
			this.cp=cp;
			
		}
		public void run()
		{
			Connection c=cp.getConnection();
			System.out.println(this.getName()+ ":\t ��ȡ��һ�����ӣ�����ʼ����"  );
			try(Statement st=c.createStatement()){
				Thread.sleep(1000);
				st.execute("select*from hero");
			}
			catch(SQLException |InterruptedException e)
			{
				e.printStackTrace();
			}
			cp.returnConnection(c);
		}
		
	

}
