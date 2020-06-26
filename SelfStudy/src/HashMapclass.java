import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapclass {

	public static void main(String[] args) {
		List hmap =new ArrayList<Object>();
		
		Map<String, Object> pMap1 = new HashMap<String, Object>();
		Map<String, Object> pMap2 = new HashMap<String, Object>();
		Map<String, Object> pMap3 = new HashMap<String, Object>();
		Map<String, Object> pMap4 = new HashMap<String, Object>();

		pMap1.put("name","이협건");
		pMap1.put("email","hglee67@kopo.ac.kr");
		pMap1.put("dept","데이터분석과");
		hmap.add(pMap1);
		pMap1=null;
		pMap2.put("name","김영운");
		pMap2.put("email","ky1999@kopo.ac.kr");
		pMap2.put("dept","데분과");
		hmap.add(pMap2);
		pMap2=null;
		pMap3.put("name","홍길동");
		pMap3.put("email","kd1967@kopo.ac.kr");
		pMap3.put("dept","디지털콘텐츠");
		hmap.add(pMap3);
		pMap3=null;
		pMap4.put("name","임꺽정");
		pMap4.put("email","Kj1902@kopo.ac.kr");
		pMap4.put("dept","쥬얼리패션");
		pMap4=null;
		hmap.add(pMap4);
		System.out.println("-----start------");
		for(int i=0;i<hmap.size();i++) 
		System.out.println(hmap.get(i));
		
		System.out.println("------end-------");
		
		hmap.clear();
		if(hmap.isEmpty())
			System.out.println(hmap.get(0));
		System.out.println("clear");
		
		hmap=null;
		System.out.println(hmap.get(0));
	}

}
