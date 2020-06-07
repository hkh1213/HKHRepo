package Programmers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pro15 {
public static void main(String[] args) {
	int m=30; 
	int n=4;
	int[] answer= {};
	List<Integer> iList=new ArrayList<Integer>();
	iList.add(cd(m,n));
	iList.add(m*n/cd(m,n));
	answer = iList.stream().mapToInt(i->i).toArray();
	System.out.println(Arrays.toString(answer));
}
	
	public static int cd(int m, int n) {
		
		if(m<n) {
			int tmp=m; m=n; n=tmp;
		}
		if(m%n==0)
			return n;
		else
			return cd(n,m%n);
		
	}


}

