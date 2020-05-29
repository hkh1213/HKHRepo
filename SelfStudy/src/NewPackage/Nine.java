package NewPackage;

import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a,b,c,d;
		int hap;
		
		System.out.println("첫번쨰 숫자를 입력하세요 :");
		a=scn.nextInt();
		System.out.println("두번쨰 숫자를 입력하세요 :");
		b=scn.nextInt();
		System.out.println("세번쨰 숫자를 입력하세요 :");
		c=scn.nextInt();
		System.out.println("네번쨰 숫자를 입력하세요 :");
		d=scn.nextInt();
		
		hap=a+b+c+d;
		System.out.println("네 수의합은 : "+hap);
		
		int[] arr= new int[4];
		int hap2;
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		arr[3]=d;
		
		/*
		 * System.out.println("첫번쨰 숫자를 입력하세요 :"); arr[0]=scn.nextInt();
		 * System.out.println("두번쨰 숫자를 입력하세요 :"); arr[1]=scn.nextInt();
		 * System.out.println("세번쨰 숫자를 입력하세요 :"); arr[2]=scn.nextInt();
		 * System.out.println("네번쨰 숫자를 입력하세요 :"); arr[3]=scn.nextInt();
		 */
		hap2=arr[0]+arr[1]+arr[2]+arr[3];
		System.out.println("네 배열안의 값의 합은 : "+hap2);
		
		
	}

}
