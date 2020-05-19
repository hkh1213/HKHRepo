import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	String s=scn.nextLine();
	  double sum=0;
	for(int i=0;i<s.length();i++) {
		sum=Character.getNumericValue(s.charAt(i))*Math.pow(10, 4-i);
		System.out.println((int)sum);
	}
	}
}
