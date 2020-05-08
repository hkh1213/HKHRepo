import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int r=scn.nextInt();
		int g=scn.nextInt();
		int b=scn.nextInt();
		int count =0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<g;j++) {
				for(int k=0;k<b;k++) {
					System.out.printf("%d %d %d\n",i,j,k);
					count++;
				}
			}
		}
		System.out.println(count);
		scn.close();
	}
}
