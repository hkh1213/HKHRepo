import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
			System.out.println("�⵵�� �Է��Ͻÿ� : ");
			int a=scn.nextInt();
			if(a%4==0&&a%100!=0||a%400==0) {
				System.out.println(a+"���� �����Դϴ�.");
			}else {
				System.out.println(a+"���� ������ �ƴմϴ�.");
			}
		
	}

}
