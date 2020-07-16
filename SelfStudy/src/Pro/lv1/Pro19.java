package Pro.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pro19 {

	public static void main(String[] args) {
		String[] strings= {"abce","abdd","cdxk","cxk","defff"};
		
		int n=2;
		String[] answer = {};
		
		List<String> list=new ArrayList<String>();
		
		for(int i=0;i<strings.length;i++) {
			list.add(strings[i].charAt(n-1)+strings[i]);	
		}
		
		Collections.sort(list);
		answer=new String[list.size()];
		for(int i=0;i<list.size();i++) {
			answer[i]=list.get(i).substring(1,list.get(i).length());
		}
		
		
		}
	
	}
