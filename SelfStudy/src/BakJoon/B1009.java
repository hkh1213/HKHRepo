package BakJoon;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class B1009 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	int a=scn.nextInt();
	int b=scn.nextInt();
	
	double k=Math.pow(a, b);
	BigDecimal bd =new BigDecimal(k);
	System.out.println(bd);
	System.out.println(k%10);
	
	}

}
