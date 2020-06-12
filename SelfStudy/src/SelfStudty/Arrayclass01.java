package SelfStudty;

import java.util.Arrays;
import java.util.Collections;

public class Arrayclass01 {

	public static void main(String[] args) {
	long n=123;
	int a=Math.toIntExact(n);
	int j=0;
	int len = Integer.toString(a).length();
	int[] arr=new int[len];
	while(a!=0) {
		arr[len-j-1]=a%10;
		a=a/10;
		j++;
	}
	Integer b[] = Arrays.stream(arr).boxed().toArray(Integer[]::new);
	Arrays.sort(b,Collections.reverseOrder());
	int answer[] = Arrays.stream(b).mapToInt(i->i).toArray(); 
	for(int i=0;i<arr.length;i++) {
	System.out.println(answer[i]);
	}
	}
}
