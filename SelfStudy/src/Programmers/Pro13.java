package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pro13 {

	public static void main(String[] args) {
			int x=10000000;
			
			int n=1000;
			List<Long> iList=new ArrayList<Long>();
			System.out.println((Math.abs(x))*(long)n);
			if(x==0) {
				for(int i=0;i<n;i++)
				iList.add((long)0);
			}
			else {
			for(long i=0;i<Math.abs(x)*(long)n;i+=Math.abs(x)) {
				if(x>0) 
					iList.add((long)x+i);
				else
					iList.add((long)x-i);
			}
			}
			
			  long[] arr = new long[iList.size()];
			  System.out.println(iList.size());
		      int index = 0;
		      for (long value : iList) {
		         arr[index++] = value;
		      }
		      System.out.println(arr[999]);
		      System.out.println(Arrays.toString(arr));
	}

}
