package Pro.lv1;

import java.util.Scanner;

public class Pro12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb=new StringBuilder();
        StringBuilder sbs=new StringBuilder();
    
         for(int i=0;i<a;i++)
        	 sb.append("*");
         sb.append("\n");
         String s=sb.toString();
         
         for(int i=0;i<b;i++)
        	sbs.append(s);

         String ssb=sbs.toString();
         System.out.println(ssb);

			 
	}

}
