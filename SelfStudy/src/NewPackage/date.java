package NewPackage;

import java.util.Scanner;

public class date {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String s=scn.next();
		String s1=s.toUpperCase();
		String[] arr=s1.split("");
		int count=0;
		int count2=0;
		for(int i=0;i<s.length();i++) {
			if(arr[i].equals("P")) {
				count++;
			}
			if(arr[i].equals("Y")) {
				count2++;
			}
			
		}
		
		boolean isPrime =true;
		if (count==count2) {
			
		}
		else {
			isPrime=!isPrime; 
		}
		System.out.println(isPrime);
	}
	}

