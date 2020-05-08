import java.util.Scanner;

public class ddddd{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
String v = scn.nextLine();
String[] array = v.split("\\*");

int a = Integer.parseInt(array[0]);
int b = Integer.parseInt(array[1]);
System.out.print(a+b);
   }
}
