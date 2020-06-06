package Programmers;

import java.util.Arrays;

public class Pro10 {

	public static void main(String[] args) {
		 boolean answer = true;
		 int x=12;
		 String s=Integer.toString(x);
		 String[] str=s.split("");
		 int hap=0;
		 int[] a= new int[str.length];
		 for(int i=0;i<str.length;i++) {
			 a[i]=Integer.parseInt(str[i].toString());
		 }

		 for(int i=0;i<a.length;i++) {
			 hap+=a[i];
		 }
		if(x%hap==0)
			System.out.println(true);
		else
			System.out.println(false);
	}

}
