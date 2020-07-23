package BakJoon;

import java.util.Scanner;

public class B1012 {
	private static int N=8;
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int i=0;
		int n=scn.nextInt();
		while(i<n) {
			int col=scn.nextInt();
			int row=scn.nextInt();
			int[][] grid= new int[col][row];
			int count=scn.nextInt();
			for(int j=0;j<count;j++) {
				int y=scn.nextInt();
				int x=scn.nextInt();
			}
		}
	}
			/*{
			{0,0,0,0,0,0,0,1},
			{0,1,1,0,1,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,0,0,1,1,0,0},
			{0,1,1,1,0,0,1,1},
			{0,1,0,0,0,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,1,1,0,1,0,0}
			};*/
	private static int BACKGROUND_COLOUR =0;
	private static int IMAGE_COLOUR =1;
	private static int ALREADY_COUNTED=2;
	
	public static int countCells(int x,int y) {
		if(x<0||y<0||x>=N||y>=N)
			return 0;
		else if (grid[x][y]!= IMAGE_COLOUR)
			return 0;
		else {
			grid[x][y]=ALREADY_COUNTED;
			return 1+countCells(x,y+1)+
					countCells(x-1,y)+
					countCells(x,y-1)+
					countCells(x+1,y);
		}
	}


}
