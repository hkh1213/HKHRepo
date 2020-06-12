package StudyJava;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HashMap2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		List<HashMap<String,String>> hmap =new ArrayList<>();
		
		HashMap<String, String> pMap = new HashMap<>();
		/*
		 * Map<String, Object> pMap2 = new HashMap<String, Object>(); Map<String,
		 * Object> pMap3 = new HashMap<String, Object>(); Map<String, Object> pMap4 =
		 * new HashMap<String, Object>();
		 */
		boolean ask=true;
		while(ask) {
			String name=scn.nextLine();
			String email=scn.nextLine();
			String dept=scn.nextLine();
			pMap.put("name",name);
			pMap.put("email",email);
			pMap.put("dept",dept);
			hmap.add(pMap);	
		
		Iterator<HashMap<String, String>> it=hmap.iterator();
		while(it.hasNext()) {
			HashMap<String, String> rMap=it.next();
			System.out.println("#### 반복시작 ####");
			System.out.println("name :"+ rMap.get("name"));
			System.out.println("email :"+ rMap.get("email"));
			System.out.println("dept :"+ rMap.get("dept"));

			rMap=null;
			System.out.println("#### 반복 끝 ####");
		}
		
		
		}
			}
		
	
		/*
		 * pMap2.put("name","김영운"); pMap2.put("email","ky1999@kopo.ac.kr");
		 * pMap2.put("dept","데분과"); hmap.add(pMap2); pMap2=null;
		 * pMap3.put("name","홍길동"); pMap3.put("email","kd1967@kopo.ac.kr");
		 * pMap3.put("dept","디지털콘텐츠"); hmap.add(pMap3); pMap3=null;
		 * pMap4.put("name","임꺽정"); pMap4.put("email","Kj1902@kopo.ac.kr");
		 * pMap4.put("dept","쥬얼리패션"); pMap4=null; hmap.add(pMap4);
		 */
		
	}


