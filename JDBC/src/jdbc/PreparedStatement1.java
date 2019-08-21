package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class PreparedStatement1 {

	


		public static void main(String[] args) {
			try
			{
				Class.forName("com.mysql.jdbc.Driver")	;	//Load the static inital class
				}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			String sql="insert into hero values(null,?,?,?)";
			try(
					Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding:UTF-8","root","");
					PreparedStatement ps = c.prepareStatement(sql);
					
					){
				//set up parameters
				
				ps.setString(1, "提莫");
	            ps.setFloat(2, 313.0f);
	            ps.setInt(3, 50);
	            // 执行
	            ps.execute();
				
	         // PreparedStatement 使用参数设置，可读性好，不易犯错
	            // "insert into hero values(null,?,?,?)";
			}
			
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			}
		
	
}



