package jdbc;
import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
//线程池和数据池相连
public class ConnectionPoll1 {
	List<Connection>cs=new ArrayList<>();
	int size;
	public ConnectionPoll1(int size)
	{
		this.size=size;
		init();
	}
	


	private void init() {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			for(int i=0;i<15;i++)
			{
				Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","");
				cs.add(c);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	public synchronized Connection getConnection()
	{
		while(cs.isEmpty())
			
		{
			try{
				this.wait();
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		Connection c=cs.remove(0);
		return c;
		
	}


	public synchronized void returnConnection(Connection c)
	{
		cs.add(c);
		this.notifyAll();
	}

}
