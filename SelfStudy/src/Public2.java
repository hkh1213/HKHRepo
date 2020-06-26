
import java.util.HashSet;
import java.util.Iterator;

import java.util.Set;

public class Public2 {
		   public static void main(String[] args) {
			   Set<String> al=new HashSet<String>();
		      al.add("one");
		      al.add("two");
		      al.add("Three");
		   
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

