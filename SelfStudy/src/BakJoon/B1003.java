package BakJoon;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class B1003 {

	public static void main(String[] args) {
		long st = System.currentTimeMillis();
		Scanner scn=new Scanner(System.in);
		int i=0;
		int a=scn.nextInt();
		
		while(i<a) {
			int n=scn.nextInt();
			if(n==0)
				System.out.println(1+" "+0);
			else if(n==1)
				System.out.println(0+" "+1);
			else if(n>1)
			System.out.println(fb(n-1)+" "+fb(n));
			i++;
			
					
		}
		
		  long end = System.currentTimeMillis(); System.out.println((end - st) /
		  1000.0);
		 
	}
	public static int fb(int n) {
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fb(n-1)+fb(n-2);
	}
	
	private Map<Integer, Integer> memoizeTable = new HashMap<>();

	public int fibonacciMemoize(int n){
		
		if( n == 0 ) return 0;
		if( n == 1 ) return 1;
		
		if( this.memoizeTable.containsKey(n) ) 
		{
			System.out.println("Getting value from computed result for "+n);
			return this.memoizeTable.get(n);
		}
		
		int result = fibonacciMemoize(n-1)+ fibonacciMemoize(n-2);
		
		System.out.println("Putting result in cache for "+n);
		this.memoizeTable.put(n, result);
		
		return result;
		
	}
}