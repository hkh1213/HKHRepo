package db.conn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PrintUserInfo {

	public static void main(String[] args) {
	DBUserInfo ui=new DBUserInfo();
	List<Map<String,String>> rList= ui.getUserInfo();
	
	if(rList==null) {
		rList=new ArrayList<Map<String,String>>();
	}
	System.out.println("----------------------");
	System.out.println("ui.getUserInfo() 회원정보 출력 시작");
	System.out.println("----------------------");
	
	Iterator<Map<String,String>> it=rList.iterator();
	
	while(it.hasNext()) {
		Map<String,String> rMap=it.next();
		
		if(rMap==null)
			rMap=new HashMap<String, String>();
		
		System.out.println("1:"+rMap.get("user_id"));
		System.out.println("2:"+rMap.get("user_nm"));
		System.out.println("3:"+rMap.get("email"));
		System.out.println("4:"+rMap.get("addr"));
		System.out.println("5:"+rMap.get("reg_dt"));
		
		rMap=null;
	}
	rList=null;
	
	}

}
