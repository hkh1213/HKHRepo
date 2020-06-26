package Programmers;

import java.util.Arrays;

public class Pro7 {
	public static void main(String[] args) {
		String s=" try   hello world ";
		String[] arr=s.split("");
		System.out.println(arr.length);
		int i=0;
		int st=1;
		while(i<arr.length) {

			 if(arr[i].equals(" ")) {
				st=1;
			 }
			
			 else if(arr[i]!=" "&&st%2==1) {
				arr[i]=arr[i].replace(arr[i], arr[i].toUpperCase());
				st++;
		}
			
			 else if(arr[i]!=" "&&st%2==0) {
				arr[i]=arr[i].replace(arr[i], arr[i].toLowerCase());
				st++;
		}
			i++;
		}
		StringBuffer sb = new StringBuffer();
	      for(int j = 0; j < arr.length; j++) {
	         sb.append(arr[j]);
	      }
	      String str = sb.toString();
	      System.out.println(str);
	}
	
}