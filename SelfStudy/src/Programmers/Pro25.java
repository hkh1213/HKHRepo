package Programmers;

import java.util.ArrayList;
import java.util.List;

public class Pro25 {
	public static void main(String[] args) {
		int n=0;
		int a=11;
		int count=0;
		System.out.println(sol(1));
		System.out.println(sol(2));
		while(sol(n)<a) {
			n++;
			count=n;
		}
		System.out.println(count);
		List<Integer> list=new ArrayList<Integer>();
		
		while(count>0) {
		if(a-sol(count-1)<(sol(count)-sol(count-1))/3)
			list.add(1);
		else if(a-sol(count-1)>=(sol(count)-sol(count-1))/3)
			list.add(2);
		else if(a-sol(count-1)>=(sol(count)-sol(count-1))/3*2)
			list.add(4);
		
		count--;
		System.out.println(a);
		}
		System.out.println(list);
	}
	public static double sol(int num) {
		
		if(num==0)
			return 0;
		else 
			return sol(num-1)+Math.pow(3, num);
		
	}
	

}
