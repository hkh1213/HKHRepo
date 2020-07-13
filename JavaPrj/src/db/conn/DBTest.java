package db.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBTest {

	public static void main(String[] args) throws Exception {
		Connection conn=null;
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user="myuser";
		String passwd="12341";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,user,passwd);
			System.out.println("����Ŭ ���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����Ŭ ���� ����");
			System.out.println("ojbdc6.jar ���Ͽ� �����ϴ� �ڹ� ������ ã�� ����");
			System.out.println("���� : "+e.toString());
		} catch (SQLException e) {
			System.out.println("����Ŭ ���� ���� - ���� exception���� ȣ����");
			System.out.println("���� :"+e.toString());
		} finally {
			if( conn!=null) {
				conn.close();
			}
		}
	}

}