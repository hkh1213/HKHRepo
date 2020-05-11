import java.util.Scanner;

public class Infinite02 {

	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
int a=scn.nextInt();

for(int i=1;i<=a;i++) {
	if(i%3==0) {
		System.out.print("");
	}else {
		System.out.print(i+" ");
	}
}
	}

}
