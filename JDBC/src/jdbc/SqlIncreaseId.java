package jdbc;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class SqlIncreaseId {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		String sql="insert into hero values(null,?,?,?)";
		try(Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding:UTF-8","root","");
				PreparedStatement ps=c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
				)
		{
			ps.setString(1, "盖伦");
			ps.setInt(2, 616);
			ps.setFloat(3, 100);
			//执行插入语句
			ps.execute();
			//执行插入语句后，mysql会为新插入的数据分配一个自增长的id
			//rs通过getGenerateKey来获得该id
			ResultSet rs=ps.getGeneratedKeys();
		/*	while(rs.next())
			{
				int id=rs.getInt("1");
				System.out.println(id);
			}*/
			//获取表的元数据
			//服务器版本驱动版本，那些数据库
			DatabaseMetaData dbmd=c.getMetaData();
			  // 获取数据库服务器产品名称
            System.out.println("数据库产品名称:\t"+dbmd.getDatabaseProductName());
            // 获取数据库服务器产品版本号
            System.out.println("数据库产品版本:\t"+dbmd.getDatabaseProductVersion());
            // 获取数据库服务器用作类别和表名之间的分隔符 如test.user
            System.out.println("数据库和表分隔符:\t"+dbmd.getCatalogSeparator());
            // 获取驱动版本
            System.out.println("驱动版本:\t"+dbmd.getDriverVersion());
  
            System.out.println("可用的数据库列表：");
            // 获取数据库名称
            ResultSet rs1 = dbmd.getCatalogs();
  
            while (rs1.next()) {
                System.out.println("数据库名称:\t"+rs.getString(1));
            }
  
			
			
			
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

}
