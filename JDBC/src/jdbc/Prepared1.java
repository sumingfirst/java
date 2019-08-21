package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//sql inqure method
public class Prepared1 {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver")	;	//Load the static inital class
			}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try(
				Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding:UTF-8","root","");
				Statement s=c.createStatement();
				
				){
			String sql="select *from hero";
			//Execute the queny statement and return resultset Resultset
			ResultSet rs=s.executeQuery(sql);
			int total=0;
			while(rs.next())
			{
				int id=rs.getInt("id");
				String name=rs.getString(2);
				float hp=rs.getFloat("hp");
				int demage=rs.getInt(4);
				System.out.printf("%d\t%s\t%f\t%d%n",id,name,hp,demage);
				//do not close the ResultSet because the Statement will frowardly close ResultSet
				//get the  tatal of number
				total=rs.getInt(1);
				
			}
			
			 System.out.println("表Hero中总共有:" + total+" 条数据");
		}

		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		try(Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding:UTF-8","root","");
				Statement s=c.createStatement();){

			//query password
			String name1="dashen";
			String password="thisispaaword";
			String sql1="select *from user where name='"+name1+"'and password='"+password+"'";
			ResultSet  rs1=s.executeQuery(sql1);
			if(rs1.next())
			{
				System.out.println("账号密码正确");
			} 
			else 
				System.out.println("账号密码错误");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	
	}

}
