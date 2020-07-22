package BakJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class B4673 {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();

		int i=1;
		int n=1;
		int arr[] =new int[10000];
		for(int j=1;j<=9994;j++)
			list.add(j);
		while(i<10000&&sol(n)<10000) {
			arr[i]=sol(n);
			if(list.contains(arr[i]))
				list.remove((Integer)arr[i]);
			n++;
			i++;
		}
		Collections.sort(list);
		int k=0;
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		k++;
		}
	}
	
	
	  public static int sol(int n) {
		  int a=n+mul(n);
		  return a;
		  }
	 
	
	public static int mul(int n) {

		int sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
}
