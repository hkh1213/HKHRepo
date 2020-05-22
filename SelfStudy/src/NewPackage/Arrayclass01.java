package NewPackage;

import java.util.Scanner;

public class Arrayclass01 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int[] arr=new int[4];
		int hap=0;
		int i;
		for(i=0;i<=3;i++) {
			System.out.printf("%d번째 숫자를 입력하세요 : ",i+1);
			arr[i]=scn.nextInt();
		}
		hap=arr[0]+arr[1]+arr[2]+arr[3];
		
		System.out.println("합계 ==>"+ hap);
	}

}
