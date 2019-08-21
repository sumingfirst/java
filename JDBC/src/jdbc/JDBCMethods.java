package jdbc;
//下面使用try with的方式来自动关闭数据库的链接connection和执行语句statement
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;



import java.sql.Connection;
import java.sql.DriverManager;
public class JDBCMethods {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try(Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","");
				Statement s=c.createStatement();
		)
		{
			//jdbc插入语句
			String sql="insert into hero values(null," +"'提莫'"+","+313.0f+","+50+")";
					s.execute(sql);
			System.out.println("运行成功");
			//jdbc删除语句
			String sql2="delete from hero where id=2";
			s.execute(sql2);
			System.out.println("jdbc第二条语句运行成功");
			//jdbc的修改语句
			String sql3="update hero set name='name5' where id=3";
			s.execute(sql3);
			System.out.println("jdbc的第三条语句运行成功");
			//jdbc的查询操作
			String sql4="select *from hero";
			//执行查询语句并把结果集返回给resultset
			ResultSet rs=s.executeQuery(sql4);
			while(rs.next())
			{
				int id=rs.getInt("id");
				String name=rs.getString(2);
				float hp=rs.getFloat("hp");
				int demage=rs.getInt(4);
				System.out.printf("%d\t%s\t%f\t%d%n", id, name, hp, demage);
			}
			//判断账号密码是否正确
			String name="dashen";
			String password="thisispassword";
			String sql5=" select * from user where name='"+name+"'and password='"+password+"'";
			s.execute(sql5);
			if(rs.next())
			{
				System.out.println("账号密码正确");
			}
			else
			{
				System.out.println("账号密码错误");
			}
			
					}
catch(SQLException e)
		{
	e.printStackTrace();
		}
	}

}
