package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
public class Orm {
	
	public static Hero get(int id)
	{
		Hero hero=null;
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
			
		}
		try(
				Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding:UTF-8","root","");
						Statement s=c.createStatement();)
		{
			
			String sql="select* from hero where id="+id;

			ResultSet rs=s.executeQuery(sql);
			if(rs.next())
			{
				hero=new Hero();
				String name=rs.getString(4);
				int damage=rs.getInt(4);
				float hp=rs.getFloat("hp");
				hero.name=name;
				hero.hp=hp;
				hero.damage=damage;
				hero.id=id;
				
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return hero;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Hero h=get(22);
		System.out.println(h.name);

	}

}
