package BakJoon;

import java.util.Scanner;

public class B1011 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		
		int j = 0;
		int num1 = scn.nextInt();
		while (num1 > j) {
			int st = scn.nextInt();
			int end = scn.nextInt();
			int k = Math.abs(end - st);
			int i=1;int count=1;int num=1;
			while(true) {
				if(num==k) {
				System.out.println(i);
				break;
				}
				
				if(count>=(i+1)/2) {
					count=0;
					i++;
				}
				count++;
				num++;
			}
		}
	
	}
}