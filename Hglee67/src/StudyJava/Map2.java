package StudyJava;

import java.util.ArrayList;
import java.util.List;

public class Map2 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		List<String> list2=new ArrayList<String>();
		for(int i=0;i<list.size();i++){
		if(list.get(i).equals("3"))
			list2.add("<"+list.get(i)+">");
		else
			list2.add(list.get(i));
		}
		System.out.println(list2);
		
	}

}
