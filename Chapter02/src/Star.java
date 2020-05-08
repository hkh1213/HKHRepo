import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star{

   public static void main(String[] args) {
      String num;
      int num2;
      int cend;
      int st=0, end=0;
      
      try {
         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
         num=buf.readLine();
         num2=Integer.parseInt(num);
         cend=(num2+1)/2;
         st=end=cend;
         for (int i = 1; i <= num2; i++) {
            for (int j = 1; j <= end; j++) {
               if (j<st) {
                  System.out.print(" ");
               }else System.out.print("*");
            }
            if (i<cend) {
               st--;
               end++;
            }else {
               st++;
               end--;
            }
            System.out.println();
         }
      } catch (IOException e) {
         e.printStackTrace();
         System.out.println(e.getMessage());
      }
   }
}