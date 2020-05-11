
import java.util.Scanner;

public class Divword {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	String a;
	a = scn.nextLine();
	int len = a.length();
	
	for(int i=0; i<len;i++) {
		System.out.println("\'"+a.charAt(i)+"\'");
	}
	
	}
}