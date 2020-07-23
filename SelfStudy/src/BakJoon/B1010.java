package BakJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class B1010 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);

		int num=scn.nextInt();
		int i=0;
		
		while(i<num) {
			int st=scn.nextInt();
			int end=scn.nextInt();
			System.out.println(ft(end).divide((ft(end-st).multiply(ft(st)))));
			
			i++;
		}
	}
	static BigInteger ft(int n) {
		BigInteger fac=BigInteger.ONE;
		for (int i = 1; i <= n; i++)
		      fac = fac.multiply(BigInteger.valueOf(i));

		    return fac;
	}

}
