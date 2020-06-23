package StudyJava;

import java.util.HashSet;
import java.util.Iterator;

import java.util.Set;

public class Public2 {
		   public static void main(String[] args) {
			   Set<String> al=new HashSet<String>();
		      al.add("a");
		      al.add("b");
		      al.add("c");
		      al.add("a");
		      al.add("b");
		      al.add("c");
		      al.add("a1");
		      System.out.println(al);
		      al.add("b2");
		      System.out.println(al);
		      al.add("c3");
		      System.out.println(al);
		      int i=1;
		      
		      Iterator<String> it = al.iterator();
		      while(it.hasNext()) {
		    	  String str=it.next();
		         if(str.isEmpty()){
		         System.out.println("is End");
		         }
		         else
		         System.out.println(str);
		         i++;
		      }
		      
		   }
		}

