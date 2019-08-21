package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
public class Affair {

	public static void main(String[] args) {
		// in the not use the affair
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try(Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding:UTF-8","root","");
				Statement s=c.createStatement();
				)
		
		{
			//下面是在事务的前提下，该代码是如何写的
			c.setAutoCommit(false);
			//在没有事务的前提下，加血，减血一次血量不变
			String sql1="update hero set hp=hp+1 where id=22";
			s.execute(sql1);
			//假设减血的代码写错了，就会导致血量会上升
			String sql2="updata hero set hp=hp-1 where id=22";
			s.execute(sql2);
			
			String sql3="update hero set hp=hp+5 where id=22";
			s.execute(sql3);
			String sql4="update hero set hp=hp-5 where id=22";
			s.execute(sql4);
			c.commit();
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
