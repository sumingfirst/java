package jdbc;
//����ʹ��try with�ķ�ʽ���Զ��ر����ݿ������connection��ִ�����statement
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
			//jdbc�������
			String sql="insert into hero values(null," +"'��Ī'"+","+313.0f+","+50+")";
					s.execute(sql);
			System.out.println("���гɹ�");
			//jdbcɾ�����
			String sql2="delete from hero where id=2";
			s.execute(sql2);
			System.out.println("jdbc�ڶ���������гɹ�");
			//jdbc���޸����
			String sql3="update hero set name='name5' where id=3";
			s.execute(sql3);
			System.out.println("jdbc�ĵ�����������гɹ�");
			//jdbc�Ĳ�ѯ����
			String sql4="select *from hero";
			//ִ�в�ѯ��䲢�ѽ�������ظ�resultset
			ResultSet rs=s.executeQuery(sql4);
			while(rs.next())
			{
				int id=rs.getInt("id");
				String name=rs.getString(2);
				float hp=rs.getFloat("hp");
				int demage=rs.getInt(4);
				System.out.printf("%d\t%s\t%f\t%d%n", id, name, hp, demage);
			}
			//�ж��˺������Ƿ���ȷ
			String name="dashen";
			String password="thisispassword";
			String sql5=" select * from user where name='"+name+"'and password='"+password+"'";
			s.execute(sql5);
			if(rs.next())
			{
				System.out.println("�˺�������ȷ");
			}
			else
			{
				System.out.println("�˺��������");
			}
			
					}
catch(SQLException e)
		{
	e.printStackTrace();
		}
	}

}
