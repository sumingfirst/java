package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
;
//����statement��������sql��ִ�У���������ɾ��

public class TestJdbc {

	public static void main(String[] args) {

        Connection c = null;
        Statement s = null;
		//��ʼ������
		try{
			//������com.mysql.jdbc.Driver
			//���� mysql-connector-java-5.0.8-bin.jar��
            //��������˵�һ������ĵ������ͻ��׳�ClassNotFoundException
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("���ݿ��������سɹ�");
			//���������ݿ�connection
			//������Ҫ�ṩ�����ݿ������ڵ�ip��127.0.0.1��������
			//���ݿ�Ķ˿ںţ�3306
			//���ݿ�����ƣ�how2java
			//���뷽ʽUTF-8
			//�˻�root
			//����
			  c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding:UTF-8","root","");
			//ʹ�õ���Java��sql��Statement
			 s=c.createStatement();
			System.out.println("��ȡstatement"+s);
			//׼��sql���ע���ַ������ַ����õ����š�
			String sql="insert into  hero values(null,"+"'��Ī'"+","+313.0f+","+50+")";
			s.execute(sql);
			System.out.println("ִ�в������ɹ�");
			
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
			//���ݿ�����ʱ��������Դ����ز������������ɹر����ݿ��ϰ��
			//�ȹر�statement
			
			if(s !=null)
			try{
				s.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			//��ر�Connection
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
