
import java.io.IOException;
import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		int a, b;
		char ch;
		while (true) {
			System.out.println("1������");
			a = scn.nextInt();
			System.out.println("2������");
			b = scn.nextInt();
			System.out.println("������");
			ch = (char) System.in.read();

			switch (ch) {
			case '+':
				System.out.printf("%d + %d = %d�Դϴ�.\n", a, b, a + b);
				break;
			case '-':
				System.out.printf("%d - %d = %d�Դϴ�.\n", a, b, a - b);
				break;
			case '*':
				System.out.printf("%d * %d = %d�Դϴ�.\n", a, b, a * b);
				break;
			case '/':
				System.out.printf("%d / %d = %d�Դϴ�.\n", a, b, a / b);
				break;
			case '%':
				System.out.printf("%d % %d = %d�Դϴ�.\n", a, b, a % b);
				break;
				default:
					System.out.println("������ ����");
			}
		}

	}

}
