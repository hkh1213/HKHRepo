import java.util.Scanner;
import java.io.*;

public class Splitstudy2 {
   public static void main(String[] ar) throws IOException{
  Scanner scn = new Scanner(System.in);
       String a =scn.nextLine();
       String[] array = a.split(" ");
       long b = Long.parseLong(array[0]);
       long c = Long.parseLong(array[1]);
       System.out.println(b+c);
       System.out.println(b-c);
       System.out.println(b*c);
       System.out.println(b/c);
       System.out.println(b%c);
       System.out.printf("%.2f",(double)b/c);
       
   }
  
}