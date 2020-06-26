package Programmers;

public class Pro_2_1 {
	private static int N=4;

	private static int[][] grid= {
			{1,2,3,5},
			{5,6,7,8},
			{4,3,2,1},
			{10,1,5,8}
	};
	private static int ALREADY_COUNTED;
	static int count=0;
	public static int countCells(int x,int y) {
		if(x<0||y<0||x>=N||y>=N)
			return 0;
		else {
			ALREADY_COUNTED=grid[x][y];
			return ALREADY_COUNTED+countCells(x+1,y+1)+
					countCells(x+1,y+2)+
					countCells(x+1,y-2)+countCells(x+1,y+3)+
					countCells(x+1,y-3)+countCells(x+1,y-1);
			}
	}

	public static void main(String[] args) {
		System.out.println(countCells(0,2));
	}

}
