package BakJoon;

import java.util.Scanner;

public class BakJoon1011 {
static int ans=0;
static int n=0;
public static void main(String[] args) {

	Scanner scn = new Scanner(System.in);
	
	int count = scn.nextInt();
		for(int i=0;i<count;i++) {
			int st = scn.nextInt();
			int end = scn.nextInt();
		
		while(true) {
			n++;
		if((2*sol(n-1)-1)>=end-st) {
			System.out.println(2*n-2);
			break;
		}
		else if((2*sol(n-1))>=end-st) {
			System.out.println(2*n-2);
			break;
		}
		else if(1+(2*sol(n-1))>=end-st) {
			System.out.println(2*n-1);
			break;
		}
		else if((sol(n)+sol(n-1))>=end-st) {
			System.out.println(2*n-1);
			break;
			}
		}
		n=0;
		}
		
		
		}

	public static int sol(int n) {
		if(n==0)
			return ans;
		else 
			return n+sol(n-1);
		
	}
	

}