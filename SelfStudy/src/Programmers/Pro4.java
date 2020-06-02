package Programmers;

import java.util.Arrays;
import java.util.Collections;

public class Pro4 {

	public static void main(String[] args) {
		long n=8000000000L;
		String s=Long.toString(n);
		int[] arr = Arrays.stream(s.split("")).map(String::trim).mapToInt(Integer::parseInt).toArray();
		System.out.println(Arrays.toString(arr));
		 Integer b[] = Arrays.stream(arr).boxed().toArray(Integer[]::new); 
		 System.out.println(Arrays.toString(b));
		Arrays.sort(b, Collections.reverseOrder());
		System.out.println(Arrays.toString(b));
		StringBuffer sb=new StringBuffer();
		for(int a : b) {
		sb.append(a);
		}
		System.out.println(sb);
		String str=sb.toString();
		long answer=Long.parseLong(str);
		System.out.println(answer);
	}
	
	
	

}
