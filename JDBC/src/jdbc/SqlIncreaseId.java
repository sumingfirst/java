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
			ps.setString(1, "����");
			ps.setInt(2, 616);
			ps.setFloat(3, 100);
			//ִ�в������
			ps.execute();
			//ִ�в�������mysql��Ϊ�²�������ݷ���һ����������id
			//rsͨ��getGenerateKey����ø�id
			ResultSet rs=ps.getGeneratedKeys();
		/*	while(rs.next())
			{
				int id=rs.getInt("1");
				System.out.println(id);
			}*/
			//��ȡ���Ԫ����
			//�������汾�����汾����Щ���ݿ�
			DatabaseMetaData dbmd=c.getMetaData();
			  // ��ȡ���ݿ��������Ʒ����
            System.out.println("���ݿ��Ʒ����:\t"+dbmd.getDatabaseProductName());
            // ��ȡ���ݿ��������Ʒ�汾��
            System.out.println("���ݿ��Ʒ�汾:\t"+dbmd.getDatabaseProductVersion());
            // ��ȡ���ݿ�������������ͱ���֮��ķָ��� ��test.user
            System.out.println("���ݿ�ͱ�ָ���:\t"+dbmd.getCatalogSeparator());
            // ��ȡ�����汾
            System.out.println("�����汾:\t"+dbmd.getDriverVersion());
  
            System.out.println("���õ����ݿ��б�");
            // ��ȡ���ݿ�����
            ResultSet rs1 = dbmd.getCatalogs();
  
            while (rs1.next()) {
                System.out.println("���ݿ�����:\t"+rs.getString(1));
            }
  
			
			
			
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

}
