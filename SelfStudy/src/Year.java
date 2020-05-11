
import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String d;
		d = scn.nextLine();
		String[] array = d.split("\\.");
	String a = array[0];
	String b = array[1];
	String c = array[2];
	int i = Integer.parseInt(a);
	int j = Integer.parseInt(b);
	int k = Integer.parseInt(c);
	System.out.printf("%04d.%02d.%02d",i,j,k);
	}
}