package db.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.conn.DBconn;

public class DBSelect {

	public static void main(String[] args) throws SQLException{
		Connection conn=DBconn.getDBConnection();
		
		PreparedStatement pstmt=null;
		
		String sql="select count(1) as CNT from user_info";
		
		pstmt=conn.prepareStatement(sql);
		
		ResultSet rs=pstmt.executeQuery(sql);
		if(rs.next()) {
			String cnt=rs.getString("CNT");
			System.out.println("cnt :"+cnt);
		}
		rs.close();
		DBconn.DBClose(conn);
	}

}
