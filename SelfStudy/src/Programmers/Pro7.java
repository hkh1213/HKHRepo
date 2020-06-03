package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pro7 {

	public static void main(String[] args) {
		String s = "tryy   hello  world";
		
		String[] sp = s.split(" "); 
		StringBuilder upper=new StringBuilder();
		 List<String> strlist=new ArrayList<String>();
		 for(int i=0;i<sp.length;i++) {
			 if(sp[i].length()!=0)
			strlist.add(sp[i]);
		 }
		 
		 String[] strings = strlist.stream().toArray(String[]::new);
	System.out.println(Arrays.toString(strings));
		 
			 for(int i=0;i<strlist.size();i++) {
			 String[] arr=strlist.get(i).split("");
			 for(int j=0;j<arr.length;j++) {
				
				 if (j == 0 || j % 2 == 0)
					upper.append(arr[j].toUpperCase());
					else
					upper.append(arr[j].toLowerCase());
			 }
			 }
				/*
				 * for(int i=0;i<strlist.size();i++) strings[i].replaceAll(strings[i],arr1[i]);
				 * 
				 * System.out.println(Arrays.toString(strings));
				 */
	}
}
