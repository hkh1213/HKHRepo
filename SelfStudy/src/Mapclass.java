import java.util.HashMap;
import java.util.Map;

public class Mapclass {

	public static void main(String[] args) {
		Map<String, String> pMap = new HashMap<String, String>();
		pMap.put("name","이협건");
		pMap.put("email","hglee67@kopo.ac.kr");
		pMap.put("dept","데이터분석과");
		
		System.out.println("-----start------");
		System.out.println(pMap.get("name"));
		System.out.println(pMap.get("email"));
		System.out.println(pMap.get("dept"));
		System.out.println(pMap.get("오타"));
		System.out.println("------end-------");
	}

}
