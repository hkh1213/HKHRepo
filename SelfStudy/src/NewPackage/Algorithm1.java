package NewPackage;

import java.util.Scanner;

public class Algorithm1 {

	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		
		int k=scn.nextInt();
		System.out.println(k);

		int result=func(k);
		System.out.println(result);
	}
	public static int func(int n){
		
		if(n<=0)
			return 0;
		else
			return n+func(n-1);
		
	}

}
