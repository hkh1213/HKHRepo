import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import db.conn.DBconn;

public class DBUserInfo {
	public List<Map<String,String>> getUserInfo(){
		List<Map<String,String>> rList=null;
		try {
			Connection conn =DBconn.getDBConnection();
			PreparedStatement pstmt= null;
			String sql="SELECT USER_ID, USER_NM, EMAIL, ADDR, REG_DT FROM USER_INFO";
			pstmt=conn.prepareStatement(sql);
			
			ResultSet rs=pstmt.executeQuery(sql);
			while(rs.next()) {
				Map<String,String> rMap=new HashMap<String, String>();
				
				String user_id=rs.getString("USER_ID");
				System.out.println("user_id :"+ user_id);
				rMap.put("user_id", user_id);
				
				String user_nm=rs.getString("USER_NM");
				System.out.println("user_nm :"+ user_nm);
				rMap.put("user_nm", user_nm);
				
				String email=rs.getString("EMAIL");
				System.out.println("email :"+ email);
				rMap.put("email", email);
				
				String addr=rs.getString("ADDR");
				System.out.println("addr :"+ addr);
				rMap.put("addr", addr);
				
				String reg_dt=rs.getString("REG_DT");
				System.out.println("reg_dt :"+ reg_dt);
				rMap.put("reg_dt", reg_dt);
				
				rList.add(rMap);
				rMap=null;
			}
			rs.close();
			DBconn.DBClose(conn);
		}catch (Exception e) {
				System.out.println(e.toString());
		}
		return rList;
	}
}
