import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Divword {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		List<String> iList=new ArrayList();
		  iList.add("객체지향프로그래밍");
	      iList.add("하둡");
	      iList.add("MongoDB");
	      int n=scn.nextInt();
		for(int i=0;i<iList.size();i++) {
	      if(iList.get(i).equals(iList.get(n-1))) {
	    	  iList.add(i,"<"+iList.get(i)+">");
	    	  iList.remove(i+1);
	      }
		}
	      Iterator<String> itr=iList.iterator();
	      while(itr.hasNext()) {
	         System.out.println(itr.next());
	      }
	}
}