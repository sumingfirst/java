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
			//�������������ǰ���£��ô��������д��
			c.setAutoCommit(false);
			//��û�������ǰ���£���Ѫ����Ѫһ��Ѫ������
			String sql1="update hero set hp=hp+1 where id=22";
			s.execute(sql1);
			//�����Ѫ�Ĵ���д���ˣ��ͻᵼ��Ѫ��������
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
