package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
;
//创建statement可以用于sql的执行，比如增加删除

public class TestJdbc {

	public static void main(String[] args) {

        Connection c = null;
        Statement s = null;
		//初始化驱动
		try{
			//驱动类com.mysql.jdbc.Driver
			//就在 mysql-connector-java-5.0.8-bin.jar中
            //如果忘记了第一个步骤的导包，就会抛出ClassNotFoundException
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("数据库驱动加载成功");
			//建立与数据库connection
			//这里需要提供：数据库所处于的ip：127.0.0.1（本机）
			//数据库的端口号：3306
			//数据库的名称：how2java
			//编码方式UTF-8
			//账户root
			//密码
			  c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding:UTF-8","root","");
			//使用的是Java。sql。Statement
			 s=c.createStatement();
			System.out.println("获取statement"+s);
			//准备sql语句注意字符串：字符串用单引号‘
			String sql="insert into  hero values(null,"+"'提莫'"+","+313.0f+","+50+")";
			s.execute(sql);
			System.out.println("执行插入语句成功");
			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally{
			//数据库连接时的有限资源，相关操作结束后，养成关闭数据库的习惯
			//先关闭statement
			
			if(s !=null)
			try{
				s.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			//后关闭Connection
			if(c !=null)
			{
				try
				{
					c.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
		}

	}

}
