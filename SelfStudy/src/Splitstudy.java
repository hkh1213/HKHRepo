import java.util.Scanner;

public class Splitstudy{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
String v = scn.nextLine();
String[] array = v.split(" ");

long a = Long.parseLong(array[0]);
long b = Long.parseLong(array[1]);
System.out.print(a+b);
   }
}