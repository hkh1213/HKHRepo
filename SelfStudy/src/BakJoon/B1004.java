package BakJoon;

import java.util.Scanner;

public class B1004 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int i=0;
		int count=0;
		while(i<n) {
			int st[]=new int[2];
			st[0]=scn.nextInt();st[1]=scn.nextInt();
			int end[]=new int[2];
			end[0]=scn.nextInt();end[1]=scn.nextInt();
			int k=scn.nextInt();
			int arr[][]=new int[k][3];

			for(int j=0;j<k;j++) {
				
				for(int l=0;l<3;l++) {
					
					arr[j][l]=scn.nextInt();
					int stgob=(st[0]-arr[j][0])*(st[0]-arr[j][0])+(st[1]-arr[j][1])*(st[1]-arr[j][1]);
					int endgob=(end[0]-arr[j][0])*(end[0]-arr[j][0])+(end[1]-arr[j][1])*(end[1]-arr[j][1]);
					int Lgob=arr[j][2]*arr[j][2];
					
					if(l%2==0) {
					if(stgob<Lgob&&endgob>Lgob) {
						count+=1;
					}
				    if(stgob>Lgob&&endgob<Lgob) {
						count+=1;
					}
					}
					//System.out.println("count :"+count);
				}
			}
			System.out.println("count :"+count);
			count=0;
			i++;
		}
	}

}
