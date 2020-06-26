package StudyJava;

import java.util.Scanner;

public class Turret {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	  int n=scn.nextInt();

		int[] sol= new int[n];
	 for(int i=0;i<n;i++) {
		  int x1 = scn.nextInt();
          int y1 = scn.nextInt();
          int r1 = scn.nextInt();
          int x2 = scn.nextInt();
          int y2 = scn.nextInt();
          int r2 = scn.nextInt();
		  sol[i] = sl(x1, y1, r1, x2, y2, r2);
	 
	  }
	 for(int i=0;i<n;i++) {
	 System.out.println(sol[i]);
	 }
	 
}
public static int sl(int x1,int y1,int r1,int x2,int y2,int r2) {
	double r = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
	if(r1<r2) {
		int m=r1; r1=r2;r2=m;
	}
	 if(r==0&&r1==r2) {
			return -1;
		}
	if(r1+r2<r||r1-r2>r) {
		return 0;
	}
		
	else if(r1+r2==r||r1-r2==r) {
		return 1;
	}
		
	else if(r1+r2>r&&r1-r2<r) {
		return 2;
	}
		else {
			return -1;
		}
		
}
}

