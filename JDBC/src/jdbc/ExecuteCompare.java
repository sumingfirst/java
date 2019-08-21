package jdbc;
import java.sql.Connection;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class ExecuteCompare {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try(
				Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding:UTF-8","root","");
				Statement s=c.createStatement();
				)
		{
			String sqlInsert="insert into hero values(null,'盖伦',616,100)";
			String sqlDelete="delete from hero  where id=100";
			String sqlUpdate="update hero set hp=1000 where id=100";
			//相同点都可以执行增加删除修改
			s.execute(sqlUpdate);
			s.execute(sqlDelete);
			s.execute(sqlInsert);
			s.executeUpdate(sqlUpdate);
			s.executeUpdate(sqlDelete);
			s.executeUpdate(sqlInsert);
			//不同点1：通过execute可以执行查询操作，通过getresultset，把结果集取出
			String sqlSelect="select *from hero";
			s.execute(sqlSelect);
			ResultSet rs=s.getResultSet();
			while(rs.next())
			{
				System.out.println(rs.getInt("id"));
			}
			//executeUpdate不可以执行查询操作
			//不同点2：execute返回的是布尔操作true指的是执行了查询操作。flase执行了其他操作，executeUpdate返回的是int多少条数据收到影响
			boolean isExecute=s.execute(sqlDelete);
			boolean isExecute2=s.execute(sqlSelect);
			 System.out.println(isExecute);
			 System.out.println(isExecute2);
			 String sql="update hero set hp=300 where id<100";
			int number=s.executeUpdate(sql);
			System.out.println(number);
			
		}
catch(SQLException e)
		{
	e.printStackTrace();
		}
	}

}
