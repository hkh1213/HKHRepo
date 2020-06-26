package Algorithm;

import java.util.Scanner;

public class Algorithm2 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int x,n;
		x=scn.nextInt();
		n=scn.nextInt();
		int result=factorial(x,n);
		System.out.println(result);
	}

	public static int factorial(int a, int b) {
		if(b<=0)
			return 1;
		else
		return b*factorial(a,b-1);
	}

}
