
import java.io.IOException;
import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		int a, b;
		char ch;
		while (true) {
			System.out.println("1번숫자");
			a = scn.nextInt();
			System.out.println("2번숫자");
			b = scn.nextInt();
			System.out.println("연산자");
			ch = (char) System.in.read();

			switch (ch) {
			case '+':
				System.out.printf("%d + %d = %d입니다.\n", a, b, a + b);
				break;
			case '-':
				System.out.printf("%d - %d = %d입니다.\n", a, b, a - b);
				break;
			case '*':
				System.out.printf("%d * %d = %d입니다.\n", a, b, a * b);
				break;
			case '/':
				System.out.printf("%d / %d = %d입니다.\n", a, b, a / b);
				break;
			case '%':
				System.out.printf("%d % %d = %d입니다.\n", a, b, a % b);
				break;
				default:
					System.out.println("연산자 오류");
			}
		}

	}

}
